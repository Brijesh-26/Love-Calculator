package com.codewithharry.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.textclassifier.ConversationActions;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.Wave;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Random;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView t1;

    FirebaseDatabase rootNode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1= findViewById(R.id.name);
        ed2=findViewById(R.id.patner_name);
        Button b1= findViewById(R.id.know);
        t1= findViewById(R.id.result);
//        ProgressBar progressBar = (ProgressBar)findViewById(R.id.spin_kit);
//        Sprite wave = new Wave();
//        progressBar.setIndeterminateDrawable(wave);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(ed1.getText()) ){
                    ed1.setError("Field cannot be empty");
                    ed1.requestFocus();
                }
                else if(TextUtils.isEmpty(ed2.getText())){
                    ed2.setError("Field cannot be empty");
                    ed2.requestFocus();
                }


                else{
                    rootNode= FirebaseDatabase.getInstance();
                    DatabaseReference reference1= rootNode.getReference("lover1");
                    DatabaseReference reference2= rootNode.getReference("lover2");

                    String boy_name= ed1.getText().toString();
                    String girl_name= ed2.getText().toString();

                    reference1.setValue(boy_name);
                    reference2.setValue(girl_name);
//                    progressBar.setVisibility(View.GONE);

                    String url_love= "https://love-calculator.p.rapidapi.com/getPercentage?sname="+boy_name+"&fname="+girl_name;
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder()
                            .url(url_love)
                            .get()
                            .addHeader("x-rapidapi-host", "love-calculator.p.rapidapi.com")
                            .addHeader("x-rapidapi-key", "afbd916d49msh88caf9f503507ebp1118e7jsn076e55ead1b9")
                            .build();

                    client.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(Call call, IOException e) {
                            Toast.makeText(MainActivity.this, "error:" + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onResponse(Call call, Response response) throws IOException {

                            if (response.isSuccessful()) {
                                String resp = response.body().string();
                                MainActivity.this.runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        try {
                                            JSONObject jsonObject = new JSONObject(resp);
                                            String val1 = jsonObject.getString("percentage");
                                            String val2 = jsonObject.getString("result");
//                                            t1.setVisibility(View.VISIBLE);
                                            t1.setText(val1 + "%ge\n" + val2);
                                        } catch (JSONException e) {
                                            Toast.makeText(MainActivity.this, "error:" + e.getMessage(), Toast.LENGTH_SHORT).show();
                                            e.printStackTrace();
                                        }

                                    }
                                });
                            }
                        }


                    });
                }


            }
        });
    }
}
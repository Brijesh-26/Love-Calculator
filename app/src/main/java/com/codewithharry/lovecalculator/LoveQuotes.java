package com.codewithharry.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import com.codewithharry.lovecalculator.Adapters.ParentItemAdapter;
import com.codewithharry.lovecalculator.models.ChildItem;
import com.codewithharry.lovecalculator.models.ParentItem;

import java.util.ArrayList;
import java.util.List;


public class LoveQuotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_quotes);




        RecyclerView ParentRecyclerViewItem = findViewById(R.id.parent_recyclerview);

        // Initialise the Linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(LoveQuotes.this);

        // Pass the arguments
        // to the parentItemAdapter.
        // These arguments are passed
        // using a method ParentItemList()
        ParentItemAdapter parentItemAdapter = new ParentItemAdapter(ParentItemList());

        // Set the layout manager
        // and adapter for items
        // of the parent recyclerview
        ParentRecyclerViewItem.setAdapter(parentItemAdapter);
        ParentRecyclerViewItem.setLayoutManager(layoutManager);
    }

    private List<ParentItem> ParentItemList()
    {
        List<ParentItem> itemList = new ArrayList<>();

        ParentItem item = new ParentItem("Love Shayari", ChildItemList());
        itemList.add(item);

        ParentItem item1 = new ParentItem("Breakup Shayari", ChildItemList1());
        itemList.add(item1);

        ParentItem item2 = new ParentItem("Best Of Artists", ChildItemList2());
        itemList.add(item2);



        return itemList;
    }

    // Method to pass the arguments
    // for the elements
    // of child RecyclerView
    private List<ChildItem> ChildItemList()
    {
        List<ChildItem> ChildItemList
                = new ArrayList<>();

        ChildItemList.add(new ChildItem("Romantic Qoutes", R.drawable.romantic));
        ChildItemList.add(new ChildItem("For Your....", R.drawable.girlfriend));
        ChildItemList.add(new ChildItem("Heart", R.drawable.dil));
        ChildItemList.add(new ChildItem("Wine", R.drawable.beer_with_heart));
        ChildItemList.add(new ChildItem("Beauty", R.drawable.beer_with_beauty));

        return ChildItemList;


    }

    private List<ChildItem> ChildItemList1(){

        List<ChildItem> ChildItemList1= new ArrayList<>();

        ChildItemList1.add(new ChildItem("ankhein", R.drawable.aankhein));
        ChildItemList1.add(new ChildItem("aansoo", R.drawable.aansoo));
        ChildItemList1.add(new ChildItem("alone", R.drawable.alone));
        ChildItemList1.add(new ChildItem("bewafa", R.drawable.bewafa));
        ChildItemList1.add(new ChildItem("broken heart", R.drawable.broken_heart));
        ChildItemList1.add(new ChildItem("yaadein", R.drawable.yaadein));
        ChildItemList1.add(new ChildItem("sad", R.drawable.sad));

        return ChildItemList1;
    }

    private  List<ChildItem> ChildItemList2(){
        List<ChildItem> ChildItemList2= new ArrayList<>();

        ChildItemList2.add(new ChildItem("Rahat Indori", R.drawable.rahat_indori));
        ChildItemList2.add(new ChildItem("Ghalib", R.drawable.ghalib));
        ChildItemList2.add(new ChildItem("Faiz Ahamad", R.drawable.faiz));
        ChildItemList2.add(new ChildItem("Gulzar", R.drawable.gulzar));
        ChildItemList2.add(new ChildItem("Javed Akhtar", R.drawable.javed));
        ChildItemList2.add(new ChildItem("Bashir Badr", R.drawable.bashir));

        return  ChildItemList2;

    }


}
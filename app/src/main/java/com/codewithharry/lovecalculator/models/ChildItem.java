package com.codewithharry.lovecalculator.models;

public class ChildItem {


    // Declaration of the variable
    private String ChildItemTitle;
    private int ChildItemImage_model;

    // Constructor of the class
    // to initialize the variable*
//    public ChildItem(String childItemTitle)
//    {
//        this.ChildItemTitle = childItemTitle;
//    }
//
//    // Getter and Setter method
//    // for the parameter
//    public String getChildItemTitle()
//    {
//        return ChildItemTitle;
//    }
//
//    public void setChildItemTitle(
//            String childItemTitle)
//    {
//        ChildItemTitle = childItemTitle;
//    }


    public ChildItem(String childItemTitle, int childItemImage_model) {
        ChildItemTitle = childItemTitle;
        ChildItemImage_model = childItemImage_model;
    }

    public String getChildItemTitle() {
        return ChildItemTitle;
    }

    public void setChildItemTitle(String childItemTitle) {
        ChildItemTitle = childItemTitle;
    }

    public int getChildItemImage_model() {
        return ChildItemImage_model;
    }

    public void setChildItemImage_model(int childItemImage_model) {
        ChildItemImage_model = childItemImage_model;
    }
}

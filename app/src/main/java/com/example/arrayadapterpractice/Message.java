package com.example.arrayadapterpractice;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;

public class Message {

    private String mDescription;
    private String mTitle;
    private  String mPrice;
    private int mProductImage;

    public Message(String description,String title,String price,int productImage)
    {
        mDescription = description;
        mTitle = title;
        mPrice = price;
        mProductImage = productImage;
    }

    public String getDescription(){
        return mDescription;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getPrice(){
        return mPrice;
    }

    public int getProductImage(){
        return mProductImage;
    }

}

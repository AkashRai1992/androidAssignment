package com.example.akash.androidassignment.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by akash on 5/8/16.
 */
public class Item implements Serializable {
    public String label;
    public String image;
    @SerializedName("web-url")
    public String weburl;
    public String image_url;
}

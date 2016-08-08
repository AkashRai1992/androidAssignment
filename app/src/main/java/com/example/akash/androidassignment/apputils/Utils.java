package com.example.akash.androidassignment.apputils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by akash on 6/8/16.
 */
public class Utils {
    public static void downloadImage(Context context, String url, ImageView view) {
        Glide.with(context).load(url).diskCacheStrategy(DiskCacheStrategy.RESULT).into(view);
    }

    public static void downloadImageandResize(Context context, String url, ImageView view) {
        Glide.with(context).load(url).diskCacheStrategy(DiskCacheStrategy.RESULT).fitCenter().into(view);
    }
}

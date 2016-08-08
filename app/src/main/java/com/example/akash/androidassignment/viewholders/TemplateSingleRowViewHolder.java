package com.example.akash.androidassignment.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.akash.androidassignment.R;
import com.example.akash.androidassignment.apputils.Utils;
import com.example.akash.androidassignment.models.ProductItem;

import butterknife.Bind;


public class TemplateSingleRowViewHolder extends BaseViewHolder {

    @Bind(R.id.product_image)
    ImageView productImage;

    @Bind(R.id.product_label)
    TextView productLabel;


    public TemplateSingleRowViewHolder(Context context, View itemView) {
        super(context, itemView);
    }

    @Override
    public void setData(ProductItem productItem) {
        if (productItem != null) {
            productLabel.setText(productItem.label);
            Utils.downloadImage(getContext(), productItem.image, productImage);
        }

    }
}
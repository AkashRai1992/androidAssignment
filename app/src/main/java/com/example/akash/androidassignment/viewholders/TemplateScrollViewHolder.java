package com.example.akash.androidassignment.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.akash.androidassignment.R;
import com.example.akash.androidassignment.apputils.Utils;
import com.example.akash.androidassignment.models.Item;
import com.example.akash.androidassignment.models.ProductItem;

import java.util.List;

import butterknife.Bind;

/**
 * Created by akash on 5/8/16.
 */
public class TemplateScrollViewHolder extends BaseViewHolder {

    @Bind(R.id.product_container)
    LinearLayout productContainer;


    public TemplateScrollViewHolder(Context context, View itemView) {
        super(context, itemView);
    }

    @Override
    public void setData(ProductItem productItem) {
        if (productItem != null && productItem.items != null && productItem.items.size() > 0) {
            List<Item> itemList = productItem.items;
            for (int i = 0; i < itemList.size(); i++) {
                Item item = itemList.get(i);
                inflateAndAddView(item);
            }

        }
    }

    private void inflateAndAddView(Item item) {
        View element = inflateView(productContainer, R.layout.template_type_2_item);
        ImageView iv = (ImageView) element.findViewById(R.id.product_image);
        TextView tv = (TextView) element.findViewById(R.id.product_label);
        Utils.downloadImage(getContext(), item.image, iv);
        tv.setText(item.label);
        productContainer.addView(element);
    }
}

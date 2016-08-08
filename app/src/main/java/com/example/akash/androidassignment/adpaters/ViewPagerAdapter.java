package com.example.akash.androidassignment.adpaters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.akash.androidassignment.R;
import com.example.akash.androidassignment.apputils.Utils;
import com.example.akash.androidassignment.models.Item;

import java.util.List;


/**
 * This adapter is used for inflating views in template type 3
 * Screen view pager
 *
 * @author Akash Rai
 * @version 1.0
 * @since 1.0
 */
public class ViewPagerAdapter extends PagerAdapter {
    private Context mContext;
    private List<Item> itemList;

    public ViewPagerAdapter(Context context, List<Item> items) {
        mContext = context;
        itemList = items;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        Item item = itemList.get(position);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.template_type_3_item, collection, false);
        ImageView productImage = (ImageView) layout.findViewById(R.id.product_image);
        TextView productLabel = (TextView) layout.findViewById(R.id.product_label);
        Utils.downloadImageandResize(mContext, item.image, productImage);
        productLabel.setText(item.label);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return itemList == null ? 0 : itemList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


}

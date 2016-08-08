package com.example.akash.androidassignment.viewholders;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.akash.androidassignment.R;
import com.example.akash.androidassignment.adpaters.ViewPagerAdapter;
import com.example.akash.androidassignment.models.ProductItem;
import com.example.akash.androidassignment.view.CirclePageIndicator;

import butterknife.Bind;

/**
 * Created by akash on 5/8/16.
 */
public class TemplateViewPagerHolder extends BaseViewHolder {

    @Bind(R.id.vp_product_list)
    ViewPager prroductListViewPager;

    @Bind(R.id.page_indicator)
    CirclePageIndicator pageIndicator;
    private Context mContext;


    public TemplateViewPagerHolder(Context context, View itemView) {
        super(context, itemView);
        mContext=context;

    }

    @Override
    public void setData(ProductItem productItem) {
            prroductListViewPager.setAdapter(new ViewPagerAdapter(mContext,productItem.items));
            pageIndicator.setViewPager(prroductListViewPager);
        }

    }


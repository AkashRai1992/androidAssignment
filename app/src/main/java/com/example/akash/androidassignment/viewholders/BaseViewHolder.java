package com.example.akash.androidassignment.viewholders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akash.androidassignment.models.ProductItem;

import butterknife.ButterKnife;

/**
 * This is base view holder of all ViewHolders in application.
 * <p/>
 * Following common things are handled:-
 * <ul>
 * <li>abstract method set data for each row</li>

 * </ul>
 *
 * @author Akash Rai
 * @version 1.0
 * @since 1.0
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    private Context mContext;

    public BaseViewHolder(Context context, View itemView) {
        super(itemView);
        mContext = context;
        ButterKnife.bind(this, itemView);
    }

    /**
     *
     * setData is abstarct method
     * @param productItem data for each list item
     */
    abstract public void setData(ProductItem productItem) ;

    public static View inflateView(ViewGroup parentView, int layoutResId) {
        LayoutInflater layoutInflater = (LayoutInflater) parentView.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return layoutInflater.inflate(layoutResId, parentView, false);
    }

    /**
     *
     * @return context
     */
    protected Context getContext() {
        return mContext;
    }
}

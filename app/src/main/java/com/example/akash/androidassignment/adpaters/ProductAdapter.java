package com.example.akash.androidassignment.adpaters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.akash.androidassignment.R;
import com.example.akash.androidassignment.models.ProductItem;
import com.example.akash.androidassignment.viewholders.BaseViewHolder;
import com.example.akash.androidassignment.viewholders.TemplateScrollViewHolder;
import com.example.akash.androidassignment.viewholders.TemplateSingleRowViewHolder;
import com.example.akash.androidassignment.viewholders.TemplateViewPagerHolder;

import java.util.Collection;
import java.util.List;


public class ProductAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private static final String PRODUCT_TYPE_TEMPLEATE_1 = "product-template-1";
    private static final String PRODUCT_TYPE_TEMPLEATE_2 = "product-template-2";
    private static final String PRODUCT_TYPE_TEMPLEATE_3 = "product-template-3";

    private static final int TEMPLEATE_1 = 1;
    private static final int TEMPLEATE_2 = 2;
    private static final int TEMPLEATE_3 = 3;

    private List<ProductItem> productItemList;
    private Context mContext;

    public ProductAdapter(Context context, Collection<ProductItem> mNewsItem) {
        this.productItemList = (List)mNewsItem;
        mContext = context;

    }

    @Override
    public int getItemViewType(int position) {
        String productType = productItemList.get(position).template;
        if (productType.equalsIgnoreCase(PRODUCT_TYPE_TEMPLEATE_1))
            return TEMPLEATE_1;
        else if (productType.equalsIgnoreCase(PRODUCT_TYPE_TEMPLEATE_2))
            return TEMPLEATE_2;
        else
            return TEMPLEATE_3;

    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TEMPLEATE_1)
            return new TemplateSingleRowViewHolder(mContext, BaseViewHolder.inflateView(parent, R.layout.template_type_1));
        else if (viewType == TEMPLEATE_2)
            return new TemplateScrollViewHolder(mContext, BaseViewHolder.inflateView(parent, R.layout.template_type_2));
        return new TemplateViewPagerHolder(mContext, BaseViewHolder.inflateView(parent, R.layout.template_type_3));
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(productItemList.get(position));
    }

    @Override
    public int getItemCount() {
        return productItemList == null ? 0 : productItemList.size();
    }


}

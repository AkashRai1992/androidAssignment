package com.example.akash.androidassignment.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.akash.androidassignment.R;
import com.example.akash.androidassignment.adpaters.ProductAdapter;
import com.example.akash.androidassignment.models.ProductItem;
import com.example.akash.androidassignment.ui.BaseActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Collection;

import butterknife.Bind;

/**
 * This is the main activity which is displayed  in application.

 * <li>Showes the product list in the recyler view</li>

 * </ul>
 *
 * @author Akash Rai
 * @version 1.0
 * @since 1.0
 */

public class HomeActivity extends BaseActivity {

    @Bind(R.id.recycler_view)
    RecyclerView rvProductList;

    Collection<ProductItem> mProductItemList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        parseJsonFile();
        showHomePageData();

    }

    /**
     * @return returns the Json String parsed from the asset file
     */
    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("sample.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }


    public void parseJsonFile() {
        String response = loadJSONFromAsset();
        Gson gson = new Gson();
        Type collectionType = new TypeToken<Collection<ProductItem>>() {
        }.getType();
        mProductItemList = gson.fromJson(response, collectionType);
    }

    public void showHomePageData() {
        rvProductList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ProductAdapter productAdapter = new ProductAdapter(getApplicationContext(), mProductItemList);
        rvProductList.setAdapter(productAdapter);
    }
}

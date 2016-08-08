package com.example.akash.androidassignment.ui;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * This is base activity of all activities in application.
 * <p/>
 * Following common things are handled:-
 * <ul>
 * <li>Handles inflation of concrete activity layout and setting in common layout</li>

 * </ul>
 *
 * @author Akash Rai
 * @version 1.0
 * @since 1.0
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }
}

package com.example.devender.instagram.Cart;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.devender.instagram.R;
import com.example.devender.instagram.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;


public class CartActivity extends AppCompatActivity
{
    private static final String TAG = "CartActivity";
    private static final int ACTIVITY_NUM=2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: starting");
        setupBottomNavView();
    }

    private void setupBottomNavView()
    {
        Log.d(TAG, "setupBottomNavView: setting up bottom navview");
        BottomNavigationViewEx bottomnavbar=(BottomNavigationViewEx)findViewById(R.id.bottom_navbar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomnavbar);
        BottomNavigationViewHelper.enableNavigation(CartActivity.this,bottomnavbar);
        Menu menu=bottomnavbar.getMenu();
        MenuItem menuitem=menu.getItem(ACTIVITY_NUM);
        menuitem.setChecked(true);
    }
}

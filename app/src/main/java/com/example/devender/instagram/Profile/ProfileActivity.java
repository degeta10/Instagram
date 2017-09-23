package com.example.devender.instagram.Profile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.devender.instagram.R;
import com.example.devender.instagram.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Devender on 21-09-2017.
 */

public class ProfileActivity extends AppCompatActivity
{
    private static final String TAG = "ProfileActivity";
    private static final int ACTIVITY_NUM=3;

    protected void onCreate(Bundle savedInstanceState) {
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
        BottomNavigationViewHelper.enableNavigation(ProfileActivity.this,bottomnavbar);
        Menu menu=bottomnavbar.getMenu();
        MenuItem menuitem=menu.getItem(ACTIVITY_NUM);
        menuitem.setChecked(true);
    }
}

package com.example.devender.instagram.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.devender.instagram.Cart.CartActivity;
import com.example.devender.instagram.Home.HomeActivity;
import com.example.devender.instagram.Profile.ProfileActivity;
import com.example.devender.instagram.R;
import com.example.devender.instagram.Search.SearchActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Devender on 21-09-2017.
 */

public class BottomNavigationViewHelper
{
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx navbar)
    {
        navbar.enableAnimation(false);
        navbar.enableShiftingMode(false);
        navbar.enableItemShiftingMode(false);
        navbar.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context,BottomNavigationViewEx view)
    {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch(item.getItemId())
                {

                    case R.id.ic_near_me:
                        Intent intent2= new Intent(context, HomeActivity.class);
                        context.startActivity(intent2);
                        Toast.makeText(context,"Home",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.ic_search:
                        Intent intent1= new Intent(context, SearchActivity.class);
                        context.startActivity(intent1);
                        Toast.makeText(context,"Search",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.ic_cart:
                        Intent intent4= new Intent(context, CartActivity.class);
                        context.startActivity(intent4);
                        Toast.makeText(context,"Cart",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.ic_account:
                        Intent intent3= new Intent(context, ProfileActivity.class);
                        context.startActivity(intent3);
                        Toast.makeText(context,"Account",Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }
}

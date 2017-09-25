package com.example.devender.instagram.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.devender.instagram.R;
import com.example.devender.instagram.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;


public class HomeActivity extends AppCompatActivity {

    ListView list;
    private static final String TAG = "HomeActivity";
    private static final int ACTIVITY_NUM=0;

    int[] IMAGES={R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,};
    int[] STAR={R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,R.drawable.ic_star,};
    String NAMES[]={"item1","item2","item3","item4","item5","item6","item7","item8","item9","item10","item11","item12","item13","item14","item15"};
    String DESCRIPTION[]={"item1","item2","item3","item4","item5","item6","item7","item8","item9","item10","item11","item12","item13","item14","item15"};
    String PRICE[]={"Rs.80","Rs.80","Rs.80","Rs.80","Rs.80","Rs.80","Rs.80","Rs.80","Rs.80","Rs.80","Rs.80","Rs.80","Rs.80","Rs.80","Rs.80",};
    String TIME[]={"20mins","20mins","20mins","20mins","20mins","20mins","20mins","20mins","20mins","20mins","20mins","20mins","20mins","20mins","20mins",};
    String RATING[]={"3.9","3.9","3.9","3.9","3.9","3.9","3.9","3.9","3.9","3.9","3.9","3.9","3.9","3.9","3.9",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: starting");
        list=(ListView) findViewById(R.id.ListView);

        CustomAdapter customadapter=new CustomAdapter();
        list.setAdapter(customadapter);

        setupBottomNavView();
    }

    private void setupBottomNavView()
    {
        Log.d(TAG, "setupBottomNavView: setting up bottom navview");
        BottomNavigationViewEx bottomnavbar=(BottomNavigationViewEx)findViewById(R.id.bottom_navbar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomnavbar);
        BottomNavigationViewHelper.enableNavigation(HomeActivity.this,bottomnavbar);
        Menu menu=bottomnavbar.getMenu();
        MenuItem menuitem=menu.getItem(ACTIVITY_NUM);
        menuitem.setChecked(true);
    }

    class CustomAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView =getLayoutInflater().inflate(R.layout.listview_layout,null);

            ImageView image=(ImageView)convertView.findViewById(R.id.image);
            ImageView star=(ImageView)convertView.findViewById(R.id.star);
            TextView name=(TextView)convertView.findViewById(R.id.name);
            TextView description=(TextView)convertView.findViewById(R.id.description);
            TextView price=(TextView)convertView.findViewById(R.id.price);
            TextView rating=(TextView)convertView.findViewById(R.id.rating);
            TextView time=(TextView)convertView.findViewById(R.id.time);

            image.setImageResource(IMAGES[position]);
            star.setImageResource(STAR[position]);
            name.setText(NAMES[position]);
            description.setText(DESCRIPTION[position]);
            price.setText(PRICE[position]);
            rating.setText(RATING[position]);
            time.setText(TIME[position]);
            return convertView;
        }
    }
}

package com.example.devender.instagram.Search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import com.example.devender.instagram.R;

import java.util.ArrayList;

/**
 * Created by Devender on 21-09-2017.
 */

public class SearchActivity extends AppCompatActivity
{
    ListView list;
    SearchView sv;
   ArrayList<String> items;
    String NAMES[]={"item1","item2","item3","item4","item5","item6","item7","item8","item9","item10","item11","item12","item13","item14","item15","item16","item17","item18",};

    private static final String TAG = "SearchActivity";
    private static final int ACTIVITY_NUM=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Log.d(TAG, "onCreate: starting");
        list=(ListView)findViewById(R.id.search_list_view);
        sv=(SearchView)findViewById(R.id.search_bar);
        items=new ArrayList<>();
        //
        items.add("dev");
        items.add("devan");
        items.add("van");
        items.add("van kallikal");
        items.add("devarajan");
        items.add("devarajankozhi");
        items.add("devarajaprathabavarma");
        items.add("nikadedevji");
        items.add("yesiamabengali");
        items.add("fuckyounigga");

        //

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text=list.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),""+text,Toast.LENGTH_SHORT).show();
            }
        });

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener()
        {
            @Override
            public boolean onQueryTextSubmit(String query)
            {
              return false;
            }

            @Override
            public boolean onQueryTextChange(String newText)
            {
                ArrayList<String> templist=new ArrayList<>();
                for(String temp : items){
                    if(temp.toLowerCase().contains(newText.toLowerCase())){

                        templist.add(temp);
                    }
                }
                ArrayAdapter<String> adapter=new ArrayAdapter<String>(SearchActivity.this,android.R.layout.simple_list_item_1,templist);
                list.setAdapter(adapter);
              return true;
            }
        });
    }
}

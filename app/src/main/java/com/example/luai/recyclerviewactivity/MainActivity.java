package com.example.luai.recyclerviewactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.luai.recyclerviewactivity.adapters.CommonAdapter;

public class MainActivity extends AppCompatActivity {

    public static final String INTENT_KEY_INDEX = "index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (14): Use the RecyclerView rv_vertical
        // TODO (15): Use a LinearLayoutManager for the recycler view with VERTICAL orientation


        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CommonAdapter(10, CommonAdapter.VERTICAL, '-', this));

    }

    // TODO (16): Make the activity implement the ListItemClickListener interface defined in the adapter
    // TODO (17): In the method onListItemClick(int clickedItemIndex), create an intent to go from this activity to SecondActivity
    // TODO (18): Put extra for intent with key INTENT_KEY_INDEX and value (char) (clickedItemIndex + '0'), then start the activity using this intent

}

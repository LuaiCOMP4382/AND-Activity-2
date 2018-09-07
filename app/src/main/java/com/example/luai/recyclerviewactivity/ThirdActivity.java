package com.example.luai.recyclerviewactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.luai.recyclerviewactivity.adapters.CommonAdapter;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        // TODO (21): Use getCharExtra on the intent to get the INTENT_KEY_INDX value and store it in the var level

        // TODO (22): Use the RecyclerView rv_grid
        // TODO (23): Use a GridLayoutManager and put the spanCount 2


        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CommonAdapter(10, CommonAdapter.GRID, level, null));

    }
}

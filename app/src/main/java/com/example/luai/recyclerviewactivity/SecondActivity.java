package com.example.luai.recyclerviewactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.luai.recyclerviewactivity.adapters.CommonAdapter;

public class SecondActivity extends AppCompatActivity implements CommonAdapter.ListItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        // TODO (13): Use getCharExtra on the intent to get the INTENT_KEY_INDEX value and store it in the var level


        RecyclerView recyclerView = findViewById(R.id.rv_horizontal);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CommonAdapter(10, CommonAdapter.HORIZONTAL, level, this));

    }

    @Override
    public void onListItemClick(int clickedItemIndex) {

        Intent intent = new Intent(this, ThirdActivity.class);

        intent.putExtra(MainActivity.INTENT_KEY_INDEX, (char) (clickedItemIndex + '0'));

        startActivity(intent);

    }
}
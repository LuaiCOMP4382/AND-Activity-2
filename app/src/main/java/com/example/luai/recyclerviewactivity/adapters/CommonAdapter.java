package com.example.luai.recyclerviewactivity.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.luai.recyclerviewactivity.R;

public class CommonAdapter extends RecyclerView.Adapter<CommonAdapter.NumberViewHolder> {

    public static final byte VERTICAL = 0;
    public static final byte HORIZONTAL = 1;
    public static final byte GRID = 2;

    private int mNumberOfItems;
    private byte mType;
    private char mLevel;

    // TODO (1): Define an interface called ListItemClickListner
    // TODO (2): In the interface, define a void method called onListItemClick that takes an integer (index)
    // TODO (3): Define a variable (listItemClickListener) of the defined interface
    // TODO (4): Define a constructor to initiliaze number of items, type, level and listItemClickListener


    // TODO (10): Define the three methods for the adapter

    // TODO (11): In onCreateViewHolder, check type's value:
    // TODO (11a): If it's VERTICAL, the id for layout to inflate is vertical_list_item
    // TODO (11b): If it's HORIZONTAL, the id for layout to inflate is horizontal_list_item
    // TODO (11c): If it's GRID, the id for layout to inflate is grid_list_item

    // TODO (12): In onBindViewHolder, call the view holder's bind method you defined
    // TODO (13): In getItemCount, just return the number of items

    // TODO (8): Make the NumberViewHolder implement View.OnClickListener. In onClick method, call listItemClickListener's method, and pass in adapter's position
    class NumberViewHolder extends RecyclerView.ViewHolder {

        // TODO (5): Define a text view variable for the view holder

        NumberViewHolder(View itemView, byte type) {
            super(itemView);

            // TODO (6): For the constructor, put in the parameters an integer called type

            // TODO (7): In the constructor, initialize the text view for the view holder. Check type's value:
            // TODO (7a): If it's VERTICAL, the id for text view is tv_vertical
            // TODO (7b): If it's HORIZONTAL, the id for text view is tv_horizontal
            // TODO (7c): If it's GRID, the id for text view is tv_grid
            int textViewId = R.id.tv_vertical;
            switch (type) {

            }

        }

        // TODO (9): Define the bind method to set the text for the text view. Pass in int index and char level, and set the text to (level + "" + index)

    }

}

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

    private ListItemClickListener mListItemClickListener;

    public interface ListItemClickListener {
        // TODO (1): Define void method called onListItemClick that takes an integer (clickedItemIndex)

    }

    // TODO (2): Define a constructor to initiliaze number of items, type, level and listItemClickListener


    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // TODO (6): In onCreateViewHolder, check type's value:
        // TODO (6a): If it's VERTICAL, the id for layout to inflate is vertical_list_item
        // TODO (6b): If it's HORIZONTAL, the id for layout to inflate is horizontal_list_item
        // TODO (6c): If it's GRID, the id for layout to inflate is grid_list_item

        int layoutId = R.layout.vertical_list_item;
        switch (mType) {

            case VERTICAL:
                layoutId = R.layout.vertical_list_item;
                break;

        }


        View view = inflater.inflate(layoutId, parent, false);

        return new NumberViewHolder(view, mType);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        // TODO (7): In onBindViewHolder, call the view holder's bind method you defined

    }

    @Override
    public int getItemCount() {
        // TODO (8): In getItemCount, just return the number of items

    }

    // TODO (4): Make the NumberViewHolder implement View.OnClickListener. In onClick, call listItemClickListener's method
    class NumberViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextViewVertical;

        NumberViewHolder(View itemView, byte type) {
            super(itemView);

            // TODO (3): In the constructor, initialize the text view for the view holder. Check type's value:
            // TODO (3a): If it's VERTICAL, the id for text view is tv_vertical
            // TODO (3b): If it's HORIZONTAL, the id for text view is tv_horizontal
            // TODO (3c): If it's GRID, the id for text view is tv_grid

            int textViewId = R.id.tv_vertical;
            switch (type) {

                case VERTICAL:
                    textViewId = R.id.tv_vertical;
                    break;

            }

            mTextViewVertical = itemView.findViewById(textViewId);

            itemView.setOnClickListener(this);

        }

        private void bind(int index, char level) {
            // TODO (5): Define the bind method to set the text for the text view (level + "" + index)

        }

    }

}

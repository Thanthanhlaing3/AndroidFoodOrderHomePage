package com.uigitdev.foodorder.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.uigitdev.foodorder.R;

public class MViewHolder extends RecyclerView.ViewHolder {
    public RelativeLayout item_button;
    public ImageView item_icon;
    public TextView item_parent_title;
    public RelativeLayout item_info_parent;
    public RelativeLayout item_order_info_button;
    public RelativeLayout item_order_location_button;
    public RelativeLayout item_order_button;
    public CardView item_card_parent;

    public MViewHolder(@NonNull View itemView) {
        super(itemView);
        item_button = itemView.findViewById(R.id.item_button);
        item_icon = itemView.findViewById(R.id.item_icon);
        item_parent_title = itemView.findViewById(R.id.item_parent_title);
        item_info_parent = itemView.findViewById(R.id.item_info_parent);
        item_order_info_button = itemView.findViewById(R.id.item_order_info_button);
        item_order_location_button = itemView.findViewById(R.id.item_order_location_button);
        item_order_button = itemView.findViewById(R.id.item_order_button);
        item_card_parent = itemView.findViewById(R.id.item_card_parent);
    }
}

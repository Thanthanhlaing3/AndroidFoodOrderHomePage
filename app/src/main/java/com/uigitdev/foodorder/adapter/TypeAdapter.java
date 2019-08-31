package com.uigitdev.foodorder.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.uigitdev.foodorder.R;
import com.uigitdev.foodorder.model.TypeItem;
import com.uigitdev.foodorder.viewholder.MViewHolder;

import java.util.ArrayList;

public class TypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<TypeItem> typeItems;

    public TypeAdapter(Context context, ArrayList<TypeItem> typeItems) {
        this.context = context;
        this.typeItems = typeItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type, parent, false);
        return new MViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        setItemIcon(((MViewHolder) holder).item_icon, typeItems.get(position).getIconId());
        setItemTitle(((MViewHolder) holder).item_parent_title, typeItems.get(position).getTitle());
        isOpened(((MViewHolder) holder).item_info_parent, ((MViewHolder) holder).item_card_parent, ((MViewHolder) holder).item_parent_title, typeItems.get(position).isOpened());
        setOnItemClick(((MViewHolder) holder).item_button, position);
    }

    @Override
    public int getItemCount() {
        return typeItems.size();
    }

    private void setItemIcon(ImageView imageView, int image_id) {
        imageView.setBackgroundResource(image_id);
    }

    private void setItemTitle(TextView textView, String text) {
        textView.setText(text);
    }

    @SuppressLint("ResourceType")
    private void isOpened(RelativeLayout item_info_parent, CardView item_card_parent, TextView item_parent_title, boolean isOpened) {
        if (isOpened) {
            item_info_parent.setVisibility(View.VISIBLE);
            item_card_parent.setCardBackgroundColor(Color.parseColor(context.getString(R.color.colorWhite)));
            item_parent_title.setTypeface(null, Typeface.BOLD);
        } else {
            item_info_parent.setVisibility(View.GONE);
            item_card_parent.setCardBackgroundColor(Color.parseColor(context.getString(R.color.colorBackground)));
            item_parent_title.setTypeface(null, Typeface.NORMAL);
        }
    }

    private void setOnItemClick(RelativeLayout relativeLayout, final int position) {
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (typeItems.get(position).isOpened()) {
                    typeItems.get(position).setOpened(false);
                } else {
                    for (int i = 0; i < typeItems.size(); i++) {
                        if (i == position) {
                            typeItems.get(i).setOpened(true);
                        } else {
                            typeItems.get(i).setOpened(false);
                        }
                    }
                }
                notifyDataSetChanged();
            }
        });
    }
}

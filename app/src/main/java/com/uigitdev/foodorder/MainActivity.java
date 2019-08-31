package com.uigitdev.foodorder;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uigitdev.foodorder.adapter.TypeAdapter;
import com.uigitdev.foodorder.model.TypeItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<TypeItem> typeItems;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAdapterType();
        setAdapter();
    }

    private void initData() {
        typeItems = new ArrayList<>();

        typeItems.add(new TypeItem(R.drawable.delivery, getString(R.string.delivery), true));
        typeItems.add(new TypeItem(R.drawable.takeaway, getString(R.string.takeaway), false));
        typeItems.add(new TypeItem(R.drawable.restaurants, getString(R.string.restaurants), false));
    }

    private void setAdapterType() {
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void setAdapter() {
        initData();
        TypeAdapter adapter = new TypeAdapter(MainActivity.this, typeItems);
        recyclerView.setAdapter(adapter);
    }
}

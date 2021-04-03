package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemAdapter.OnListItemClickListener {
    RecyclerView mItemList;
    ItemAdapter mItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mItemList = findViewById(R.id.rv);
        mItemList.hasFixedSize();
        mItemList.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Chair", R.drawable.p1));
        items.add(new Item("Hairbrush", R.drawable.p2));
        items.add(new Item("Mirror", R.drawable.p3));
        items.add(new Item("Dice", R.drawable.p4));
        items.add(new Item("Scissor", R.drawable.p5));
        items.add(new Item("Spoon", R.drawable.p6));
        items.add(new Item("Toothbrush", R.drawable.p7));
        items.add(new Item("Mug", R.drawable.p8));
        items.add(new Item("Pencil", R.drawable.p9));
        items.add(new Item("Camera", R.drawable.p10));

        mItemAdapter = new ItemAdapter(items, this);
        mItemList.setAdapter(mItemAdapter);
    }

    @Override
    public void onListItemClick(int clickedItemIndex){
        int itemNumber = clickedItemIndex + 1;
        Toast.makeText(this, "Item Number: " + itemNumber, Toast.LENGTH_SHORT).show();
    }
}
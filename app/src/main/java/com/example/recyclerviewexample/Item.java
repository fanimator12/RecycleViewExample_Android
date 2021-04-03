package com.example.recyclerviewexample;

public class Item {
    private String mName;
    private int mIconId;

    Item(String name, int iconId){
        mName = name;
        mIconId = iconId;
    }

    public String getName(){
        return mName;
    }

    public int getIconId() {
        return mIconId;
    }
}

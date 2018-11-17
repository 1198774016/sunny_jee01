package com.sunny.designPattern.build.builder.example1;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    private float cost;

    public List<Item> getItems() {
        return items;
    }

    public float getCost() {
        return cost;
    }

    public void addItem(Item item) {
        items.add(item);
        cost += item.price();
    }

}

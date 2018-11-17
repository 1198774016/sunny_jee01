package com.sunny.designPattern.build.builder.example1;

public class MealBuilder {
    public Meal getMealA() {
        Meal m = new Meal();
        m.addItem(new VegBurger());
        m.addItem(new Coke());
        return m;
    }

    public Meal getMealB() {
        Meal m = new Meal();
        m.addItem(new ChickenBurger());
        m.addItem(new Coke());
        return m;
    }
}

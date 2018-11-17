package com.sunny.designPattern.build.prototype;

import java.io.Serializable;

public class Teacher implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

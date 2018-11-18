package com.sunny.designPattern.build.abstractFactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public String factoryType() {
        return "colorFactory";
    }

}

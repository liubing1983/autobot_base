package com.lb.java.autobotbase.javainaction.ch02;

/**
 * @ClassName ApplePojo
 * @Description
 * @Author 罗森内里
 * @Date 2023/2/6 18:58
 * @Version 1.0
 **/
public class ApplePojo {

    private String name;
    private ColorEnum color =  ColorEnum.NULL;
    private int weight;

    public ApplePojo(){}

    public ApplePojo(String name, ColorEnum color, int weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

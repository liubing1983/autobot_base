package com.lb.java.autobotbase.javainaction.ch02;

import java.util.ArrayList;
import java.util.List;

import static java.awt.Color.GREEN;

/**
 * @ClassName AppleFilter
 * @Description  筛选苹果
 * @Author 罗森内里
 * @Date 2023/2/6 19:01
 * @Version 1.0
 **/
public class AppleFilter {

    /**
     * @description  第一种方案
     * @author 罗森内里
     * @date 2023/2/6 19:10
     * @param inventory  
     * @return java.util.List<com.lb.java.autobotbase.javainaction.ch02.ApplePojo>
     **/
    public static List<ApplePojo> filterGreenApples(List<ApplePojo> inventory) {
        List<ApplePojo> result = new ArrayList<>();       // 累积苹果的列表
        for (ApplePojo apple : inventory) {
            if (GREEN.equals(apple.getColor())){       // 仅仅选出绿苹果
                result.add(apple);
            }
        }
        return result;
    }


    /**
     * @description  第二种 通过参数传递颜色
     * @author 罗森内里
     * @date 2023/2/6 19:13 
     * @param inventory 苹果列表
     * @param color   颜色
     * @return java.util.List<com.lb.java.autobotbase.javainaction.ch02.ApplePojo>
     **/
    public static List<ApplePojo> filterGreenApples(List<ApplePojo> inventory, ColorEnum color) {
        List<ApplePojo> result = new ArrayList<>();       // 累积苹果的列表
        for (ApplePojo apple : inventory) {
            if (color.equals(apple.getColor())){       // 通过参数选出某种颜色的苹果
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * @description  第三种, 增加过滤条件
     * @author 罗森内里
     * @date 2023/2/6 19:17
     * @param inventory
     * @param color
     * @param weight
     * @return java.util.List<com.lb.java.autobotbase.javainaction.ch02.ApplePojo>
     **/
    public static List<ApplePojo> filterApples(List<ApplePojo> inventory, ColorEnum color, int weight) {
        List<ApplePojo> result = new ArrayList<>();       // 累积苹果的列表
        for (ApplePojo apple : inventory) {
            if (color.equals(apple.getColor()) && weight > apple.getWeight()){       // 通过参数选出某种颜色的苹果
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}

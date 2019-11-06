package cn.itcast.day1.Dome2;

import java.util.ArrayList;
import java.util.Random;

public class Dome7 {
    public static void main(String[] args) {
        Random  ram  = new Random();
        int sumNum = ram.nextInt(100)+1;
        ArrayList<String> list = new ArrayList<>();
        boolean sur = list.add("杨大话");
        System.out.println("是否成功" + sur);
        System.out.println(list);
    }
}

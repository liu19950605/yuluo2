package cn.itcast.day1.Dome3;

import kotlin.collections.ArraysKt;

import java.util.*;

public class DouDiZhu {
    public static void main(String[] args) {
        //准备牌
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠","♦","♧","♥"};
        String[] nums = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for (String color : colors){
            for (String num : nums){
                poker.add(color+num);
                System.out.println(color+num);
            }
        }
        //洗牌
        Collections.shuffle(poker);
        //发牌
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p =poker.get(i);
            if (i>=51){
                diPai.add(p);
            }else if (i%3==1){
                play2.add(p);
            }else if (i%3==2){
                play3.add(p);
            }else if (i%3==0){
                play1.add(p);
            }
        }
        System.out.println("张柏芝"+play1);
        System.out.println("谢霆锋"+play2);
        System.out.println("王二麻子"+play3);
        System.out.println("底牌"+diPai);

    }


}

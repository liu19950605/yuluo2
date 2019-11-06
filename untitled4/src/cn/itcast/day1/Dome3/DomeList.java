package cn.itcast.day1.Dome3;

import javax.swing.text.StyleContext;
import java.util.ArrayList;
import java.util.Random;

public class DomeList {
    public static void main(String[] args) {
    ArrayList<Integer> bigList = new ArrayList<>();
    Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(50) + 1;
            bigList.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("得到数字的个数为" + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println("这些数字分别为" + smallList.get(i));
        }
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int sma = bigList.get(i);
            if (sma % 2 == 0){
                smallList.add(sma);
            }
        }
        return smallList;
    }
}

package cn.itcast.day1.Dome3;

import java.util.Arrays;

public class Dome3 {
    public static void main(String[] args) {
        int[] arr ={1,4,2,56,6};
        Arrays.sort(arr);
        String toString = Arrays.toString(arr);

        System.out.println(toString);

        String str = "qweawdqwerqwryasdfwtsdfag21234134512342";
        char[] num = str.toCharArray();
        Arrays.sort(num);
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}

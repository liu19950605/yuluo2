package cn.itcast.day1.Dome3;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Dome3Num {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("输出一个字符串");
        String input = num.next();

        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;

        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char sz =arr[i];

            if ('A'<=sz&&sz<='Z'){
                countUpper++;
            }else if ('a'<=sz&&sz<='z'){
                countLower++;
            }else if ('0'<=sz&&sz<='9'){
                countNum++;
            }else {
                countOther++;
            }
            }
        System.out.println("大写字母有"+countUpper);
        System.out.println("小写字母有"+countLower);
        System.out.println("数字有"+countNum);
        System.out.println("其他数字为"+countOther);

        }

    }

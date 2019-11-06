package cn.itcast.day1.Dome3;

public class Domesticating {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;

        for (int i = (int) min; i <= 5.9; i++) {
            int num = Math.abs(i);
            if (num > 6 || num < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("得到的数字个数为" + count);
    }
}

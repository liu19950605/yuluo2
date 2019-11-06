package cn.itcast.day1.Dome2;

public class Dome4 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 123, 1, 234, 22, 12, 34, 234, 5,23122};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("最大值为"+ max );
    }
}

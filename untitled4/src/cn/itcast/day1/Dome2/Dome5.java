package cn.itcast.day1.Dome2;

public class Dome5 {
    public static void main(String[] args) {
        int[] array ={10, 20, 30, 40, 50, 60};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("========");
        for (int min = 0, max = array.length - 1; min < max;
             min++,
                     max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

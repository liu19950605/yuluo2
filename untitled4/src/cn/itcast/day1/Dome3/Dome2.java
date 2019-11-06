package cn.itcast.day1.Dome3;

//3要素
//返回值类型  String
//方法名      formString
//参数列表    int[]
public class Dome2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5,6,7};
        String result = formString(arr);
        System.out.println(result);
    }
    public static String formString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += "word" + arr[i] + "]";
            } else {
                str += "word" + arr[i] + "#";
            }
        }
        return str;
    }
}

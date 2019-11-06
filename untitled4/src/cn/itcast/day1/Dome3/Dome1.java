package cn.itcast.day1.Dome3;

import javafx.scene.control.skin.SliderSkin;

import java.util.ArrayList;

public class Dome1 {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();

        Student one = new Student("胡琪",13);
        Student two = new Student("王五",43);
        Student three = new Student("张三强",33);
        Student four = new Student("其覆盖",23);

        stu.add(one);
        stu.add(two);
        stu.add(three);
        stu.add(four);
        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);
            System.out.println("被选中的学生为"+student.getName() + "他的年龄为" + student.getAge());
        }
    }
}

package cn.itcast.day1.Dome3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dome5 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("一");
        coll.add("二");
        coll.add("三");
        coll.add("思");
        coll.add("污");
        System.out.println(coll);
        Iterator<String> ite = coll.iterator();
        while (ite.hasNext()){
            String e = ite.next();
            System.out.println(e);
        }

    }
}

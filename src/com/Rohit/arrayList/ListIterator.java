package com.Rohit.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(3,200);
        Collection<Integer> list1 =list;
        //list.addAll(list1);
        boolean contains = list.contains(67);
        System.out.println(contains);
        int size = list.size();
        System.out.println(size);
        list.remove(2);
        list.add(0,1000);
        run(list);
        list.set(0,999);
//        list.clear();
        run(list);
    }


    public static void run(ArrayList<Integer> list) {
        // method 1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
// method 2

       /* for (Integer integer : list) {
            System.out.println(integer);
        }
// method 3

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
// method 4

        list.forEach(a -> {
            System.out.println(a);
        });
        // method 5

        Iterator<Integer> pass = list.iterator();
        pass.forEachRemaining(a -> {
            System.out.println(a);
        });*/

    }
}




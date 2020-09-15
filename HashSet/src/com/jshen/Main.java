package com.jshen;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
//HashSet is not synchronized, not thread safe
//NULL elements are allowed in HashSet.

    public static void main(String[] args) {
        HashSet<Integer> sample = new HashSet<>();

        //add(): unlike HashMap that is using put()
        sample.add(0);
        sample.add(1);
        sample.add(2);
        sample.add(3);
        sample.add(4);
        sample.add(5);

        //remove()
        sample.remove(5);

        //contains
        System.out.println(sample.contains(0)); //true
        System.out.println(sample.contains(5)); //false

        //isEmpty()
        //size()


        //iterator(): can't just call this method to print each value
        Iterator i = sample.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


        //clear()
        sample.clear();
        System.out.println(sample);
    }
}

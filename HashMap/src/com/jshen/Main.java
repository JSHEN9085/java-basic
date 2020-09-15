package com.jshen;

import java.util.HashMap;

public class Main {
//It stores the data in (Key, Value) pairs, where Key is unique
//It is not threads safe

    public static void main(String[] args) {
        HashMap<Integer, String> sample = new HashMap<>(); //Initial Capacity is default as 16
        //Threshold: – It is the product of Load Factor and Initial Capacity. In java, by default, it is (16 * 0.75 = 12). That is, Rehashing takes place after inserting 12 key-value pairs into the HashMap.
        //Rehashing: – It is the process of doubling the capacity of the HashMap after it reaches its Threshold. In java, HashMap continues to rehash(by default) in the following sequence – 2^4, 2^5, 2^6, 2^7, …. so on.



        //put(): unlike List, we use put() to add element into HashMap
        sample.put(0, "Zero");
        sample.put(1, "One");
        sample.put(2, "Two");
        sample.put(3, "Three");
        sample.put(4, "Four");
        sample.put(5, "Five");

        //get(): to retrieve data, if key is not inside the HashMap, null is returned
        System.out.println("getting 0 " + sample.get(0));
        System.out.println("getting 6 " + sample.get(6)); // returns null

        //containsKey(): time complexity is O(1)
        System.out.println("contains 0? " + sample.containsKey(0));
        System.out.println("contains 6? " + sample.containsKey(6));

        //containsValue(): time complexity is O(n)
        System.out.println("contains Zero? " + sample.containsValue("Zero"));
        System.out.println("contains zero? " + sample.containsValue("zero")); //case sensitive
        System.out.println("contains Six? " + sample.containsValue("Six"));


        //isEmpty(): return true or false
        //size(): return the # of pairs


        //entrySet(): return view as key=value: [0=zero, 1=One, 2=Two, 3=Three, 4=Four, 5=Five]
        System.out.println(sample.entrySet());


        //remove(Key): only need key as the parameter, will return the value which paired to the deleted key
        sample.put(6, "Six");
        System.out.println(sample);
        System.out.println(sample.remove(6)); //return "Six" here


        //getOrDefault(Object key, V defaultValue): this method is not updating the HashMap
        //**it only helps us set a default value if the value can't be retrieved from the HashMap**
//        System.out.println(sample.getOrDefault(1, "big One"));
//        System.out.println(sample.getOrDefault(6, "Six"));
//        System.out.println(sample);


        //putIfAbsent(K key, V value):
        System.out.println(sample.putIfAbsent(1, "Big One")); //1 is already exists, so it won't update the value, and method return value of 1
        System.out.println(sample.putIfAbsent(6, "Six")); // return null, but put 6, "Six" into the HashMap
        System.out.println(sample); //has 6 inside


        //replace(K key, V value)
        //replace(K key, V oldValue, V newValue): This method replaces the entry for the specified key only if currently mapped to the specified value. if old value is not provided correctly, replace will fail
        System.out.println(sample.replace(6, "new Six")); //will return the old value with the key
        System.out.println(sample);

        System.out.println(sample.replace(6, "new ix", "Six")); //return false since old value is not provide correctly
        System.out.println(sample.replace(6, "new Six", "Six")); //return true
        System.out.println(sample);

        //clear()
//        sample.clear();
//        System.out.println(sample); //return empty {}
    }
}

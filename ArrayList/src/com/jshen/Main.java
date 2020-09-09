package com.jshen;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {

//ArrayList is a part of collection framework and is present in java.util package.
//It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays
//but can be helpful in programs where lots of manipulation in the array is needed.
//This class is found in java.util package.

    public static void main(String[] args) {
        //created an sample
        List<Integer> sample = new ArrayList<>();
        sample.add(1);
        sample.add(2);
        sample.add(3);
        sample.add(4);
        sample.add(6);

        //isEmpty()
        System.out.println(sample.isEmpty());

        //indexOf()
        System.out.println("index of 1 is " + sample.indexOf(1));
        System.out.println("index of 10 is " + sample.indexOf(10)); //if element is not inside of the arraylist, return -1

        //lastIndexOf
        System.out.println("last index " + sample.lastIndexOf(6));

        //get(): not same as array that using array[index]
        System.out.println("getting index of 3 is " + sample.get(3));

        //contains(Object)
        System.out.println("is 2 inside " + sample.contains(2));

        //clone(): getting "clone() has protected access java", new below method to make a copy
        //clone() method is protected in ArrayList, so only its subclass has access to this method, same as removeRange(fromIndex, toIndex)
        List<Integer> sample2 = new ArrayList<>(sample);
        System.out.println(sample2); //a new copy of sample, and not sharing address
        System.out.println("same address? " + (sample == sample2)); //return false as they are not in the same address
        System.out.println("same value? " + (sample.equals(sample2)) ); //return true, because they have same value up to this step


        //add(Object): This method is used to add an element at the end of the ArrayList.
        //add(int index, Object): This method is used to add an element at a specific index in the ArrayList.
        sample.add(7);
        sample.add(4, 5);

        //addAll(int index, Collection C)
        List<Integer> adding = new ArrayList<>();
        adding.add(9);
        adding.add(10);
        sample.addAll(adding);
        System.out.println("after adding " + sample);


        //toArray(): //in Leetcode question, if question requires an array as output, we need toArray() method
        System.out.println(sample); //will print a readable ArrayList
        System.out.println(sample.toArray()); //will print out unreadable output "Ljava.lang.Object;@6bdf28bb"


        //Set(index, Object): changing elements
        sample.set(6, 8);
        System.out.println("changing index of 6 to integer 8 " + sample);
        //sample[6] = 8 this won't work in ArrayList, only for array
        sample.set(6, 7);


        //remove(Object): This method is used to simply remove an object from the ArrayList. If there are multiple such objects, then the first occurrence of the object is removed.
        //remove(index): Since an ArrayList is indexed, this method takes an integer value which simply removes the element present at that specific index in the ArrayList. After removing the element, all the elements are moved to the left to fill the space and the indices of the objects are updated.
        sample.remove(6); //if only int input, it will default it as index, not specific #

        List<String> stringSample = new ArrayList<>();
        stringSample.add("Geeks");
        stringSample.add("For");
        stringSample.add("geeks");

        System.out.println("before remove " + stringSample);
        stringSample.remove("geeks"); //if object is not int, we can specify the object to be removed
        System.out.println("after remove " + stringSample);



        //size()
        System.out.println("size is " + sample.size());


        //subList()
        List<Integer> sample3 = new ArrayList<>(sample.subList(0, 2)); //from is inclusive, to is exclusive
        System.out.println("sample3 is " + sample3);


        //retainAll(): Retains only the elements in this list that are contained in the specified collection.
        ArrayList<String> bags = new ArrayList<String>();
        // Add values in the bags list.
        bags.add("pen");
        bags.add("pencil");
        bags.add("paper");

        // Creating another array list
        ArrayList<String> boxes = new ArrayList<String>();

        // Add values in the boxes list.
        boxes.add("pen");
        boxes.add("paper");
        boxes.add("books");
        boxes.add("rubber");

        // Before Applying method print both lists
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);

        // Apply retainAll() method to boxes passing bags as parameter
        boxes.retainAll(bags);

        // Displaying both the lists after operation
        System.out.println("\nAfter Applying retainAll()"+
                " method to Boxes\n");
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);



        //clear() : This method is used to remove all the elements from any list.
        sample.clear();
        System.out.println("ArrayList is now empty" + sample);


    }
}

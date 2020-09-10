package com.jshen;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    //The Queue interface present in the java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order
    //It is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of the list

    public static void main(String[] args) {
	//Being an interface the queue needs a concrete class for the declaration and the most common classes are the PriorityQueue and LinkedList
    //but both PriorityQueue and LinkedList are not thread safe
    //PriorityBlockingQueue is one alternative implementation if thread safe implementation is needed
    //Due to the dynamicity and ease of insertions and deletions, LinkedList is preferred over the arrays or queues

        Queue<Integer> empty = new LinkedList<>();

        Queue<Integer> sample = new LinkedList<>();
        for(int i = 0; i <= 5; i++){
            sample.add(i);
        }
        //**there is no random access in Queue, means get(index) won't work**

        //peek(): retrieve head of queue, return null if empty instead of exception
        //element(): similar to peek(), but will throw exception
        System.out.println("head is " + sample.peek());
        System.out.println(empty.peek());

        //size()
        System.out.println("size is " + sample.size());

        //iterator(): to iterate the Queue
        Iterator iterator = sample.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        } //this loop will print from 0 to 5


        //poll(): remove from head, or return null if empty
        //remove(): remove from head, or throw exception if empty
        empty.add(0);
        System.out.println("poll() " + empty.poll());
        System.out.println("now empty is empty");
        System.out.println("poll empty " + empty.poll());
        System.out.println("remove empty " + empty.remove());


    }
}

package com.jshen;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Main {
//The ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface.
//It is also known as Array Double Ended Queue or Array Deck.
//This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.

//Array deques have no capacity restrictions and they grow as necessary to support usage.
//Not thread-safe which means that in the absence of external synchronization, ArrayDeque does not support concurrent access by multiple threads.
//Null elements are prohibited
//ArrayDeque class is likely to be faster than Stack when used as a stack.
//ArrayDeque class is likely to be faster than LinkedList when used as a queue.


    public static void main(String[] args) {
        ArrayDeque<Integer> empty = new ArrayDeque<>();

        ArrayDeque<Integer> sample = new ArrayDeque<>(); //this constructor default size as 16
        for(int i = 0; i <= 5; i++){
            sample.add(i);
        }

        //size()
        System.out.println("sample size is " + sample.size());

        //iterator()
        Iterator itr = sample.iterator();
        while(itr.hasNext()){
            System.out.println("next " + itr.next());
        }


        //methods that throw exception
        //getFirst()
        //getLast()
        //remove(): remove the first element (head / top)
        //removeFirst()
        //removeLast()
        //pop(): function is same as poll(), remove the head


        //methods that return null or false (no exception)
        //offer()
        //offerFirst()
        //offerLast()
        //peek(): see the first element
        //peekFirst(): see the first element, same as peek()
        //peekLast()
        //poll(): function is same as pop(), remove the head
        //pollFirst()
        //pollLast()

        //**to avoid exception in ArrayDeque,
        //we and use offer(), offerLast(),
        //poll(), pollLast()**

        System.out.println("kick out the last " + sample.pollLast());

    }
}

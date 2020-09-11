package com.jshen;

import java.util.Stack;

public class Main {
//In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek.

    public static void main(String[] args) {
        Stack<Integer> empty = new Stack<>();
	    Stack<Integer> sample = new Stack();

	    //push(), adding element
	    for(int i = 0; i <= 5; i++){
	        sample.push(i);
        }
        System.out.println(sample);

	    //pop(): return the element pop(), exception if empty
        //System.out.println(sample.pop());
        //System.out.println(sample);

        //peek(): be careful, in Queue, peek() return the top(the beginning)
        //in Stack, peek() return the tailor, so peek() could be understand as the first element will be removed
        System.out.println(sample.peek()); // return 4

        //search(): This method starts the count of the position from 1 and not from 0. The element that is on the top of the stack is considered to be at position 1
        //in the terminal Stack is [0, 1, 2, 3, 4, 5], so position of 0 will be 6, start counting 1 from right in the terminal
        System.out.println(sample.search(0));



    }
}

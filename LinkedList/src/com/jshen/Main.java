package com.jshen;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        class ListNode {
	        int val;
	        ListNode next;
	        ListNode(int x) { val = x;}
        }

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(node1.val);


        //!!!some methods are available in LinkedList class, but reference of List type
        //!!!and List interface does not have those methods, compiler wont allow you to call this. ex: peek(), offer()


        //add(), adding element to the end
        //add(int index, Object):
        //addFirst(): This method does not returns any value, if error, will throw exception
        //addLast(): This method does not returns any value, if error, will throw exception
        LinkedList<Integer> sample = new LinkedList<>(); //if not declared it as LinkedList, some methods is not available
        sample.add(1);
        sample.add(2);
        sample.add(3);
        sample.add(4);
        sample.add(7);
        System.out.println(sample); //[1, 2, 3, 4, 5] will still print [1, 2, 3, 4, 5], same as ArrayList

        sample.add(4, 5); //can also refer to index in LinkedList

        //offerFirst(E e): This method returns true, or false if failed to add
        //offerLast(E e): This method returns true, or false if failed to add
        System.out.println("adding 7 " + sample.offer(7));


        //set(int index, Object)
        sample.set(5, 6);

        //contains(Object o)
        System.out.println("has 4 inside ? " + sample.contains(4));


        //remove(Index)
        //remove(Object)
        //removeFirst(): This method removes and returns the first element from this list.
        //removeLast(): This method removes and returns the last element from this list.
        sample.add(8);
        System.out.println(sample);
        sample.remove(6); //if number is input, default it as index
        System.out.println(sample);
        sample.removeFirst();
        System.out.println(sample);

        //poll(): This method retrieves and REMOVES the head (first element) of this list, or return null
        //pollFirst(): This method retrieves and REMOVES the first element of this list, or returns null if this list is empty.
        //pollLast(): This method retrieves and REMOVES the last element of this list, or returns null if this list is empty.
        System.out.println("poll() " + sample.poll());

        //pop(): used to remove and return the top element, but will throw
        //Exception: If there is no element in the stack represented by the LinkedList, the pop method will throw NoSuchElementException().


        //peek(): This method retrieves, but does not remove, the head (first element) of this list.
        //peekFirst(): This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
        //peekLast(): This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
        //method is available in LinkedList class. Since you are using a reference of List type
        //and List interface does not have method peek(), compiler wont allow you to call this.
        System.out.println(sample.peek());

        LinkedList<Integer> empty = new LinkedList<>();
        System.out.println("peek first " + empty.peekFirst());
//        System.out.println("removeFirst()" + empty.removeFirst()); // nothing return
//        System.out.println("poll() " + empty.poll()); // return null
//        System.out.println("pop() " + empty.pop()); // throw exception


        //push(): This is similar to the addFirst() method of LinkedList and simply inserts the element at the first position or top of the linked list.
        //push() doesn't return any value
        System.out.println("before push " + sample);
        sample.push(9);
        System.out.println("after push " + sample);
        sample.poll();
        System.out.println("after poll " + sample);
        // **push add to first(top), poll remove from first (top)
    }
}

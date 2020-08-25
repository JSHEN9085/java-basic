package com.jshen;
import java.util.*;

public class Main {
/*
The direct superclass of an array type is Object.

1. Declaration
An array declaration has two components: the type and the name. Ex: int[], refer to an array of integer
you must specify the type and number of elements to allocate
Ex: int[] intArray = new int[20]  (The size of an array must be specified by an int value and not long or short)
Elements will be default as 0, if want to specific element, need to declare array as below
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; **(using {} instead [] in JavaScript)**

2D or 3D array
int[][] intArray = new int[10][20]; //a 2D array or matrix
int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };

int[][][] intArray = new int[10][20][10]; //a 3D array
** after declaring the size, size is immutable**

2. Cloning of arrays
When you clone a single dimensional array, such as Object[],
a “deep copy” is performed with the new array containing
copies of the original array’s elements as opposed to references.
EX: int cloneArray[] = originArray.clone();

**A clone of a multidimensional array (like Object[][]) is a “shallow copy”
however, which is to say that it creates only a single new array
with each element array a reference to an original element array
but subarrays are shared.
EX: int cloneArray[][] = intArray.clone();
System.out.println(intArray == cloneArray);  -- False
System.out.println(intArray[0] == cloneArray[0]);  -- True
System.out.println(intArray[1] == cloneArray[1]);  -- True
*/
    public static void main(String[] args) {
        int intArr[] = { 10, 20, 15, 22, 35 };

        //sorting
        //sort(originalArray, fromIndex, endIndex), can also specify the range of sort
        System.out.println("before sort");
        System.out.println(intArr[2]);
        Arrays.sort(intArr); // will change the original input
        System.out.println("after sort");
        System.out.println(intArr[2]);

        //to String
        //using Arrays.toString, if directly print intArr, we will have un readable result
        System.out.println(Arrays.toString(intArr));

        //finding index
        //there is no direct method of indexOf in array. That is for Arraylist
        System.out.println(Arrays.binarySearch(intArr, 10));

        //Binary Search
        //binarySearch(int[] array, int fromIndex, int toIndex, T key)
        //method searches a range of the specified array for the specified object using the binary search algorithm
        System.out.println(Arrays.binarySearch(intArr, 1, 3, 20)); //it found 20 is in index of 2

        //Compare
        int[] input1 = {0, 1, 2, 3};
        int[] input2 = new int[] {0, 1, 2, 3};
        int[] input3 = input1;
        System.out.println(input1 == input2); //false, because 1 and 2 are pointing to different address
        System.out.println(input1 == input3); //true, because 1 and 3 are pointing to same address
        System.out.println(Arrays.equals(input1, input2)); //true, because 1 & 2 have same numbers
        System.out.println(Arrays.compare(input1, input2)); //compare method will show how many position is different, not which position is different

        //deep equal and deepToString
        //deepEquals(Object[] a1, Object[] a2), compare 2d or more, but only for numbers
        int int2d[][] = { { 10, 20, 15, 22, 35 } };
        int int2dArr[][] = { { 10, 20, 15, 22, 35 } };
        System.out.println(Arrays.deepEquals(int2d, int2dArr)); //true
        System.out.println(Arrays.deepToString(int2d)); //using deepToString to print 2d array


        //Copy
        //copyOf(originalArray, newLength)
        int[] intArr2 = Arrays.copyOf(intArr, 10); //the extra length will be default as 0
        System.out.println(intArr == intArr2); //false, as address is different
        System.out.println(Arrays.toString(intArr2));
        //copyOfRange(originalArray, fromIndex, endIndex)
        int[] intArr3 = Arrays.copyOfRange(intArr, 0, 2); //to index is excluded, so only copy index of 0 and 1
        System.out.println(Arrays.toString(intArr3));

        //fill
        //Arrays.fill will replace all index instead of 1
        int[] original = new int[]{1, 2, 3, 4, 5};
        Arrays.fill(original, 10);
        System.out.println(Arrays.toString(original));

        //mismatch
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 4};
        System.out.println(Arrays.mismatch(arr1, arr2)); //2, mismatch will show which position is not matched

    }
}

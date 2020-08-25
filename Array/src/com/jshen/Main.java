package com.jshen;

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
	// write your code here
    }
}

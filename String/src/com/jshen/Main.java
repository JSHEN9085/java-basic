package com.jshen;

public class Main {
//    **StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
//    **StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.

    public static void main(String[] args) {
        String empty = "";
        String sample = new String("sample"); //we can also use new keyword

        //converting char array to String
        char char_arr[] = {'G', 'e', 'e', 'k', 's'};
        String completed = new String(char_arr);
        System.out.println(completed);
        String partial = new String(char_arr , 1, 3);
        System.out.println(partial);

        //after built String using StringBuffer or StringBuilder, need to convert them into string for output purpose
        StringBuffer s_buffer = new StringBuffer("Buffer");
        System.out.println(s_buffer);
        String buffer_output = new String(s_buffer);
        System.out.println(buffer_output);

        StringBuilder s_builder = new StringBuilder("Builder");
        System.out.println(s_builder);
        String builder_output = new String(s_builder);
        System.out.println(builder_output);


        //Methods
        //length()
        System.out.println("sample.length " + sample.length());

        //charAt()
        System.out.println(sample.charAt(2)); //return 'm'

        //substring()
        System.out.println("substring from 2 " + sample.substring(2)); //this is inclusive, staring from the index to the end

        //concat()
        String s1 = new String("I am ");
        String s2 = new String("home");
        System.out.println(s1.concat(s2)); // won't change the input

        //indexOf(): return the first occurrence
        //indexOf(String s, int index): index of the first occurrence, STARTING at the specified index.
        //lastIndexOf( String s): index of the last occurrence
        String s = "Learn Share Learn";
        int output = s.indexOf("ea",3);// returns 13
        System.out.println(s.lastIndexOf("n")); //return 16

        //equals()
        //equalsIgnoreCase()
        System.out.println("equals to lowercase? " + sample.equals("sample"));
        System.out.println("equals to uppercase? " + sample.equals("SAMPLE"));
        System.out.println("equals to ignore case? " + sample.equalsIgnoreCase(  "SAMPLE"));

        //compareTo(): method returns int
        //compareToIgnoreCase(): method returns int
        // return 0 if two string is same in term of word(lexicographically)
        // return negative, if difference in string 1 is in front of string 2 (in the dictionary) ex: 1: "app", 2: "apple"
        // return positive, if difference in string 1 is behind string 2. ex: 1: "app", 2: "api"
        String test1 = new String("app");
        String test2 = new String("api");
        System.out.println(test1.compareTo(test2));


        //toLowerCase()
        //toUpperCase()


        //trim(): Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
        String withSpace = new String(" I am working ");
        System.out.println(withSpace.trim()); //return a copy, and doesn't change the input
        System.out.println(withSpace);

        //replace(char oldChar, char newChar): Returns new string by replacing all occurrences of oldChar with newChar.
        String apple = "apple";
        apple.replace("p", "i");
        System.out.println(apple); //doesn't change the input, need to save it in another variable

        String after_replace = apple.replace("p", "i");
        System.out.println(after_replace);



//--------------------------------------------------------------------------------------------
//StringBuilder: in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters,
//the StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters.
//Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations

        StringBuilder builder = new StringBuilder("B"); //Constructs a string builder with no characters in it and an initial capacity of 16 characters.

        //append(): adding char, **no add() method**
        builder.append("u");

        //capacity(): total allocated capacity
        //length()
        System.out.println("capacity count " + builder.capacity());
        System.out.println("character count " + builder.length());

        //charAt()
        System.out.println(builder.charAt(0));


        //indexOf(): index of the first occurrence
        //lastIndexOf(): index of the last occurrence


        //delete(int start, int end), end index is exclusive, if want to delete all, need to put length there
        //deleteCharAt(int index): delete specific char
        builder.delete(0, 2);
        System.out.println("after deleted " + builder); //not should be empty


        //insert(int index, String s), insert before the index!!!
        //insert(int offset, boolean b):  method inserts the string representation of the boolean argument into this sequence.The offset argument must be greater than or equal to 0, and less than or equal to the length of this sequence. only insert boolean into a string
        builder.append("B");
        builder.append("i");
        System.out.println("before insert " + builder);
        builder.insert(1, "u");
        System.out.println("after insert " + builder);


        //setCharAt(int index, char char): can only replace one char at once, so must use single quote ''
        builder.setCharAt(0, 'b');
        System.out.println(builder);

        //replace(int start, int end, String str)
        builder.replace(0, 3, "Builder"); //same rule here, end index is exclusive
        System.out.println(builder);

        //reverse()

        //setLength(): just keep the portion we want, but always start from beginning
        //subSequence(int start, int end): This method returns a new character sequence that is a subsequence of this sequence.
        //substring(): customize the portion we want, but doesn't change the input
//        builder.setLength(1);
        System.out.println(builder.substring(0, 2));

        System.out.println(builder.subSequence(0, 2));
        System.out.println(builder);





    }
}

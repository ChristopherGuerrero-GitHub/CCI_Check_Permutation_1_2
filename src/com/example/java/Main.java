package com.example.java;


public class Main {

    public static void main(String[] args) {

        /*This program is a solution to CCI check permutation problem 1.2. Given two strings write a method to decide
          if one is permutation of the other.
        */

        String str = "abcd", str2 = "dcba";
        boolean result;

        //pass both string objects as arguments to the isPermuation method and return the boolean result and store
        // in the primitive boolean data type result.
        result = isPermutation(str,str2);

        //print out the results.
        System.out.println("The result of both strings " + str + " & " + str2
                +" being permutations of each other is: " + result);

        //new input data.
        str = "gef";
        str2 = "Ace";

        //pass both string objects as arguments to the isPermutation method and return the boolean result and store
        // in the primitive boolean data type result.
        result = isPermutation(str,str2);

        System.out.println("The result of both strings " + str + " & " + str2
                +" being permutations of each other is: " + result);


    }

    /*
        This method sort will accept a string parameter convert that string object into a character array. The use of API
        Array method sort will sort the character array. The original string method sort will then return an String object
        of the sorted character array.
     */
    static String sort(String s){
        char [] content;
        content = s.toCharArray();
        java.util.Arrays.sort(content);

        return new String(content);

    }

    /*
        The isPermutation method will check for both string objects length to see if they are NOT the same and return
        false if that is the case. Else both strings will be passed to the String sort methods and both returned string
        objects will be compared to see if they are equal.
     */
    static boolean isPermutation(String string1, String string2){

        if (string1.length() != string2.length()){
            System.out.println("Both string lengths are not equal therefore they are not permutation of one another.");
            return false;
        }

        return sort(string1).equals(sort(string2));

    }
}

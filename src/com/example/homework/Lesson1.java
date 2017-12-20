package com.example.homework;

public class Lesson1 {
    public static void main(String[] args) {
        String text1 = "We make work HUMAN.";
        String text2 = "Unlock full potential. Celebrate positive moments.";
        String text3 = "Every day.";
        char[] globArray = {'G','l','o','b','o','f','o','r','c','e'};
        String[] globArray2 = {"G","l","o","b","o","f","o","r","c","e"};

        /* a) print out in console */
        printString(text1);
        printString(text2);
        printString(text3);

        /* b) print out string length */
        printString("String length is " + text2.length());

        /* c) rewrite everything in lowercase */
        printString(text1.toLowerCase());
        printString(text2.toLowerCase());
        printString(text3.toLowerCase());

        /* c) replace 'e' with 'E' */
        printString(text1.replace("e", "E"));
        printString(text2.replace("e", "E"));
        printString(text3.replace("e", "E"));

        /*вывести размер массива*/
        printString("Array of cahrs length is " +  globArray.length);
        printString("Array of strings length is " +  globArray2.length);

        /* replace b with $ transform to string*/
        String globoString = new String(globArray);
        printString(globoString.replace("b","$"));

        /*replace b with $ in array*/
        char[] updatedArray = replaceEl(globArray, 'b', '$');

        /** next line convert array object toString,
         * and not elements of array
         **/
        printString(updatedArray.toString());

        /* next line make new string from array elements */
        String updatedArrayString = new String(updatedArray);
        printString(updatedArrayString);

        //split string to array of strings
        String[] testStr = text2.split("\\.*");
        System.out.println(testStr.length);
    }

    private static void printString(String str) {
        System.out.println(str);
    }

    /**
     * @param arr, target, repl should be chars,
     * convert to chars before calling methods;
     * not good practice, but possible
     * receive obj as param - then any type could be passed to method
     * and work with object inside method or convert to char arrays inside method;
     **/
    private static char[] replaceEl(char[] arr, char target, char repl) {
        for( int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                arr[i]= repl;
                break; //just because we know there is the only 'b' in Globoforce
            }
        }
        return arr;
    }
}

package com.example.homework;

public class Lesson1 {
    public static void main(String[] args) {
        String text1 = "We make work HUMAN.";
        String text2 = "Unlock full potential. Celebrate positive moments.";
        String text3 = "Every day.";
        char[] globArray = {'G','l','o','b','o','f','o','r','c','e'};


        /* a) print out in console */
        printString(text1);
        printString(text2);
        printString(text3);

        /* b) print out string length */
        typeStringLength(text2);

        /* c) rewrite everything in lowercase */
        printString(text1.toLowerCase());
        printString(text2.toLowerCase());
        printString(text3.toLowerCase());

        /* c) replace 'e' with 'E' */
        printString(text1.replace("e", "E"));
        printString(text2.replace("e", "E"));
        printString(text3.replace("e", "E"));

        /*вывести размер массива*/
        printString("Array length is " +  globArray.length);

        /* replace b with $ transform to string*/
        String globoString = new String(globArray);
        printString(globoString.replace("b","$"));

        /*replace b with $ in array*/
        char[] updatedArray = replaceEl(globArray);
        git
    }

    private static void printString(String str) {
        System.out.println(str);
    }

    private static void typeStringLength(String str) {
        int len = str.length();
        String humanStr = "String length is " + len;
        printString(humanStr);
    }

    private static char[] replaceEl(char[] arr){
        char target = 'b';
        for( int i=0; i<arr.length; i++) {
            if (arr[i]== target) {
                arr[i]='$';
                break;
            }
        }
        return arr;
    }

}

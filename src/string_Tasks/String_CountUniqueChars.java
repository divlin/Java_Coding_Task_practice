package string_Tasks;

import java.util.Arrays;
import java.util.Collections;

public class String_CountUniqueChars {

    public static void main(String[] args) {

        String str = "abbcddef";

        System.out.println(countUniqueChars(str));

    }

    public static int countUniqueChars(String str){
        int result = 0;


        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            char each = str.charAt(i);

            for (int j = 0; j <str.length() ; j++) {
                if(each == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                result++;
            }

        }
        if(result == 0){
            return -1;
        }else{
            return result;
        }


    }
}

 /*
        Write a Java program to count unique Characters in string.
        Given a string as input, write Java code to count and print the number of unique characters in String.
        If there are no unique characters in the string, the method returns -1
     */
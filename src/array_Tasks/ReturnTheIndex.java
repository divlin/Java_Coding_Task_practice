package array_Tasks;

import java.util.Arrays;

public class ReturnTheIndex {

    public static void main(String[] args) {


        int[] numbers = {1 , 2, 100, 7, 11, 15, 999};


        int target = 9;

        String s = "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target){
                    s+= "" + i + "" + j;
                }
            }
        }



        System.out.println(Arrays.toString(s.split("")));



    }
}

/*
input:numbers = {1 , 2, 100, 7, 11, 15, 999 };
 target = 9
 output: [1, 3]
find the sum of 2 integer values equal to 9 and return there indexes

 */

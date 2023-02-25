package array_Tasks;

import java.util.Arrays;

public class ArrayMoveAllZeroToTheEnd {

    public static void main(String[] args) {

        int[] arr = {0, 5, 6, 2, 0, 0, 1, 0, 7};
        moveZerosToTheEnd(arr);
    }

    public static void moveZerosToTheEnd(int[] arr){

        int result[] = new int[arr.length];
        int i=0;         // it is gonna be the index num of the array

        for (int eachNum : arr) {
            if (eachNum!=0){             // if the num is not zero
                result[i++]=eachNum;     // add the number to the array[i] index
            }
        }
        System.out.println(Arrays.toString(result));

    }




}



/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,0]
 */




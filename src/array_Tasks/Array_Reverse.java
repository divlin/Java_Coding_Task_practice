package array_Tasks;

import java.util.Arrays;

public class Array_Reverse {

    public static void main(String[] args) {

        int[] array = {10,20,30,40};

        System.out.println(Arrays.toString( reverseArray(array)) );


    }

    public static int[] reverseArray(int[] arr){

        int[] result = new int[arr.length];

        for (int i = arr.length-1, j=0; i >=0; i--,j++) {
            result[j] = arr[i];

        }
        return result;

    }


}

 /*
    write a function that can reverse an array
     */
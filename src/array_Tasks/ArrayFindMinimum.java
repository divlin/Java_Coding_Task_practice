package array_Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFindMinimum {

    public static void main(String[] args) {

        int[]arr = {12,25,5,8,7,10,58,41};

        System.out.println("findMinInArray(arr) = " + findMinInArray(arr));

        System.out.println("findMinInArray(arr) = " + findMinInArray(arr));


    }

    public static int findMinInArray(int[] arr){

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        return min;
    }


    //--------------------------------------------------------------------------------------------


    public static int findMinInArray2(int[] arr){
        List<Integer> list = new ArrayList<>();

        for (Integer each : arr) {
            list.add(each);
        }

        return Collections.min(list);


    }

}

/*
Question1: Array - Find Minimum
Write a method that can find the minimum number from an int Array

 */

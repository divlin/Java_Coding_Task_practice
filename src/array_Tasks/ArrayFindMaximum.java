package array_Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFindMaximum {

    public static void main(String[] args) {

        int[] arr = {10,20,45,89,25,34};

        System.out.println(findMax(arr));

        System.out.println(findMax2(arr));

    }



    public static int findMax(int[] arr){
        int max = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //second solution ---------------------------------------------

    public static int findMax2(int[] arr){
        List<Integer> list = new ArrayList<>();

        for (Integer each : arr) {
            list.add(each);
        }

        return Collections.max(list);

    }


}

/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */
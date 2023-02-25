package array_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9};

        System.out.println(Arrays.toString(concatTwoArray(arr1, arr2)));
        System.out.println(Arrays.toString(concatTwoArray2(arr1, arr2)));


    }


    public static int[] concatTwoArray(int[] arr1, int[] arr2){

        ArrayList<Integer> list1 = new ArrayList<>();  // create an empty arraylist

        for (int i = 0; i < arr1.length; i++) {      // add all the elements from arr1 to arraylist
            list1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {       // add all the elements from arr2 to arraylist
            list1.add(arr2[i]);
        }

        int[] result = new int [arr1.length + arr2.length];     // create an empty array as a result

        for (int i = 0; i < list1.size(); i++) {               // convert arraylist to array
            result[i] = list1.get(i);
        }

        return result;

    }


    public static int[] concatTwoArray2(int[] arr1, int[] arr2){

        int[] result = new int [arr1.length + arr2.length];   // create an empty array

        int i = 0;  // will be the index num of the result array
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }
}

//Write a return method that can concate two arrays

package array_Tasks;

import java.util.Arrays;

public class ArraySortAscendingOrder {

    public static void main(String[] args) {

        int[] array = {12,25,46,32,85,11,44};

        System.out.println(Arrays.toString(sortInAscendingOrder(array)));


    }


    public static int[] sortInAscendingOrder(int[] array){

        int temp = 0;  //temporary value to serve as the 3rd int variable for swapping later on

        for (int i = 0; i < array.length-1; i++) {   // iterating through the numbers array
            for (int j = i+1; j < array.length; j++) {   // iterating again to compare the index at i and j
                if(array[i] > array[j]){     // if # at index i is greater than # at index j
                    temp = array[i];       // assign that # at index i to the temp value variable
                    array[i] = array[j];     // and swap the # at index j and reassign it to index i
                    array[j] = temp;       // and reassign the # at temp value to index of j
                }
            }
        }
        return array;

    }

}


/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
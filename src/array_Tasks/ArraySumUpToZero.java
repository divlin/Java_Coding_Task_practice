package array_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySumUpToZero {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumZero(6)));
    }

    public static int[] sumZero(int n) {

        ArrayList<Integer> result = new ArrayList(n);   //crate a new empty arraylist to add the elements

        if(n % 2 == 0){                              //if the n is an even # (for example: n = 4)
            for(int i = 1; i <= n / 2; i++){
                result.add(i);                      // add a positive # to the arraylist
                result.add(-i);                     // add the negative # of the same positive #
            }
        }else{                                     //if our n is NOT even (if it's odd) for example n = 3,

            result.add(0);                        //then FORCE the first element at index 0 to be 0
            for(int i = 1; i <= n / 2; i++){
                result.add(i);                    // add a positive # to the arraylist
                result.add(-i);                   // add the negative # of the same positive #
            }
        }


        int[] arr = new int[result.size()];

        for(int i = 0; i < result.size(); i++){
            arr[i] = result.get(i);             // converting the arraylist into array
        }

        return arr;   // returning our array
    }



}
/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
*/

package array_Tasks;

public class Array_FindMinimum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,};

        System.out.println(findMin(arr));

    }


    public static int findMin(int[] arr){

        int min = Integer.MAX_VALUE;

        for (int each : arr) {
            if(each < min){
                min = each;
            }
        }
        return min;

    }






}
  /*
    Write a function that can find the maximum number from an int Array
     */
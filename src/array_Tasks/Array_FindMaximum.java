package array_Tasks;

public class Array_FindMaximum {

    public static void main(String[] args) {

        int[] arr = {5,8,4,1,2,3,6};

        System.out.println(findMaximum(arr));

    }


    public static int findMaximum(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int each : arr) {
            if(each > max){
                max = each;
            }
        }
        return max;
    }
}

package array_Tasks;

public class Array_FirstDuplicatedElement {

    public static void main(String[] args) {

        int[] arr = {3,4,5,5,6,6,7};

        System.out.println(firstDuplicated(arr));

    }

    public static int firstDuplicated(int[] arr){

        int firstDuplicated = 0;

        for (int each : arr) {
            int count = 0;
            for (int element : arr) {
                if (each == element) {
                    count++;
                }
            }

                if(count > 1){
                    firstDuplicated = each;
                    break;
                }
            }


        return firstDuplicated;

    }
}
 /*
    write a program that can find the first duplicated element from the array
     */
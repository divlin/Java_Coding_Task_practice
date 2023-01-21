package extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adam_JavaList_Week17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the list");
        int length = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Please enter " + length + " number");
        for (int i = 0; i <length ; i++) {
            int numbers = input.nextInt();
            list.add(numbers);
        }

        System.out.println("Please enter how many action you want to do");
        int action = input.nextInt();

        for (int i = 0; i <action ; i++) {
            System.out.println("Please enter Insert or Delete");
            String operator = input.next();
            if(operator.equalsIgnoreCase("Insert")){
                System.out.println("Please enter the index num");
                int index = input.nextInt();
                System.out.println("Please enter the number that you eant to insert");
                int number = input.nextInt();
                list.add(index, number);
            }

            if(operator.equalsIgnoreCase("Delete")){
                System.out.println("Please enter the index number");
                int index2 = input.nextInt();
                list.remove(index2);
            }

        }

        System.out.println(list);


    }
}
/*
The requirement is on the github Java office hours -> week17-> evening -> javalist
 */
package extra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Adam_PhoneBook_Week17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number");
        int phoneBookSize = input.nextInt();


        Map<String, Long> phoneBook = new HashMap<>();



        for (int i = 0; i < phoneBookSize ; i++) {
            input.nextLine();
            System.out.println("Please enter the name"); // key for the map
            String name = input.nextLine();
            System.out.println("Please enter the phone number");  // value for the map
            long phoneNumber = input.nextLong();
            if ((phoneNumber + "").length() == 8 && !((phoneNumber + "").substring(0, 1).equals("0"))) {
                phoneBook.put(name, phoneNumber);
            } else {
                System.out.println("Phone number is not valid");
            }

        }

            input.nextLine();
            while(true){
                System.out.println("Please write the name from phone book");
                String nameFromPhoneBook = input.nextLine();
                if(phoneBook.containsKey(nameFromPhoneBook)){ // if phonebook contains same name which is given from keybord
                    System.out.println(nameFromPhoneBook + "=" + phoneBook.get(nameFromPhoneBook));
                }else{
                    System.out.println("Not found");
                }
            }
       // input.close();

    }


}

/*
The requirement is on the github Java office hours -> week17-> evening -> phonebook
 */
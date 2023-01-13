package string_Tasks;

public class String_FirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "abccdeff";

        System.out.println(firstUniqueChar(str));


    }


    public static String firstUniqueChar(String str){
        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            int count = 0;
            char each = str.charAt(i);
            for (int j = 0; j <str.length() ; j++) {
                if(each == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                result += each;
                break;
            }

        }

        return result;


    }
}
/*
    write a program that can return the first non-repeated character from a string
     */
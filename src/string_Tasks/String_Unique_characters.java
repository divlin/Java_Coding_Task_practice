package string_Tasks;

public class String_Unique_characters {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println(unique(str));

    }

    public static String unique(String str){

        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                result += str.charAt(i);
            }

        }
        return result;
    }

}

 /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
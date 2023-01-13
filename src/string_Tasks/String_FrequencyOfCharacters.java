package string_Tasks;

public class String_FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aanmhhhff";

        System.out.println(frequencyOfCharacters(str));


    }

    public static String frequencyOfCharacters(String str){

        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            int count = 0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if( !(result.contains("" + str.charAt(i))) ){
                result+="" +str.charAt(i) + count;
            }
        }

        return result;
    }






}

 /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
package string_Tasks;

public class String_RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";
        System.out.println(removeExtraSpaces(str));

    }

    public static String removeExtraSpaces(String sentence){

        String[] words = sentence.trim().split(" ");
        String result = "";

        for (String each : words) {
            if( ! each.isEmpty()){
                result +=each + " ";
            }
        }
        return result;
    }
}


/*
    Remove All Extra Space from String
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java
     */

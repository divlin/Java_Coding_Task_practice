package string_Tasks;

public class String_RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbccccde";
        System.out.println(removeDuplicates(str));

    }

    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if( ! (result.contains("" + each))){
                result+=each;
            }
        }

        return result;

    }
}

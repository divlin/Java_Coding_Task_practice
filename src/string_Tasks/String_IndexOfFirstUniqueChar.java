package string_Tasks;

public class String_IndexOfFirstUniqueChar {

    public static void main(String[] args) {

        String str = "aaabccd";
        System.out.println(indexOfFirstUniqueChar(str));

    }


    public static int indexOfFirstUniqueChar(String str) {

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (each == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                result = str.indexOf(str.charAt(i));
                break;

            } else {
                result = -1;
            }

        }

        return result;
    }

}






 /*
    Given a string, find the first non-repeating character in it and return its index.
    If it doesn't exist, return -1.
     */
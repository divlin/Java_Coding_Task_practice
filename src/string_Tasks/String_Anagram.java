package string_Tasks;

import java.util.Arrays;
import java.util.TreeSet;

public class String_Anagram {

    public static void main(String[] args) {

        System.out.println(same("eat", "ten"));
        System.out.println(same1("abc", "bca"));

    }

    public static boolean same(String str1, String str2){
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            return true;
        }else{
            return  false;
        }

    }

    //------------------------------------------------------------------------------------

    public static boolean same1(String str1, String str2){


        str1 = new TreeSet<String>(Arrays.asList( str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList( str2.split(""))).toString();

        return str1.equals(str2);



    }



}
   /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */
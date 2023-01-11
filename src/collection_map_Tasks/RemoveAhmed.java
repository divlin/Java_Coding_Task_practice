package collection_map_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed","Ali"));

        System.out.println(removeAhmed1(names));

    }


    // Solution 1
    public static List<String> removeAhmed1(List<String> names) {
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
          String each = it.next();
          if(each.equalsIgnoreCase("Ahmed")){
              it.remove();
          }
        }
       return names;
    }


    //Solution 2
    public static List<String> removeAhmed2(List<String> names){
        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }


    //Solution3
    public static List<String> removeAhmed3(List<String> names){
        names.removeIf(p-> p.equalsIgnoreCase("ahmed"));
        return names;
    }






}

 /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */
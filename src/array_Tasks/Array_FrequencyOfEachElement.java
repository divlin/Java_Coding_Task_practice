package array_Tasks;

import java.util.*;

public class Array_FrequencyOfEachElement {

    public static void main(String[] args) {

        String[] str = {"Apple","Banana","Apple","Cherry"};



        // Solution 1
        Map<String,Integer> map = new LinkedHashMap<>();

        for (String each : str) {
            int frequency = 0;
            for (String element : str) {
                if(each.equals(element)){
                    frequency++;
                }
            }

            map.put(each, frequency);
        }

        for (Map.Entry<String, Integer> eachentry : map.entrySet()) {
            System.out.println(eachentry);
        }

        System.out.println("----------------------------------------------------");

        //Solution 2

        List<String> list = Arrays.asList(str);
        for (String each : new LinkedHashSet<>(list)) {
            System.out.println(each + "=" + Collections.frequency(list, each));

        }

        System.out.println("----------------------------------------------------");

        //Solution 3

        Arrays.stream(str).distinct().forEach(e->
                System.out.println(e + "=" + Arrays.stream(str).filter(p-> p.equals(e)).count()));












    }
}

 /*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */
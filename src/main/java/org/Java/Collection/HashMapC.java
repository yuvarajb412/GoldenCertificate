package org.Java.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapC {
    public static void main(String[] args) {


        String s="This is a test. This test is only a test.";

        HashMap<String,Integer> map= new HashMap<>();
        String[]  strings=s.split("[. ]+");


        for (String s1 : strings){
            map.put(s1, map.getOrDefault(s1,0)+1);

        }
        System.out.println(map);

        String non="swiss";


        int[] arr = {1, 3, 2, 3, 4, 1, 3};
        HashMap<Integer,Integer> integerHashMap= new HashMap<>();

        for (int i=0;i<arr.length;i++){

            integerHashMap.put(arr[i],integerHashMap.getOrDefault(arr[i],0)+1);
        }
        System.out.println(integerHashMap);
        int value= 0;
        Integer key=0;
        for (Map.Entry<Integer,Integer> entry:integerHashMap.entrySet()){

            if(value < entry.getValue()){
                value=entry.getValue();
                key =entry.getKey();
            }

        }

        System.out.println(key+ " "+ value);


    }
}

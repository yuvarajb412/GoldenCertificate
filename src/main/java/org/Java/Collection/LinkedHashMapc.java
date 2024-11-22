package org.Java.Collection;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.LinkedHashMap;

public class LinkedHashMapc {
    public static void main(String[] args) {

        String s = "banana";


        LinkedHashMap<Character,Integer> characterLinkedHashMap = new LinkedHashMap<>();

        for (int i=0;i<s.length();i++){
            characterLinkedHashMap.put(s.charAt(i),characterLinkedHashMap.getOrDefault(s.charAt(i),0)+1);
        }

        System.out.println(characterLinkedHashMap);





    }
}

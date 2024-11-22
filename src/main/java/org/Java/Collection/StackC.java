package org.Java.Collection;

import java.util.Arrays;
import java.util.Stack;

public class StackC {
    public static void main(String[] args) {

        Stack<Integer> stack  = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);

        int size= stack.size();


        for (int i=0;i<size;i++){

            System.out.println("reverse"+ stack.peek());
            stack.pop();
        }

        String input = "madam";
        String reverse ="";


        Stack<Character> characters = new Stack<>();

        for (int i=0;i<input.length();i++){
            characters.push(input.charAt(i));
        }
        size = characters.size();

        for (int i=0;i<size;i++){

            reverse= reverse+characters.pop();
        }

        if (input.equals(reverse)){
            System.out.println("true"+ reverse);
        }else {
            System.out.println("false");
        }




    }
}
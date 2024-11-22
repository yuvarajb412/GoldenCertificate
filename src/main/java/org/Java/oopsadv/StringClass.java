package org.Java.oopsadv;

public class StringClass {

    public static void main(String[] args) {


        String s = "Hello";
        String s1 = new String("Hello");
        String s3 = s1.intern();

        System.out.println(s.equals(s1));
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s);
        System.out.println(s == s3);
        System.out.println(s1 == s3);
    }
}

package org.Java.oopsadv;

public class Wrapper {
    public static void main(String[] args) {

        Integer value = 100;
        Integer value1= 100;

        int autoValue =value;
        System.out.println(autoValue);
        System.out.println(value1.equals(value));
        System.out.println(value1==value);


        String str = "123";
        Integer s = Integer.parseInt(str);

        Integer aa = Integer.valueOf("45");
        System.out.println(aa);

        int some =100;
        String sss= Integer.toString(some);

        String s1 = s.toString();

           Integer x=200;

           String x1= String.valueOf(x);
           System.out.println(x1);
          Integer mm= Integer.valueOf(x1);


          int d =10;
         String k= String.valueOf(d);
          int m=  Integer.parseInt(k);

          Integer vv= 789;
         String c= vv.toString();
          Integer dd= Integer.valueOf(c);










    }
}

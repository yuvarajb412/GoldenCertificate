package org.Java.CodingPracticeoops;

public class SS {

    public static void main(String[] args) {


        String s = "this is epam systems";
        String[] ss= s.split(" ");
        StringBuffer buffer= new StringBuffer();



        for (int i=ss.length-1;i>=0;i--){

            buffer.append(ss[i]).append(" ");
        }

        System.out.println(buffer);

        s=new String(buffer);


    }

}

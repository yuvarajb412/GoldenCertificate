package org.Java.oopsadv;

public class Enum{
    public static void main(String[] args){

        System.out.println(WeeKDays.valueOf("MONDAY"));
        WeeKDays weeKDays=WeeKDays.FRIDAY;
        System.out.println( weeKDays.name());
        System.out.println(weeKDays.ordinal());


    }
}

enum WeeKDays {
    MONDAY("happy"),TUESDAY("sad"),WEDNESDAY("notbad"),THURSDAY("well"),FRIDAY("ok");

    private String value;



    private WeeKDays(String string){
        this.value=string;
    }

    static  int values=100;

}

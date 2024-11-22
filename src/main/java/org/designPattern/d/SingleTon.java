package org.designPattern.d;

public class SingleTon {
    private int value;
    private String name;
    private static SingleTon singleTon;

    private SingleTon(int value,String name){
   this.name=name;
   this.value=value;
    }

     //normal singleTon
    public static  SingleTon setInstance(int value,String name){
        if(singleTon == null){
            singleTon = new SingleTon(value,name);
            System.out.println("Hello");
        }

        return singleTon;
    }



    //synchronized
    public  synchronized static SingleTon setSynchronized(String value, int num){
        if(singleTon==null){
            singleTon =  new SingleTon(num,value);
        }
        return  singleTon;
    }

    //double Checker
    public static SingleTon setDoubleCheckerInstance(String value,int num){
        if (singleTon == null) {
            synchronized (SingleTon.class) {
                if (singleTon == null) {
                    singleTon = new SingleTon(num, value);
                }
            }
        }
        return singleTon;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Main{

    public static void main(String[] args) {

        SingleTon singleTon =SingleTon.setInstance(10,"Yuvaraj");
        SingleTon singleTon1 = SingleTon.setInstance(11,"yyyy");
        singleTon1.setName("deepan");

        System.out.println(singleTon1==singleTon1);



    }
}

package org.Java.Basic;



public class staticBlockAndNonStaticBlock {
    static  int  value;
    int normalValue;

    static {
        value =10;
        System.out.println("the static value is "+value);
    }
    {
        normalValue = 20;
        System.out.println("the normal value is "+ normalValue);
    }

}

class TORunATest{
    public static void main(String[] args) {


        staticBlockAndNonStaticBlock obj1 = new staticBlockAndNonStaticBlock();
        staticBlockAndNonStaticBlock obj2 = new staticBlockAndNonStaticBlock();
    }

}

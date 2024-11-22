package org.Java.oops;

import javax.crypto.spec.DESedeKeySpec;

public interface AB {

    default void Ab(){
        System.out.println("Ab");
    }

    default void cd(){
        System.out.println("abcd");
    }
}

interface CD {
    default void Ab(){
        System.out.println("Cd");
    }
}

class Y implements AB{

    public void dum(){
        System.out.println("dum");
    }

}

class ABCD{
    public static void main(String[] args){

        Y ab= new Y();
        ab.Ab();
        ab.cd();
        ab.dum();

    }

}

package org.Java.Basic;

import java.util.Arrays;

public class AscendingTwoDArray {

    public static void main(String[] args){


        int[] array = {20,10,37,23,56};



        for (int i=0;i<array.length;i++){
            for (int j=i;j<array.length;j++){

                if(array[i]>array[j]){
                    int store= array[i];
                    array[i]=array[j];
                    array[j]=store;

                }


            }

        }

        System.out.println(Arrays.toString(array));





    }


}

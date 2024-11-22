package org.Java.Basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OneDArray {

    int[] array1 = new int[]{
            10,20,30,40,50
    };

    public  int[]  makeAOneDaArray(int size){

        int[] array = new int[size];
        int start=0;
        for (int i=start;i < array.length;i++){
            array[i]= Math.abs(i-size);
        }
        return array;
    }




}
class TestToRun{
    public static void main(String[] args){

        OneDArray oneDArray = new OneDArray();
        int[] array= oneDArray.makeAOneDaArray(10);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int[] newArray=  Arrays.copyOf(array,20);
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.binarySearch(newArray,0));

        int[] one = {10,20,30,40};
        int[] two ={10,20,30,40};
        int[] three =  one;
        System.out.println(Arrays.equals(one,two));
        System.out.println(one==two);
    }

}

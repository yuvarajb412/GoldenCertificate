package org.Java.Basic;

import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args){

        int[][] twoD= {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for(int i=0; i<twoD.length;i++){

            for (int j=0; j<twoD[i].length;j++){

                System.out.println(i + " "+ j + " is :"+twoD[i][j]);
            }


        }

        int[][]  sample = new int[2][3];

        int value=10;
        for (int i=0;i<sample.length;i++){
            for (int j=0; j<sample[i].length;j++){

                sample[i][j]=value++;


            }
        }

        System.out.println(Arrays.deepToString(sample));

        int[][] sampleTwo= new int[][]{
                {10,11,12},
                {13,14,15}

        };
        int[][] sampleThree = sampleTwo;

        System.out.println(Arrays.deepEquals(sampleTwo,sample));
        System.out.println(sampleTwo==sample);
        System.out.println(sampleTwo==sampleThree);




    }
}

package day15arrays;

import java.util.Arrays;

public class C03_Arrays {

    //INTERWIEW QUESTIONS
    // [0,2,3,0,12,0] sifirlari sona at.
    public static void main(String[] args) {

        int original[] = {0,2,3,0,12,0};


        int yeni[] = new int[original.length];

        int idx = 0;

        for (int i = 0; i < original.length ; i++) {

            if(original[i]!= 0){
                yeni[idx] = original[i];


                idx++;

            }

        }
        System.out.println(Arrays.toString(yeni));//[2, 3, 12, 0, 0, 0]



    }

}

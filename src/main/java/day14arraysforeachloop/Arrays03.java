package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: String bir array olusturunuz , 6 tane eleman yerlestiriniz , character sayisi 5'den cok olanlari siliniz.

        String colors[] = new String[6];

        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));

        // Logic : Yeni bir array olusturup , character sayisi 5 ve 5'den kucuk olan elemanlari yeni array'e transfer
        //        edecegiz. Boylelikle yeni array'de character sayisi 5'den buyuk olan hicbir eleman olmayacak.

        //Soru: Hocam , array olusturmek icin iki sey belirlenmelidir.
        //      1) Elelmanlarin data type'i
        //      2) Yeni array'de kac tane elemen olacak.

        // Verilen array'de character sayisi 5 ve 5'den kucuk olan kac eleman var bulmaliyiz.
        int counter = 0;

        for(String w : colors){
            if(w.length()<=5){
                counter++;
            }
        }

        // yeni array'e transfer et

        String newColars[] = new String[counter];

        int idx = 0;

        for(String w : colors){

            if (w.length()<=5){
                newColars[idx] = w;
                idx++;
            }

        }
        System.out.println(Arrays.toString(newColars));//Red,Blue,Green,Brown


    }


}

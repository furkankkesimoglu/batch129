package day12loops;

import java.util.Scanner;

public class C01_ForLoopIfElse {

    /*
      Kullanicidan baslangic ve bitis degerlerini alin

      Baslangic degerinden baslayip bitis degerine kadar tum tamsayilari

      Ekrana yazdiriniz.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen baslangic degerini giriniz");

        int baslangic = input.nextInt();//10

        System.out.println("Lutfen bitis degerini giriniz");

        int bitis = input.nextInt();//15


        if(baslangic>bitis){

            System.out.println("Verdiginiz baslangic degeri bitisten kucuk olmali");
        }else {

            for (int i = baslangic; i <= bitis; i++) {

                System.out.print(i + " ");

            }// fori body

        }



    }//main


}//class

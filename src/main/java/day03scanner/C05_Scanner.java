package day03scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin en ve boyunu alan ve dikdortgenin alan ve cevresini hesaplayan kodu yaziniz.
        //en:2 boy:10
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz..");

        int en = input.nextInt();//2

        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz..");
        int boy = input.nextInt();//10

        System.out.println("Alan ==> "+ en*boy);//20
        System.out.println("Cevre ==> "+ 2*(en+boy));//24
    }

}

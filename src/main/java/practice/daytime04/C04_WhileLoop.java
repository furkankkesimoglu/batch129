package practice.daytime04;

import java.util.Scanner;

public class C04_WhileLoop {

        /*
    Interwiew Questions
     Kullanicidan toplanmak uzere sayilar isteyin
     sayi adedi 10'u gecerse veya toplam 500 'u gecerse
     bu kadar sayi yeter
     ".... adet sayi girdiniz , toplami..." yazdirin
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi = 0;

        int toplam = 0;

        int sayac = 0;

        while (sayac<11 && toplam<501){

            System.out.println("lutfen toplanmak uzere sayi giriniz");

            sayi=input.nextInt();//her adimda gozuksun diye loop icinde yazdik

            toplam+=sayi;

            sayac++;


        }

        if (toplam>500){

            System.out.println(sayac+ "adet sayi girdiniz. toplami "+toplam);
        }else
            System.out.println("Bu kadar sayi yeter. "+sayac+" adet sayi girdiniz toplam "+toplam);


    }

}

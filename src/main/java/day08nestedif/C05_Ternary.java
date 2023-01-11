package day08nestedif;

import java.util.Scanner;

public class C05_Ternary {

    // Kullanicidan bir sayi alin ve mutlak degerini yazdirin.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int sayi = input.nextInt();


        System.out.println(sayi<=0 ?  -1*sayi  :  sayi);  // ? dogruysa     : yanlissa


        //Kullanicidan bir sayi aliniz pozitifse pozotof negatifse negatif yazdirin

        System.out.println("Lutfen bir sayi giriniz");

        int sayi1 = input.nextInt();

        String sonuc = sayi1>= 0 ? "pozitif" : "negatif";

        System.out.println(sonuc);

        //Kullanicidan bir sayi aliniz pozitifse pozotof negatifse sayinin karesini yazdirin

    }
}

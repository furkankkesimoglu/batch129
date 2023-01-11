package day07ifstatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        /*
        Iki tane String datanin birbirine esit olup olmadigini anlamak icin "==" degil ; equals () methodunu kullaniriz.

        1)equals methodu==> Buyuk kucuk harf onemser.
        2)equalsIgnoreCase methodu==> buyuk kucuk harf onemsemez

         */


        // KUllanicidan gun isimlerini aliniz haftaici mi haftasonu mu oldugunu yazdiran kodu olusturunuz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen gun ismi giriniz");

        String gunIsmi = input.next();

        if (gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Haftasonu");
        } else if (gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Haftaici");
        } else {
            System.out.println("Gecerli bir gun giriniz");
        }

        //2.Yol

        boolean haftaIci = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");

        boolean haftaSonu = gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar");

        if (haftaIci) {
            System.out.println("haftaici");
        } else if (haftaSonu) {
            System.out.println("haftasonu");
        } else {
            System.out.println("Lutfen gecerli bir gun giriniz");
        }//else body


    }


}

package day05typecastinstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {


        /*

         Ornek 1 = Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
         1) En az 8 character olsun
         2) Space character'i password'de olmasin
         3) En az bir tane buyuk harf olsun.
         4) En az bir tane kucuk harf olsun
         5) En az bir tane sembol olsun
         6) En az bir tane rakam olsun

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen password'unuzu giriniz...");
        String pwd = input.nextLine();

        //1) En az 8 character olsun
        boolean first = pwd.length()>7;
        System.out.println(first);

        //2) Space character'i password'de olmasin
        boolean second = !pwd.contains(" ");
        System.out.println(second);

        //3) En az bir tane buyuk harf olsun.
        //Note= Buyuk harf olmayanlari sil
        //  kalan character sayisina bak
        //   character sayisi sifir ise buyuk harf yok demektir.
        //    sifirdan buyukse buyuk harf var demektir.
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;//methodlari ayni satirda yanyana kullanmaya
        // method chain denir.
        System.out.println(third);

        //4) En az bir tane kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);

        //5) En az bir tane sembol(harf ve rakam harici her sey) olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

        // 6) En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);

        System.out.println("Password gecerli mi?" + (first && second && third && fourth && fifth && sixth));


    }


}

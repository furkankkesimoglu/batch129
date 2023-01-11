package calismasayfasi;

import java.util.Scanner;

public class Asd {

    public static void main(String[] args) {

      /*  6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
                değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");

        char harf = input.next().charAt(0);

        switch (harf){
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
                System.out.println("Sesli harfdir");
                break;
            case 'b':
                System.out.println("Sesli harf degildir");
            default:
                System.out.println("Hatali giris yaptiniz");  */



        // Girilen String değerde tersten yazan Java kodunu yazınız.

        String kelime = "Java";

        String str = "";

        for (int i = kelime.length()-1;i >= 0 ; i--) {

            char s = kelime.charAt(i);

            str+= s;

        }
        System.out.println(str);//avaJ








        }




    }



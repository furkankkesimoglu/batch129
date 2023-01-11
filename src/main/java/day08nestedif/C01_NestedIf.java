package day08nestedif;

import java.util.Scanner;

public class C01_NestedIf {

    /*
      TASK: Kullanicidan 3 tane pozitif bir tam sayi aliniz.
            bu 3 sayinin ucgen olusturma durumunu kontrol ediniz.
            Eger ucgen ise eskenar ucgen olma durumunu kontrol ediniz.

            INFO:
            Ucgen olma sarti: herhangi iki kenar toplami ucuncu kenardan buyuk olmali.
                              herhangi iki kenar farki ucuncu kenardan kucuk olmali.

                              a+b>c>a-b
                              a+c>b>a-c
                              b+c>a>b-c
                              a=b=c boyle ise eskenar ucgen

                              java nested kodlari calistirirken cok zaman harciyor
                              buna "time complexity" deniyor
                              bu yuzden mumkunse nested kod yazilmamali

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {//ucgen olma durumu


            if (a == b && b == c && a == c) {
                System.out.println("Eskenar ucgendir");
            }else {
                System.out.println("Ucgen ama Eskenar ucgen degildir");
            }
        }else{
            System.out.println("Ucgen degildir");
        }

        //Kullanicidan bir ucgenin kenar uzunlugunu aliniz. Uc kenari birbirine esit ise eskenar ucgen yazdiriniz.
        //sadece iki kenar uzunlugu birbirine esit ise ikizkenar ucgen yazdiriniz.
        //Tum kenarlari birbirinden farkli ise cesitkenar ucgen yazdiriniz.

        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");

        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();

        if(d + e > f && d - e < f && d + f > e && d - f < e && e + f > d && e - f < d){

            if (d == e && e == f) {
                System.out.println("Eskenar ucgen");
            } else if (d == e || e == f || d == f) {
                System.out.println("Ikizkenar Ucgen");
            } else {
                System.out.println("Cesitkenar ucgen");
            }
        }else{
            System.out.println("Ucgen degildir");
        }






    }


}

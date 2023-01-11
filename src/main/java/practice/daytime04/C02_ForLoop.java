package practice.daytime04;

import java.util.Scanner;

public class C02_ForLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan String bir ifade aliniz
        Harflerini alt alta gelecek sekilde " " bosluk veya 'a' harfi geldiginde yazdirmayan diger karakterleri
        yazdiran kodu yaziniz.


         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen String bir ifade giriniz");

        String str = input.nextLine();// gazi antep


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)== 'a' || str.charAt(i) == ' '){

                continue;// bosver yazdirma anlaminda

            }
            System.out.print(str.charAt(i));//gzintep
        }



    }

}

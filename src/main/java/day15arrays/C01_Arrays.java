package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {

    public static void main(String[] args) {

        //Bir ogretmenin okulundaki ogrencilerin isimlerini applicationa yuklemesini saglayan kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz");

        int numOfStdnt = input.nextInt();

        String names[] = new String[numOfStdnt];

        System.out.println("Lutfen cikmak istiyorsaniz Q harfine basiniz");

        for (int i = 1; i <= numOfStdnt ; i++) {

            System.out.println("Lutfen"+ i + ". ogrencinin ismini giriniz");

            String stdname = input.next();

            if (stdname.equalsIgnoreCase("Q")){
                break;

            }
            names[i-1]= stdname;

        }
        System.out.println(Arrays.toString(names));


    }


}

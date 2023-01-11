package day20passbyvalueoverloading;

import java.util.Arrays;

public class C03_PassByValueArray {

    public static void main(String[] args) {

        int sayilar[] = {3,4,5,6};

        elemanDegistir(sayilar);

        System.out.println("main icinde eleman degisince sayilar[] = " + Arrays.toString(sayilar));

        arrayiDegistir(sayilar);
        System.out.println("arrayiDegistir(); = " +Arrays.toString(sayilar));//[10,4,5,6]

    }

    private static void arrayiDegistir(int[] sayilar) {

        sayilar = new int[6];

        System.out.println("Arrays sayilar = "+ Arrays.toString(sayilar));//[0, 0, 0, 0, 0, 0]

    }

    private static void elemanDegistir(int[] sayilar) {

        sayilar[0] = 10;
        System.out.println("method icinde eleman degisince sayilar[] = " + Arrays.toString(sayilar));//[10, 4, 5, 6]

    }


}

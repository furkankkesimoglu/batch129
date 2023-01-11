package day16multidimensionalarrays;

import java.util.Arrays;

public class C01_MultidimensionalArrays {

    public static void main(String[] args) {

        /*
        Bir Array'in icindeki data bir Array'se buna multidimensional array denir.

         */

        //Multidimensional Array'ler nasil olusturulur?

        int arr[][]= new int[3][2];//auter array ==> 3

        //inner array = 2 olan bir multidimensional array olusturduk

        //Bu yontemle inner arrayler sabit olmak zorunda

        System.out.println(Arrays.toString(arr));//[[I@19dfb72a, [I@17c68925, [I@7e0ea639]

        //Icindeki data non-primitive oldugu icin adresleri gorurum

        System.out.println(Arrays.toString(arr[1]));//[0, 0]

        System.out.println(Arrays.toString(arr[2]));//[0, 0]

        System.out.println(Arrays.deepToString(arr));//Multidimensional Arrayler bu sekilde yazilir.
        //[[0, 0], [0, 0], [0, 0]]

        //Arraylere eleman eklemeninn 2. yontemi ile hem declare edip hem de deger atama yontemi

        int arr2[][] = { {2,3},{9},{78,6,4,5} };

        System.out.println("Hem declare hemde deger atama ile" + Arrays.deepToString(arr2));//[[2, 3], [9], [78, 6, 4, 5]]

        System.out.println("Hem declare hemde deger atama ile" + Arrays.toString(arr2[2]));//[78, 6, 4, 5]

        System.out.println("Hem declare hemde deger atama ile" + Arrays.toString(arr2[0]));//[2,3]

        System.out.println("Hem declare hemde deger atama ile" + Arrays.toString(arr2[1]));//[9]

        // Array'lerde index alinir!!!!!!

        // Multidimensioanl Array'lere eleman ekleme ?

        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]]

        System.out.println(Arrays.toString(arr[1]));//[6, 18]

        System.out.println(arr[1][0]);//6

        //Ex: String bir multidimensional Array olusturun icerisine datalari ekleyin
        //toplam elaman sayisini ekrana yazdirin.

        String brr[][] = new String[3][2];

        brr[0][0]="a";
        brr[0][1]="b";

        brr[1][0]="c";
        brr[1][1]="d";

        brr[2][0]="e";
        brr[2][1]="f";

        System.out.println(Arrays.deepToString(brr));//[[a, b], [c, d], [e, f]]

        int sum = 0;//toplam kac daire oldugu bilgisi

        for (String[] w : brr) {       //w: each (her bir) w:array

            sum = sum+ w.length;

        }
        System.out.println(sum);//6




    }

}

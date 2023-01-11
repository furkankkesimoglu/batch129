package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        //Note1: sort() methodu sayisal data type'lerini kucukten buyuge siralar. (ascending order)
        //Note2: sort() methodu String data type'lerini alfabetik olarak siralar.(alphabetical order)
        //Note3: ascending order + alphabetical order ==> natural order
        //Note4: sort() methodu array elemanlarini "Natural order" a gore siralar.

        //binarySearch() method'u bir elemanin bir array'de olup olmadigini kontrol eder.
        //binarySearch() method'unu kullanmadan once sort() methodunu kullaniriz
        // sort() methodunu kullanmazsaniz buldugunuz sonuc guvenilir olmaz.

        String colors[] = new String[6];

        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));//Blue , Brown , Green , Orange , Red , Yellow

        int num1 = Arrays.binarySearch(colors,"Blue");

        System.out.println(num1);//0 ==> var hem de index'i sifir(0)

        int num2 = Arrays.binarySearch(colors , "Orange");
        System.out.println(num2);//3

        int num3 = Arrays.binarySearch(colors , "Tarik");
        System.out.println(num3);// -6 ==> "-" bu eleman yok demek    "6" ise olsaydi 6. eleman olurdu demek

    }

}

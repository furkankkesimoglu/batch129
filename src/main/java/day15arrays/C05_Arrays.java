package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class C05_Arrays {

    public static void main(String[] args) {

        //Arama motorunda guzel isimler adli bi application icin isimleri kucukten buyuge siralayan kodu yaziniz.

        String arr[] = {"Abdurrahman","Furkan","Emre","Can","Yunus","Ali","Veli"};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(arr));//[Can,Ali, Emre, Veli, Yunus, Furkan, Abdurrahman]

        //String Array elemanlarini karakter sayisina gore ve ayni karakter sayisinda olanlari alfabetik siraya gore
        // ve tersten buykten kucuge gore siralayiniz..                                         (natural order)

        String brr[] = {"Abdurrahman","Furkan","Emre","Can","Yunus","Ali","Veli"};

        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));

        System.out.println(Arrays.toString(brr));//alfabetik siraya gore buyukten kucuge siraladik








    }

}

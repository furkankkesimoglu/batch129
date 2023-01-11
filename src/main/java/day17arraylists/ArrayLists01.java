package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {

    /*
    1) Array lists'ler coklu data depolamak icin kullanilir.
    2) Array list'ler non-primitive data type'indeki coklu datalari depolamak icin kullanilir.
       List'ler "non-primitive" data kabul ederler , "Array" ler ise primitive data veya reference kabul eder.
    3) Array list'leri(List) olsutururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
       List'ler eleman sayisinde "flexible" dirlar ama "Array"'ler flexible degildir.
    4) Madem array'ler eleman sayisinde flexible degil nicin Java "Array" leri iptal etmedi ?
       i) elelman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
       ii) Array'ler cok hizli calisir.
       iii) Array'ler memory'de cok az yer kaplar.

     */

    public static void main(String[] args) {

        //list nasil olusturulur ?
        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages);// []

        //List'lere eleman nasil eklenir ?

        ages.add(12);     // add methodu elemanlari sizin verdiginiz siraya gore list'in icine ekler.(Insert order)
        ages.add(9);   // add methodu eleman eklemek icin kullanilir.
        ages.add(10);
        ages.add(888);
        ages.add(1,656);
        ages.add(3,777);
        System.out.println(ages);// [12, 656, 9, 777, 10, 888]

        //List'e coklu eleman nasil eklenir ? veya list'e baska bir list nasil eklenir
        // Bir "List" coklu eleman eklemek, o elemanlari once bir list'in icine koymalisiniz.

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages);// [12, 656, 8, 9, 10, 9, 777, 10, 888, 8, 9, 10]

        //ages.clear(); // Bir list'deki tum elemanlari clear methodu siler.
        //System.out.println(ages);//[]

       boolean r = ages.contains(656); // contains : var mi yok mu diye kontrol ediyo
        System.out.println(r);//true

        //Bir list'in baska bir list ile ayni olup olmadigini nasil kontrol ederiz ?

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false      Ayni index'te ayni eleman olmali.


        //Example 1: Verilen iki Integer list'de tamamiyle ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.

        ArrayList<Integer> nums1 = new ArrayList<>();

        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);     //Collections.sort() List'deki elemanları alıp küçükten büyüğe sıraladı
                                     //

        boolean t = nums1.equals(nums2);
        System.out.println(t);//true














    }


}

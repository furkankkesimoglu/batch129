package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {

        List<Character> initials = new ArrayList<>();
        // Arraylist olustururken sag tarafa array list yazmak zorundasiniz
        // ama sol tarafa ister "arraylist" yazin isterse "list" yazin ikiside calisir

        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir list de kac eleman oldgunu nasil anlariz ?

        int numOfElement = initials.size();     //Array'lerin "length" 'i  List'lerin "size" 'i.......
        System.out.println(numOfElement);// 4   // Array'lerden bahsederken ==> length
                                                // List'lerden bahsederken ==> size


        //Bir list'ten istenen bir eleman nasil alinir ?
       char u =  initials.get(2);
        System.out.println(u);// M

        //Example 1: Verilen bir String list'teki elemanlarin toplam karakter sayisini bulan kodu yaziniz.

        List<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        // Tekrarli islemler icin loop kullanilir

        int sum = 0;

        //1.Yol : (Tavsiye edilen)

        for (String w : cities) {
            sum = sum + w.length();
        }
        System.out.println(sum);//26

        //2.Yol :

        int toplam = 0;

        for (int i = 0; i < cities.size() ; i++) {
            toplam = toplam + cities.get(i).length();
        }
        System.out.println(toplam);//26

        //Bir list'deki istenen bir elemani nasil degistirebiliriz?

        cities.set(0,"New York");    //set

        System.out.println(cities);//[New York, Istanbul, Kayseri, Almaty]

        //Example 2: Maas list'i olusturunuz ve maaslara %20 zam yapiniz.

        List<Double> salary = new ArrayList<>();

        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);//[19500.25, 8500.75, 32500.5]
                                 // for-each-loop da index yok set de yok.

        //1.Yol :

        int idx = 0;

        for (Double w : salary) {
            salary.set(idx,w*1.20);
            idx++;
        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]

        //2.Yol :

        for (int i = 0; i < salary.size(); i++) {

            salary.set(i, salary.get(i)*1.20);

        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]



    }

}

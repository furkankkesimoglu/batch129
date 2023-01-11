package day05typecastinstringmanipulations;

public class TypeCasting01 {

    /*
    Numeric primitive data type'lerinin birbirine donusturulmesine "Type Casting" denir.
    Numeric data type'lar byte - short - int - long - float - double..

    note= Kucuk data type'ini buyuk data type'ine cevirmeyi data otomatik olarak yapabilir bu isleme "Autowidening"
    (Otomatik Genisletme) denir.

    note= Buyuk data type'lerini kucuk data type'lerine cevirmek riskli bir istir Java bu riskli isi otomatik olarak
    yapmaz. Bu isi kod yazanlar yapar.
    Bu isleme "ExplicitNorrawing" (Aciktan Daraltma) denir.

     */

    public static void main(String[] args) {

        //byte data type'ini int data type'ine ceviriniz.
        byte age = 13;
        int ageInt = age;//Autowidening

        //Long data type'ini short data type'ine ceviriniz.
        long weight = 234;
        short weightShort =(short)weight;//ExplicitNorrowing

        //int data type'ini float data type'ine ceviriniz.
        int population = 700000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);

        //double data type'ini short data type'ine ceviriniz.
        double number = 12.234;
        System.out.println(number);//12.234

        short numberShort = (short) number;
        System.out.println(numberShort);//12

        //Dikkat!
        //Donusum yaptiginiz sayi(260) donuseceginiz data type'inin sinirlari disinda ise Java kullanidiginiz sayi ile
        // mod islemi yapar ve mod islemi sonucu sizin yeni degeriniz olur.

        //Ornek 1=
        short num = 260;
        System.out.println(num);//260

        // Java 260 i 256 ya boler kalani yazar.(short ta 256 tane sayi var)
        byte numByte = (byte) num;
        System.out.println(numByte);//4

        //Ornek 2 =
        short n = 1023;
        System.out.println(n);//1023

        byte nByte = (byte) n;
        System.out.println(nByte);//-1



    }
}

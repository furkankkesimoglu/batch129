package day05typecastinstringmanipulations;

public class StringManipulations01 {

    //String bir non-primitive data type'dir ve ayni zamanda bir class'tir.

    public static void main(String[] args) {

        String s = "Java is easy ";

        //Ornek 1= "s" String'deki tum characterleri buyuk harf yapiniz.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        //Ornek 2 = "s" String'deki tum characterleri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek 3 = "s" String'deki ilk character'i aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Ornek 4 = "s" String'deki ikinci ve sondan ikinci character'i aliniz ve ekranda yanyana yazdiriniz.
        char secondChar = s.charAt(1);//a

        char secondLastChar = s.charAt(10);//s

        //1.Yol Ayni satirda yazdirmak icin.
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2.Yol Ayni satirda yazdirmak icin.
        System.out.println("" + secondChar + secondLastChar);//as

        //Ornek 5 = "s" String'indeki kullanilan character sayisini bulunuz.
        int sLength = s.length();
        System.out.println(sLength);//12

        //Ornek 6 = "s" String'indeki ilk 4 characteri aliniz.

        //substring(0,4) ==> "0" yani ilk index dahil, "4" yani ikinci index harictir.
        String sub1 = s.substring(0,4);
        System.out.println(sub1);//Java

        //Ornek 7 = "s" String'indeki "is" kelimesini aliniz.
        String sub2 = s.substring(5,7);
        System.out.println(sub2);//is

        //Ornek 8 = "s" String'indeki "easy" kelimesini aliniz.
        String sub3 = s.substring(8,12);
        System.out.println(sub3);//easy

        // Bir character'den baslayip STring'in sonuna kadar almak isterseniz, ikinci index'i yazmayiniz.
        //s.substring(8,12); yerine s.substring(8); yaziniz.
        String sub4 = s.substring(8);
        System.out.println(sub4);//easy

        //Java da String'ler buyuk kucuk harfe duyarlidir.

        //Ornek 9 = "s" String'inde "money" kelimesinin varolup olmadigini kontrol ediniz.
        boolean isExIst = s.contains("money");
        System.out.println(isExIst);//false

        boolean isExIs = s.contains("s");
        System.out.println(isExIs);//true

        /*

        Bir method ogrenirken 3 sey mutlaka ogrenin;
        1)Bu method ne is yapar?
        2)Bu method'un farkli kullanimlari nasildir?
        3)Bu method size return(sonuc) eder?

         */

        //Ornek 10 = "s" String'inin belli bir harf ile baslayip baslmadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        //Ornek 11 = "s" String'inin 6. character'den itibaren belli bir harf ile baslayip baslmadigini kontrol ediniz.
        boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);//true




    }

}

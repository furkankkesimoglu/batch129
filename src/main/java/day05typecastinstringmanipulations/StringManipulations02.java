package day05typecastinstringmanipulations;

public class StringManipulations02 {


    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Ornek 1 = "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);//true

        //Ornek 2 = "s" String'indeki "money" kelimesinin "dollar" kelimesine ceviriniz.
        String newS1 = s.replace("money","dollar");
        System.out.println(newS1);//Learn Java earn dollar

        //Ornek 3 = "s" String'indeki "earn" kelimesinin "win" kelimesine ceviriniz.
        String s2 = s.replace("earn","win");
        System.out.println(s2);//Lwin Java win money

        //note= Replace method'unda coklu character ile calisirsaniz mecbur " kullanacaksiniz
        // tek caharacter ile calisacaksniz tek tirnak kullanabilirsiniz.
        //Note= ama ya ikiside cift tirnak olmalidir yada ikiside tek tirnak olmalidir.

        //Ornek 4 = "s" String'indeki "a" harflerini "*" a ceviriniz.
        String s3 = s.replace('a','*');
        System.out.println(s3);//Le*rn J*v* e*rn money

        //Ornek 5 = "s" String'indeki "n" harflerini "xxx" a ceviriniz.
        String s4 = s.replace("n","xxx");
        System.out.println(s4);//Learxxx Java earxxx moxxxey

        //Ornek 6 = "s" String'indeki butun "e" harflerini siliniz.
        String s5 = s.replace("e","");
        System.out.println(s5);//Larn Java arn mony
        //Note= "Hicbir sey" char data type'inde yok bu yuzden replace methodu kullanarak silme islemi yaparsaniz
        // mutlaka cift tirnak kullaniniz.

        String t = "Ali 13 yasindadir!...";

        //Ornek 7 = "t" String'indeki tum rakamlari "*" a ceviriniz.
        //Note= Bir grup data yi degistirmek icin replaceAll kullanilir.
        //Note= Bir grup data'yi ifade etmek icin "Regular Expressions"(regex) kullaniriz.
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);//Ali ** yasindadir!...

        /*

        Meshur Regex'ler
        1) Tum rakamlari ==> [0-9]
        2)Tum kucuk harfler ==> [a-z]
        3)Tum buyuk harfler ==> [A-Z]
        4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]
           x , q , w harfleri ==> [xqw]

        8) Kucuk harflerden farkli tum character'ler ==> [^]
        9) Tum harflerden farkli tum characterler ==> [^a-zA-Z]


         */

        //Ornek 8 = "t" String'indeki tum rakamlari ve harfleri "!" e ceviriniz.
        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);//!!! !! !!!!!!!!!!!...

        //Ornek 9 = "t" String'indeki tum sesli harfleri "?" e ceviriniz.
        String t3 = t.replaceAll("[aeiou]","?");
        System.out.println(t3);//Al? 13 y?s?nd?d?r!...

        //Ornek 10 = "t" String'indeki kucuk harfler disindaki tum characterleri "<>" e ceviriniz.
        String t4 = t.replaceAll("[^a-z]","<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

        //Ornek 11 = "t" String'indeki tum harfler disindaki tum characterleri "+" e ceviriniz.
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);//Ali++++yasindadir++++

        //Ornek 12 = "t" String'indeki space'ler disindaki tum characterleri "$" e ceviriniz.
        String t6 = t.replaceAll("[^ ]","TL");
        System.out.println(t6);//TLTLTL TLTL TLTLTLTLTLTLTLTLTLTLTLTLTLTL

        //Ornek 13 = "t" String'indeki sesli harfler disindaki tum character'leri "&" ceviriniz.
        String t7 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t7);//A&i&&&&&a&i&&a&i&&&&&




    }
}

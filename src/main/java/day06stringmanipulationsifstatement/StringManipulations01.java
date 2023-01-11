package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Ornek 1= Bir String'in bas ve sonunda space character'i varsa siliniz.
        //          " Ali Can   "   ==>     "Ali Can"

        String s = "  Ali Can  ";

        System.out.println(s);

        // trim () method'u bir String'in bas ve sondaki space character'lerini siler aradaki space'lere dokunmaz.
        String sTrimmed = s.trim();

        System.out.println(sTrimmed);

        //Ornek 2 = asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //          String tv = "$456.99";    String laptop = "$875.99";  ==> 456.99 + 875.99 = 1332.98

        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$","");
        System.out.println(tv2);//456.99 ==> ondalik sayilar java da otomatik olarak double kabul edilir.

        String laptop2 = laptop1.replace("$","");
        System.out.println(laptop2);//875.99

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98

        //Ornek 3 = Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdiriniz.
        //         "Ali Can" ==>AC

        String name = "   ali cAN   ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);//C

        System.out.println(""+ first + second);//AC

        //Ornek 4 = Bir String'in hic karakter icermedigini(Bos String) kontrol eden kodu yaziniz..

        String str = "";

        //1.Yol Length kullan ==> length karakter sayisini verir.
        boolean result1 = str.length()==0;
        System.out.println("String bos mu? " + result1);//true

        //2.Yol
        //Java bir konuda method uretmisse o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu?" + result2);//true

        //Ornek 5 = Bir String'in space haric hicbir character icermedigini kontrol ediniz.

        String t = "     ";

        //1.Yol
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var?" + result3);//false

        //2.Yol
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println("Sadece space mi var?" + result4);//false

        //3.Yol
        //isBlank() methodu sadece space iceren String'ler icin true verir , space disinda bir character icerirse false verir.
        //isBlank() methodu bos Stringler icin de true verir.
        //isBlank() ==> space + hicbi sey icin true verir..      isEmpty ==> hicbisey icin true

        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var?" + result5);//false

        //Ornek 6 = Bir String'de index'i a,e,i character'lerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //         "Java is easy to learn" ==> 1 + 5 + 8 = 14

        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Index'ler toplami : "+(idxA+idxI+idxE));//Indexler toplami : 14

        //Ornek 7 = Bir String'de "java" kelimesin ilk olarak kacinci index'de kullanildigini gosteren kodu yaziniz.
        //         "Ah Java vah Java sensiz olmuyor Java."

        String u = "Ah Java vah Java sensiz olmuyor Java.";

        //indexOf("Java") kullaniminda siz"Java" kelimesinin ilk gorunumundeki ilk harfin (Yani J nin) index'ini almis olursunuz.

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //indexOf methodu olmayan character'ler icin kullanilirsa her zaman (-1) verir.

        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);// -1

        //Ornek 8 = Bir String'de a , i , e character'lerinin "son" gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //         "Java is easy to learn" ==> 5 + 17 + 18 = 40

        String v = "Java is easy to learn";

        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);//18

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        System.out.println(idxOfA+idxOfI+idxOfE);//40

        //Note = LastIndexOf() String'de olmayan bir character icin kullanilirsa her character icin (-1)' i verir..

        //Ornek 9 = Bir String'deki tekrarsiz character'leri ekrana yazdiriniz.
        //          abbcccdc ==> ad

        //NOte = Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //     Bazi kodlari bazi sartlara gore aktife etmek icin "if statement" kullanilir.
        //     if you study hard, you will learn Java.

        //Ornek 10 = Sayi pozitif ise ekrana cift yazdirin..

        int num = 12;

        if(num>0){
            System.out.println("Pozitif");
        }

        //Ornek 11 = Sayi -1 ile 10 arasinda ise ekrana rakam yazdirin.

        int number = 3;

        if(number>-1 && number<10){
            System.out.println("Rakam");
        }




    }

}

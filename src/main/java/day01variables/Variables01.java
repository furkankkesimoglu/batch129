package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable olusturmak
        //Java cumlesi = Statement
        //Java'da esittir demek "==" , Yani Matematik'de "=" , java'da "=="
        //Java'da "=" "assignment operator" dir. Sagdaki degeri alir soldaki kutuya koyar
        //Access Modifier yazmazsanız "access modifier" "default" demektir
        //Data Type + Variable Name ==> Variable Declaration
        //Assignment Operator + Variable degeri ==> Assignment
        //Default degerler sayilar icin sifirdir.
        //Data Type'ini yaziniz   Variable ismi yaziniz   Atama operatoru    Variable degeri   Ingilizcedeki nokta gibi
             int                             age                 =                 13                   ;

             //Ornek 1 : Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
             //String'lere verilen degerler cift tırnak icinde olmalidir.
             //String'ler icin "default value" "null" dir.
             String studentName = "Ali Can";

             /*
               Java'da temelde iki tip data vardir;
               1)primitive data type:
                 char:tek karakterler icin kullanılır.
                 boolean: boolean'lar sadece iki farkli deger alabilirler; true veya false
                 byte: -128 den +127 e kadar tamsayi degerleri icin kullanilir
                 short: -32768 ile 32767 arasindaki tamsayilar icin kullanılır
                 int: -2,345,654,765 ile 2,345,654,764 arasindaki sayilar icin kullanılir
                 long: -9,223,372,836,854,775,888 ile 9,223,372,836,854,775,887 arasindeki sayilar icindir
                 float:
                 double:
               2)non-primitive data type
              */

        //Ornek 2: char data type'inda ilk ismin ilk harfi olarak bir variable oluşturunuz ve bir deger atayiniz.
        //Note: char data type'inde degerler tek tirnak icine konulmalidir.
        char isminİlkHarf = 'A';

        //Ornek 3: boolean data type'inde emeklimisin icin bir variable olusturun ve false degerini atayin.
        boolean emeklimisin = false;

        //Ornek 4: byte data type inde ogrenci yasi icin bir variable olusturunuz ve deger atayiniz
        byte studentAge = 23;

        //Ornek 5: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 1200;

        //Ornek 6: Ulke nufuslari icin bir variable olusturup deger atamasi yapiniz.
        int countryPopulation = 1864184648;

        //Ornek 7: insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz
        //Note: Bir deger long ise sonuna "L"(Tercih edilir) veya "l" konulur
        long cellNumberInHumanBody = 87654321356788L;

        //Eger long'a atadigimiz deger int'lerin aralıgında ise sonuna "L" koymaya gerek yok
        long weightOfSun = 1234567;









    }

    }

package day04memorykullanimiwrapperclassascii;

public class C04_WrapperClass {

    /*
    Non-primitive data turleri sadece dat barindirmak icin degil ayni zamanda method'larda bulundurur.
    primitive data turleri ise sadece deger saklar.
    Java bu duruma bir cozum uretmsitir.
    Her primitive data turunu non-primitive olarak kullnabilmek icin ozel class'lar olsuturmustur.
    Oracle firmasinin urunu olan Java primitivelere method ekleyerek olusturduklari bu yeni yapiya Wrapper Class adini vermsitir


    Primitive          Wrapper
      byte      ==>      Byte
      short     ==>      Short
      int       ==>      Integer  ****
      long      ==>      Long
      float     ==>      Float
      double    ==>      Double
      boolean   ==>      Boolean
      char      ==>      Character  *****

     */

    public static void main(String[] args) {

        byte primitiveByte = 12;//primitive data type'larina nokta koydugumuzda bir method gelmez.
        Byte wrapperByte = 12;//wrapper class'larda nokta koydugumuzda bir cok method kullanabiliriz.


        //Ornek = byte data type'inin en kucuk ve en buyuk degerini yazdirin..

        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        //Ornek= short  int  long  data typelarinin max ve min degerlerini yazan kodu yaziniz..

        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647

        System.out.println(Long.MIN_VALUE);//-9223372036854775808
        System.out.println(Long.MAX_VALUE);//9223372036854775807



        //********Primitive'ler Wrapper Class'lara nasil cevrilir(Autoboxing) **********

        float f1 = 13.99F;//kucuk kutu primitive

        Float wrapperF1 = f1;

        //*********** Wrapper Class'lari Primitive data type'larina nasil cevrilir(Unboxing)*******

        Character wrapper1 = 's';
        char primitiveW1 = wrapper1;

        //Note= Autoboxing ve Unboxing Java tarafindan otomatik yapilir.EKstra kod yazmaya gerek yoktur.

        //Ornek= Verilen iki String datanin toplamini veren kodu yaziniz.

        String str1 = "12345";
        String str2 = "6789";
        System.out.println(str1+str2);//123456789 yan yana yazdrdi.
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));//19134




    }


}

package day09incrementdecrementternaryswitch;

public class NestedTernary01 {

    public static void main(String[] args) {

        //Ornek 1 : Verilen yilin "Artik yil"(Leap year) olup olmadigini kontrol eden kodu yaziniz.

        /*
           1) yil 100'e bolunurse 400'e de bolunmelidir. 1600==> Leap 1800==> leap degil
           2) yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004 ==> Leap  2005 ==> leap degil
         */

        int year = 1600;

        String result = year%100==0 ? (year%400==0 ? "Leap" : "Not leap") : (year%4==0 ? "Leap" : "Not leap");
        System.out.println(result);//Leap

    }

}

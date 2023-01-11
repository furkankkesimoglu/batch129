package day10switchloops;

public class Loops01 {

    public static void main(String[] args) {

        //Ornek 1: Ekrana 5 kere "Hi" yazdiriniz.

        //1.Yol (Tavsiye edilmez)

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.Yol

        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde loop'lar kullanilir.
        // Dort tane loop vardir ; 1)for-loop 2)while-loop 3)do-while-loop 4)for-each-loop

        //1)for loop

        //  baslangic degeri        loop'un calisma sarti     Increment/Decrement
        for (int i=1               ;     i<6                 ;   i++                ){
            System.out.println("Hi");
        }

        //Ornek 2: 11'den 44'e kadar tum sayilari ekrana yazdiran kodu yaziniz.

        for(int i=11  ; i<45 ; i++){
            System.out.println(i);
        }

        //Ornek 3: 40'dan 23'e kadar tum cift tamsayilariekrana yazdiran kodu yaziniz.

        for(int i = 40 ; i>22 ; i-- ){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //Ornek 4: 18'den 56'ya kadar tum tek sayilari yazdiran kodu yaziniz.

        for(int i = 18 ; i<57 ; i++ ){
            if(i%2!=0){
                System.out.println(i);
            }
        }

        //Example 1: 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz

        for(int i = 21 ; i<181 ; i++ ){
            if(i%4==0 && i%6==0){
                System.out.println(i);
            }
        }

        //Ornek 5: Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harf yapiniz
        //      ankara ==> AnKaRa
        //Note: Yazdiginiz kod belli senaryolar icin calisiyor tum senaryolar icin calismiyorsa ; bu kod'a hard-code denir
        //  yanlis yazilmis koddur. mutlaka duzeltilmelidir.
        String s = "ankara";

        for(int i = 0 ; i<s.length() ; i++){

            String ch = s.substring(i,i+1);

            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }

    }


}
}

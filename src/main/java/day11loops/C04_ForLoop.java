package day11loops;

public class C04_ForLoop {

    public static void main(String[] args) {

        //Ornek : 1'den 100'e kadar 6 ile bolunenler haric tum tam sayilari ekrana yazdiriniz.

        for (int i = 1; i < 101 ; i++) {

            if(i%6 ==0){
                continue;// bosver devam et
            }
            System.out.print(i+" ");

        }
        System.out.println();


        //Interview sorusu : Size verilen bir String'i ters ceviren kdodu yaziniz.

        String str = "Furkan";//nakruF

        String ters = "";// yeni bir conteyner olusturdum

        for (int i = str.length()-1 ; i > -1 ; i--) {

            char harf = str.charAt(i);

            //ters= ters+harf;
            ters+=harf;//tercih edilen bu

        }
        System.out.println(ters);//nakruF






    }


}

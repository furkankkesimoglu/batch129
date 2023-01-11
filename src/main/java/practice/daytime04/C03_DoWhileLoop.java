package practice.daytime04;

public class C03_DoWhileLoop {

    public static void main(String[] args) {

        /*   INTERWIEV SORUSU

    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */

        int numberOfBananas = 165;// 4  8   12......  164 ==> geriye 1 muz kaldi

        int survivalDays = 1;//  1    2     3...... 41 ==> 42. gun oldu

        boolean monkeyAlive = true;

        do {
            //System.out.println("***************** maymun gunde 4 muz yer************");

            numberOfBananas-=4;//toplam muz sayisindan her gun 4 muz eksiltiyoruz

            System.out.println("kalan muz sayisi "+ numberOfBananas);

            survivalDays++;

            if(numberOfBananas<4){

                monkeyAlive=false;

                System.out.println("Bugun "+survivalDays+ " . gun yeterli muz kalmadi. Maymun rahmetli");

                System.out.println("Maymun "+survivalDays+ " . gun oldu");

            }else{
                System.out.println("Bugun "+survivalDays+" . gun ; maymun hala hayatta");
            }


        }while (monkeyAlive);

    }

}

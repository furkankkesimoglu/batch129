package day12loops;

public class C04_WhileLoop {

    public static void main(String[] args) {

        // 3'den 10'a kadar tamsayilari aytni satira yazdiran kodu yaziniz.

        for (int i = 3; i < 11; i++) {

            System.out.print(i + " ");

        }

        System.out.println();

        int i = 3;//baslangic degeri

        while (i < 11) {//bitis degeri

            System.out.print(i + " ");
            i++;// arttirma while loop un icinde
        }

        System.out.println();

        //17'den 4'e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz.

        int j = 17;

        while (j > 3) {

            if (j % 2 == 0) {

                System.out.print(j + " ");


            }//if
            j--;

        }//while

        //2.Yol: for-loop
        int a = 6841;
        int toplam = 0;

        for(int m = a; m>0; m/=10){
            toplam = toplam + m%10;
        }
        System.out.println(toplam);//19

    }//main
}//class

package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
           Java'da method nasil olusturulur?

           1)main method'un disinda olusturulur.
           2)Access Modifier + Return Type + Method Name + () + {}

           //Olusturulan methodlar nasil kullanilir.
           1)Main method'un icinden kullanilir.
           2)Method'un ismini yazin + () yazin
           3)Islem yapacaginiz sayilari parentezin icine koyun.
     */

    public static void main(String[] args) {

        int sonuc = add(3,5);
        System.out.println(sonuc);

        long carpmaSonucu= multiply(3,6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultplyThirdAdd(2,5,8);
        System.out.println(ucluSonuc);
    }

    public static int add(int a, int b){
       return a+b;
    }

    // long da yazilir int de yazilabilir asagida.
    // return: sonuc ver anlaminda
    protected static long multiply(long a, int b){
        return a*b;
    }

    //Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu toplayan method'u olusturunuz ve kullaniniz.
    private static int firstTwoMultplyThirdAdd(int a, int b,int c){
        return a*b+c;
    }
}

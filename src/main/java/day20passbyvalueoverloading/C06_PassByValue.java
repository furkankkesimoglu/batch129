package day20passbyvalueoverloading;

public class C06_PassByValue {

    // 100 tl ye satilan bir urun icin 2 farkli indirim uygulayan bir method olusturunuz

    public static void main(String[] args) {

        int fiyat = 100;

        indirimYap25(fiyat);
        System.out.println("main icinde methoddan sonra fiyat = " + fiyat);//100

        fiyat = indirimYap10(fiyat);
        System.out.println("main icinde methoddan sonra = " + fiyat);//90



    }

    private static int indirimYap10(int fiyat) {

        fiyat*=0.90;

        return fiyat;

    }

    private static void indirimYap25(int fiyat) {

        fiyat*=0.75;
        System.out.println("% 25 indirimli fiyat = " + fiyat);

    }

}

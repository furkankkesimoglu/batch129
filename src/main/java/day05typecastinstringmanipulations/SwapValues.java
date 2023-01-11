package day05typecastinstringmanipulations;

public class SwapValues {

    //Swap= Yer degistirmek. 1. kap=Patates 2.kap=Domates ==> Swap ==> 1.kap=Domates 2.kap=Patates
    public static void main(String[] args) {

        int a = 12;
        int b = 5; //swap'den sonra ==> a=5 ve b=12

        System.out.println("a: "+ a);//12
        System.out.println("b: "+b);//5

        int temp = 0;

        //****1. Yol****
        //1.adim

        temp = a;
        //2.adim
        a = b;

        //3.adim
        b = temp;

        System.out.println("a:"+a);//5
        System.out.println("b:"+b);//12

        //****2. Yol****
        int x = 12;
        int y = 5;

        x = x+y;
        // 12+5=17 ==> x=17

        y = x-y;
        // 17-5=12 ==>  y=12

        x = x-y;
        // 17-12=5 ==>  x=5



    }
}

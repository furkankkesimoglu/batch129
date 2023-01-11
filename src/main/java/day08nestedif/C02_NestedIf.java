package day08nestedif;

public class C02_NestedIf {

    /*
       Password'un ilk harfi buyuk harf ise
         'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
        Passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli password yazdirin degilse gecersiz password yazdirin


     */

    public static void main(String[] args) {

        String pwd = "5xy12!";
        char ilkHarf = pwd.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){

            if(ilkHarf=='A'){
                System.out.println("Gecerli password");
            }else{
                System.out.println("Gecersiz password");
            }

        }else if(ilkHarf>='a' && ilkHarf<='z'){

            if(ilkHarf=='z'){
                System.out.println("Gecerli password");
            }else{
                System.out.println("Gecersiz password");
            }

        }else{
            System.out.println("Ilk karakter harf olmali");
        }






    }


}

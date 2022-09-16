import java.io.Serial;

public class en_buyuk_sayı_bulma {
    public static  void main (String[] args){
        int sayi1 = 10;
        int sayi2 = 50;
        int sayi3 = 65;
        int en_buyuk = sayi1;
        if (sayi1>sayi2 & sayi1>sayi3){
             en_buyuk = sayi1;


        } else if (sayi2> sayi1 & sayi2> sayi3) {
             en_buyuk = sayi2;
        }
        else {
             en_buyuk = sayi3;
        }
        System.out.println(en_buyuk);
    }
}

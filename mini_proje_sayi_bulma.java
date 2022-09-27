public class mini_proje_sayi_bulma {
    public static void main(String[] args){

        int [] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak_sayi = 1;
        boolean varMi = false;

        for (int sayi : sayilar){
            if ( sayi == aranacak_sayi){
                varMi = true;
                break;
            }
        }

        if(varMi){
            System.out.println(" Sayı vardır . ");
        }
        else {
            System.out.println(" Sayı mevcut değildir.");
        }


    }
}

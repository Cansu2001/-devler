public class deger_referans_tipi_anlama {
    public static void main(String[] args){
        CustomeManager customeManager = new CustomeManager();
        CustomeManager customeManager2 = new CustomeManager();
        customeManager = customeManager2;
        customeManager.Add();
        customeManager.Remove();
        customeManager.Update();

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,6};
        sayilar2 =sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

    }
}

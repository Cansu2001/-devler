public class stringlerle_calısmak {
    public static void main(String[] args){
        String mesaj = "Bugün hava çok güzel";

        String yeniMesaj = mesaj.replace(' ' ,'-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));
        System.out.println(mesaj.toUpperCase());
        System.out.println(yeniMesaj.toUpperCase());
        System.out.println(yeniMesaj.trim());
    }
}

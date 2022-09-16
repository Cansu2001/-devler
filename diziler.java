public class diziler {
    public static void main(String[] args){
        String ogr1 = "Sinem";
        String ogr2 = "Pelin";
        String ogr3 = "Ekin";
        String ogr4 = "Kübra";

        System.out.println("------------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Sinem :) ";
        ogrenciler[1] = "Pelin :) ";
        ogrenciler[2] = "Ekin :) ";
        ogrenciler[3] = "Kübra :) ";

        for (int i=0 ; i<ogrenciler.length ;i++){
            System.out.println(ogrenciler[i]);
        }
    }
}

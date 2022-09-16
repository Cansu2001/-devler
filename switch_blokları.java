public class switch_blokları {
    public static void main(String[] args){

        char grade = 'B';
        switch (grade){
            case 'A':
                System.out.println("Mükemmel : geçtiniz.");
                break;
            case 'B':
                System.out.println("İyi : geçtiniz.");
                break;
            case 'C':
                System.out.println("fena değil : geçtiniz.");
                break;
            case 'D':
                System.out.println("kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girildi");


        }
    }
}

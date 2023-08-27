public class ders15_methods {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9};
        int aranacak =3;
        boolean varMi= true;

        for (int sayi: sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            mesajVer("Sayi mevcut "+ aranacak);
        }else{
            System.out.println("Sayi mevcut degil");
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println("Sayi mevcut ");
    }
}

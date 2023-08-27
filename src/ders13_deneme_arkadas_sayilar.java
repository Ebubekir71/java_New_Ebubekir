import java.util.Scanner;

public class ders13_deneme_arkadas_sayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println(sayi1 +" ve "+ sayi2 + " = girilen sayilar");
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i=1; i<sayi1; i++){
            if (sayi1%i==0){
                toplam1 = toplam1 + i;
                System.out.println(i);
            }
        }
        System.out.println(toplam1 + " toplam 1 bu sayidir");
        System.out.println(">------------<");
        for (int k=1; k<sayi2; k++){
            if (sayi2%k==0){
                toplam2 = toplam2 + k;
                System.out.println(k);
            }
        }
        System.out.println(toplam2 + " toplam 2 bu sayidir");
        if (toplam1==1 && toplam2==1){
            System.out.println("Bu sayilar kardes degiller");return;
        }
        if (toplam1==sayi2){
            System.out.println(sayi1+ " ve " + sayi2 + " sayilari kardestir");
        }else{
            System.out.println("bu sayilar kardes degiller.");
        }
    }
}

import java.util.Scanner;

public class ders14_deneme_sayiBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir aranacak rakam giriniz");
        int aranacak = scan.nextInt();
        System.out.println(aranacak + " girilen rakam");
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        boolean varMi = false;


        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Aranan rakam bulundu");
        } else {
            System.out.println("Maalesef aranan rakam bulunamadi");
        }
    }
}


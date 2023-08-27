import java.util.Scanner;

public class ders12_deneme_tam_bölenlerini_bulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("Girilen sayi = "+ sayi);
        int toplam = 0 ;

        for (int i=1; i<=sayi; i++){
            if (sayi%i==0){
                toplam = toplam + i;
                System.out.println(i + " = sayiyi tam bölebilen bölen");
            }
        }System.out.println(toplam + " = sayiyi tam bölebilenlerin tolami");

    }
}

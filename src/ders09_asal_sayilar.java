import java.util.Scanner;

public class ders09_asal_sayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz..");
        int number = scan.nextInt();

        boolean asal = true;

        if (number<0){
            System.out.println("Gecersiz sayi girdiniz");
            return;
        }
        if (number==1){
            System.out.println("1 Asal bir sayi degildir");
            return;
        }

        for (int i=2; i<number; i++){
            if (number%i==0){
                asal = false;
            }
        }
        if (asal){
            System.out.println(number + " sayi asaldir");
        }else{
            System.out.println(number + " sayi asal degildir");
        }
    }
}

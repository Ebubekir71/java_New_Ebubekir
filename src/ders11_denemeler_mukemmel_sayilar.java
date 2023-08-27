import java.util.Scanner;

public class ders11_denemeler_mukemmel_sayilar {
    public static void main(String[] args) {
        //6--> 1,2,3
        //28-->1,2,4,7,14
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz ve mükemmel olup olmadigini görünüz");
        int number = scan.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println(number + " mükemmel sayidir");
        } else {
            System.out.println(number + " mükemmler bir sayi degildir");
        }
    }
}


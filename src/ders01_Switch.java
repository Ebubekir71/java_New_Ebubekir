import java.util.Scanner;

public class ders01_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir not harfi girin");
        char grade = scan.next().charAt(0);

        switch (grade) {
            case 'A','a':
                System.out.println("Mükemmel not aldiniz");break;
            case 'B','b':
                System.out.println("Iyi not aldiniz");break;
            case 'C','c':
                System.out.println("Ortalama bir not aldiniz");break;
            case 'D','d':
                System.out.println("Kalmak üzeresiniz");break;
            case 'E','e':
                System.out.println("Kaldiniz");break;
            case 'F','f':
            case 'G','g':
                System.out.println("0 cektiniz");break;
            default:
                System.out.println("Lütfen gecerli, harf olarak not giriniz");
        }
    }
}

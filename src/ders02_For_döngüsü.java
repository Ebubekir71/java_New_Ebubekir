import java.util.Scanner;

public class ders02_For_döngüsü {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scan.nextInt();

        for (i=0; i<15; i++){
            System.out.println(i);
        }
    }
}

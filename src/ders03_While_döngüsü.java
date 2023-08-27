import java.util.Scanner;

public class ders03_While_döngüsü {
    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);
        System.out.println("bir rakam yaziniz");
        int i = tarayici.nextInt();
        while (i<10){
            System.out.println(i);
            i++;
        }
    }
}

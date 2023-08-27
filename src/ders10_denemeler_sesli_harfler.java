import java.util.Scanner;

public class ders10_denemeler_sesli_harfler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char harf = scan.next().charAt(0);


        /*if (harf=='A'|| harf=='I'|| harf== 'O'|| harf== 'U'|| harf=='a'|| harf == 'ı'||harf=='o'|| harf=='u'){
            System.out.println(harf + " kalin sesli harflerdendir.");
        } else if (harf=='E'|| harf=='İ'|| harf== 'Ö'|| harf== 'Ü'|| harf=='e'|| harf == 'i'||harf=='ö'|| harf=='ü') {
            System.out.println(harf + " ince sesli harflerdendir");
        }else{
            System.out.println(harf + " sesli harf degildir.");
        }*/

        switch (harf){
            case 'A': case 'I': case 'O': case 'U':
                System.out.println(harf + " kalin sesli harflerdendir."); break;
            case 'E': case 'İ': case 'Ö': case 'Ü':
                System.out.println(harf + " ince sesli harflerdendir");
        }

    }
}

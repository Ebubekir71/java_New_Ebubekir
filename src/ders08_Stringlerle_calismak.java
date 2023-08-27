public class ders08_Stringlerle_calismak {
    public static void main(String[] args) {
        String mesaj = "Bu gün hava cok güzel.";

        System.out.println(mesaj);
        String yenimesaj = mesaj.replace(' ', '-');

        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(2, 7));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        String sonmesaj= "       Kedim arkamda yatiyor     ";
        System.out.println(sonmesaj);
        System.out.println(sonmesaj.trim()); //basindaki ve sonundaki bosluklari atiyor
    }
}

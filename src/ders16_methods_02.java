public class ders16_methods_02 {
    public static void main(String[] args) {
        String mesaj = "Bu gün hava cok güzel";
        String yenimesaj = mesaj.substring(0,2);
        System.out.println(yenimesaj);
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
}

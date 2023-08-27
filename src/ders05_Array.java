public class ders05_Array {
    public static void main(String[] args) {

        String [] ogrenciler = new String[7];
        ogrenciler[0]= "Ahmet";
        ogrenciler[1]= "Mehmet";
        ogrenciler[2]= "Kemal";
        ogrenciler[3]= "Nurettin";
        ogrenciler[4]= "Süleyman";
        ogrenciler[5]= "Saziye";
        ogrenciler[6]= "Busra";

        for (int i=0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}

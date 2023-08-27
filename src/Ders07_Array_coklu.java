public class Ders07_Array_coklu {
    public static void main(String[] args) {
        String[][] donguler= new String[2][3];
        donguler[0][0]= "Ahmet";
        donguler[0][1]= "Bursa";
        donguler[0][2]= "Ankara";
        donguler[1][0]= "Konya";
        donguler[1][1]= "Kayseri";
        donguler[1][2]= "Diyarbakir";

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.println(donguler[i][j]);
            }
        }


    }
}


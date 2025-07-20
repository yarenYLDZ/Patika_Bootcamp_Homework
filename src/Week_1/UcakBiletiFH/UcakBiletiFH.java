package Week_1.UcakBiletiFH;

import java.util.Scanner;

public class UcakBiletiFH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Mesafe (km) giriniz : ");
        double mesafe = scanner.nextDouble();

        System.out.print("Yasinizi giriniz:");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipinizi giriniz (tek yon 1 cift yon 2): ");
        int yolculuk_tipi = scanner.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculuk_tipi != 1 && yolculuk_tipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double birimFiyat = 0.10;
            double normalTutar = mesafe * birimFiyat;
            double yasIndirimi = 0.0;

            if (yas < 12) {
                yasIndirimi = 0.50;
            } else if (yas <= 24) {
                yasIndirimi = 0.10;
            } else if (yas > 65) {
                yasIndirimi = 0.30;
            }

            double indirimliTutar = normalTutar - (normalTutar * yasIndirimi);

            // Gidiş-dönüş indirimi
            if (yolculuk_tipi == 2) {
                indirimliTutar = indirimliTutar - (indirimliTutar * 0.20);
                indirimliTutar *= 2;  // çünkü gidiş-dönüş
            }

            System.out.printf("Toplam Bilet Tutarı: %.2f TL\n", indirimliTutar);
        }

        scanner.close();
    }
}

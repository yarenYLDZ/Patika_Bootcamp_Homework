package Week_2.AsalSayi;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen sayi giriniz : ");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi < 2) {
            System.out.println(girilenSayi + " asal değildir !");
        } else {
            boolean sonuc = asalMi(girilenSayi, 2);

            if (sonuc) {
                System.out.println(girilenSayi + " sayısı asaldir !");
            } else {
                System.out.println(girilenSayi + " sayısı asal değildir !");
            }
        }

        scanner.close();



    }


    private static boolean asalMi(int sayi, int bolen) {
        // Eğer bolen sayıya eşitse, bölünebilirlik bulunamadı, asal sayıdır
        if (bolen == sayi) {
            return true;
        }

        // Eğer sayı bolene tam bölünüyorsa, asal değildir
        if (sayi % bolen == 0) {
            return false;
        }

        // Bir sonraki bölenle devam et
        return asalMi(sayi, bolen + 1);
    }
}

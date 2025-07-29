package Week_2.CarpimTablosu;

import java.util.Scanner;

public class CarpimTablosu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Kullanıcıdan üst sınır n değerini alir
        System.out.print("1 ile 10 arasında bir sayı giriniz: ");
        int n = scanner.nextInt();

        // 2. n değeri geçerli aralıkta mı kontrol edilen kisim
        if (n < 1 || n > 10) {
            System.out.println("Hata: Lütfen 1 ile 10 arasında bir tam sayı giriniz.");
            return; // programı sonlandır
        }

        // 3. Geçerli durumda çarpım tablosunu üretir
        System.out.println("\n" + n + " x " + n + " Çarpım Tablosu:\n");

        for (int i = 1; i <= n; i++) {             // satırlar
            for (int j = 1; j <= n; j++) {         // sütunlar
                System.out.printf("%4d", i * j);   // her çarpımı hizalı yazdır
            }
            System.out.println();
        }

        scanner.close();
    }
}

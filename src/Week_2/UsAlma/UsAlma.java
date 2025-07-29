package Week_2.UsAlma;

import java.util.Scanner;

public class UsAlma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;

        // Geçerli aralıkta sayı alma
        do {
            System.out.print("1 ile 10 arasında bir sayı giriniz: ");
            sayi= scanner.nextInt();
        } while (sayi < 1 || sayi > 10);

        System.out.println("\nÜs Tablosu (" + sayi + " x " + sayi + "):\n");

        // Üs tablosunu oluşturma
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {
                System.out.printf("%8d", (int) Math.pow(i, j));
            }
            System.out.println(); // Satır sonu
        }
    }

}
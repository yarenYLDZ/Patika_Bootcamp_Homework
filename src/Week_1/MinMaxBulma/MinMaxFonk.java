package Week_1.MinMaxBulma;

import java.util.Scanner;

public class MinMaxFonk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kac tane sayi gireceksiniz? : ");
        int sayi = scanner.nextInt();

        int min = 0;
        int max = 0;

        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int girilen = scanner.nextInt();

            if (i == 1) {
                min = girilen; // burada girilen ilk deger hem minimum hem de maximum olarak atanir. dongudeki ilk sayi sadece bu bloga girer.
                max = girilen;
            } else {
                if (girilen < min) min = girilen; // else blogu dongudeki her sayi icin karsilastirma yapar ve gelen her sayiyi karsilastirip degerine gore ilgili degiskene atilir
                if (girilen > max) max = girilen;
            }
        }

        // Dongu bittiginde cikti kismi bu sekilde
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

    }
}

package Week_1.AritmetikIslemler;

import java.util.Scanner;

public class AritmetikIslemler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Lutfen 1. sayiyi giriniz : ");
        int sayi1 = scanner.nextInt();

        System.out.printf("Lutfen 2. sayiyi giriniz : ");
        int sayi2 = scanner.nextInt();

        System.out.printf("Lutfen 3. sayiyi giriniz : ");
        int sayi3 = scanner.nextInt();

        int sonuc = sayi1+sayi2*sayi3-sayi2;

        System.out.printf("islem sonucu "+ sonuc);


    }
    }

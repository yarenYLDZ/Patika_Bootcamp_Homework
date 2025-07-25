package Week_1.TipDonusumleri;

import java.util.Scanner;

public class TipDonusumleri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = input.nextInt();

        System.out.print("Bir ondalıklı sayı (double) giriniz: ");
        double ondalikliSayi = input.nextDouble();

        double tamSayiToDouble = (double) tamSayi; // Tam sayıyı ondalıklıya çevirme
        int ondalikliToInt = (int) ondalikliSayi; // Ondalıklıyı tam sayıya çevirme


        System.out.println("Tam sayı (int): " + tamSayi);
        System.out.println("Tam sayınin Ondalıklı hali (double): " + tamSayi);
        System.out.println("Ondalıklı sayı (double): " + ondalikliSayi);
        System.out.println("Ondalıklı sayinin Tam sayı hali (int): " + ondalikliToInt);


        input.close();
    }
}


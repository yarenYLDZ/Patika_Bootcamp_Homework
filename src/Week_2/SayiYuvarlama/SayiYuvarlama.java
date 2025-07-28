package Week_2.SayiYuvarlama;

import java.util.Scanner;

public class SayiYuvarlama {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Ondalıklı bir sayı girin: ");
        double sayi = scanner.nextDouble();

        int asagi = (int) Math.floor(sayi);
        int yukari = (int) Math.ceil(sayi);
        int yakin = (int) Math.round(sayi);

        System.out.println("Aşağı Yuvarlama: " + asagi);
        System.out.println("Yukarı Yuvarlama: " + yukari);
        System.out.println("En Yakın Tam Sayı: " + yakin);

        scanner.close();
    }

    }


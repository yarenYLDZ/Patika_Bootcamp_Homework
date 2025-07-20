package Week_1.CinZodyagiHesaplama;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        int dogumYili = scanner.nextInt();

        int kalan = dogumYili % 12;
        String burc = "";

        burc = switch (kalan) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "Bilinmiyor"; // Güvenlik amaçlı eklenebilir
        };


        System.out.println("Çin Zodyağı Burcunuz : " + burc);
        scanner.close();
    }

}


package Week_1.ArtikYilHesaplama;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int yil = scanner.nextInt();

        boolean artikYilMi;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {

                artikYilMi = (yil % 400 == 0);
            } else {
                artikYilMi = true;
            }
        } else {
            artikYilMi = false;
        }

        if (artikYilMi) {
            System.out.println(yil + " bir artık yıldır!");
        } else {
            System.out.println(yil + " bir artık yıl değildir!");
        }

        scanner.close();
    }
}

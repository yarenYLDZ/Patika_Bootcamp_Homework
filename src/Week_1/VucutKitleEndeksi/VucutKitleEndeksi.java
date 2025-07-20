package Week_1.VucutKitleEndeksi;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu (cm) girin: ");
        double boyCm = scanner.nextDouble();
        double boy = boyCm/100; // kisinin girdigi cm boy degerini metreye cevirme icin

        System.out.print("Kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        double vke = kilo / (boy * boy);

        System.out.printf("Vücut Kitle Endeksiniz: %.2f olarak hesaplanmistir.\n", vke);

        scanner.close();
    }
}


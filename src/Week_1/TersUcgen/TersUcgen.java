package Week_1.TersUcgen;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Basamak sayisi giriniz : ");
        int basamak = scanner.nextInt();

        for (int i = 0; i < basamak; i++) {             // Satır kontrolü (i = satır numarası)
            for (int j = 0; j < 2 * (basamak - i) - 1; j++) {   // Yıldız basımı
                System.out.print("*");
            }
            System.out.println(); // Alt satıra geç
        }
    }
}

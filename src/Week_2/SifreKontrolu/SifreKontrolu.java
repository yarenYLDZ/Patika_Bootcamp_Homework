package Week_2.SifreKontrolu;

import java.util.Scanner;

public class SifreKontrolu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sifre giriniz: ");
        var sifre = scanner.nextLine();

        boolean uzunlukKontrol = sifre.length() >= 8;
        boolean boslukKontrol = !sifre.contains(" ");
        boolean ilkHarfKontrol = Character.isUpperCase(sifre.charAt(0));
        boolean sonKarakterKontrol = sifre.charAt(sifre.length() - 1) == '?';

        if (uzunlukKontrol && boslukKontrol && ilkHarfKontrol && sonKarakterKontrol) {
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }

        scanner.close();
    }


}

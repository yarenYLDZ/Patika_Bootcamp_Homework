package Week_3.HarfBulmaOyunu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HarfBulmaOyunu {
    public static void main(String[] args) {
        ArrayList<String> harfListesi = new ArrayList<>();
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            char rastgeleHarf = (char) (random.nextInt(26) + 'a'); // a-z
            harfListesi.add(String.valueOf(rastgeleHarf));
        }

        System.out.println("Başlangıç Listesi : " + harfListesi);

        // Kullanıcıdan 4 kez harf girişi alınıyor
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + ". harfi giriniz: ");
            String girilenHarf = scanner.next().toLowerCase();

            // Harf listede varsa "found" ile değiştir
            if (harfListesi.contains(girilenHarf)) {
                int index = harfListesi.indexOf(girilenHarf);
                harfListesi.set(index, "found");
                System.out.println("Tebrikler! Harfi buldunuz.");
            } else {
                harfListesi.add(girilenHarf);
                System.out.println("Harf listede yoktu, eklendi.");
            }
        }

        // Son listeyi yazdır
        System.out.println("Güncellenmiş Liste: " + harfListesi);


    }
}

package Week_3.EnYakinIkiSayi;

import java.util.ArrayList;
import java.util.Collections;

public class EnYakinIkiSayi {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(12);
        sayilar.add(98);
        sayilar.add(51);
        sayilar.add(33);
        sayilar.add(49);
        sayilar.add(55);
        sayilar.add(53);
        sayilar.add(91);
        sayilar.add(13);

        Collections.sort(sayilar);

        int minFark = Integer.MAX_VALUE;
        int sayi1 = 0, sayi2 = 0;


        for (int i = 0; i < sayilar.size() - 1; i++) {
            int fark = sayilar.get(i + 1) - sayilar.get(i);
            if (fark < minFark) {
                minFark = fark;
                sayi1 = sayilar.get(i);
                sayi2 = sayilar.get(i + 1);
            }
        }

        System.out.println("Birbirine en yakın iki sayı: " + sayi1 + " ve " + sayi2);
        System.out.println("Farkları: " + minFark);

    }
}

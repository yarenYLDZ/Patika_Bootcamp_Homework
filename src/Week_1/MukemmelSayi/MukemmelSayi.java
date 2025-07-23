package Week_1.MukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        int toplam=0; // islem sonucunda girilen sayi mukemmel sayi mi kontrol etmek icin sayinin bolenlerinin toplami icin bir degisken olusturdum.

        for(int i=1; i<sayi; i++)
        {
            if (sayi % i == 0) { // sayinin bir eksigine kadar olan bolenleri bulup toplam degiskeninde topladim
                toplam += i;
            }
        }
        if(toplam == sayi){ // girilen sayi ile toplam degiskenindeki sayi degeri esit mi diye kontrol ederek sonucu consolda yazdirdim
            System.out.printf(sayi+" mukemmel bir sayidir.");

        } else {
            System.out.printf(sayi+" mukemmel bir sayi degildir.");
        }
        }
    }


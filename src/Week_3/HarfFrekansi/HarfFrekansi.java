package Week_3.HarfFrekansi;

import java.util.*;

public class HarfFrekansi {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kelimeyi giriniz: ");
            String kelime = scanner.nextLine().toLowerCase();

            Map<Character, Integer> frekansMap = new TreeMap<>(); // ciktida alfabetik sira icin treeMap kullanisli

            for (int i = 0; i < kelime.length(); i++) {
                char ch = kelime.charAt(i);
                if (Character.isLetter(ch)) {
                    frekansMap.put(ch, frekansMap.getOrDefault(ch, 0) + 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : frekansMap.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
}

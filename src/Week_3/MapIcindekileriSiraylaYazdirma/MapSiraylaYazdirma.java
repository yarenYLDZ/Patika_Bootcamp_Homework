package Week_3.MapIcindekileriSiraylaYazdirma;

import java.util.HashMap;
import java.util.Map;

public class MapSiraylaYazdirma {

        public static void main(String[] args) {

            // HashMap tanımlama
            Map<String,Integer> scores = new HashMap<>();

            // Map'e 5 farklı giriş ekleme
            scores.put("Aysun", 85);
            scores.put("Ayşe", 92);
            scores.put("Zeynep", 90);
            scores.put("Burak", 88);
            scores.put("Yaren",100);

            // Map içeriğini satır satır yazdırma
            for (Map.Entry<String, Integer> entry : scores.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }



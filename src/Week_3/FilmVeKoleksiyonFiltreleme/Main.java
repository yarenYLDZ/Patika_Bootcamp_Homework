package Week_3.FilmVeKoleksiyonFiltreleme;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Film> filmler = new ArrayList<>();

        filmler.add(new Film("Coherence", 2013, "Bilim Kurgu", 7.2));
        filmler.add(new Film("The Man from Earth", 2007, "Bilim Kurgu", 7.9));
        filmler.add(new Film("Incendies", 2010, "Dram", 8.3));
        filmler.add(new Film("Predestination", 2014, "Bilim Kurgu", 7.5));
        filmler.add(new Film("The Fall", 2006, "Fantastik", 7.8));

        // IMDb'ye göre sırala
        filmler.sort((f1, f2) -> Double.compare(f2.getImdbPuani(), f1.getImdbPuani()));
        System.out.println("\nIMDb'ye göre sıralı:");
        filmler.forEach(System.out::println);

        // Yayın yılına göre sırala
        filmler.sort((f1, f2) -> Integer.compare(f1.getYayinYili(), f2.getYayinYili()));
        System.out.println("\nYayın yılına göre sıralı:");
        filmler.forEach(System.out::println);

    }

    public static void filtreleVeYazdir(List<Film> filmler, String tur)
    {
        System.out.println("\n\""+ tur+"\" turundeki filmler:");
        for(Film f : filmler){
            if (f.getTur().equalsIgnoreCase(tur)){
                System.out.println(f);
            }

        }

    }
}

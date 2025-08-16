package Week_5.MethodReference;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        // Print names using method reference
        names.forEach(System.out::println);
    }
}

package Week_5.RecordOdevi;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Yarenn", "Yildiz", 2001);
        Student s2 = new Student("Aleyna", "Yildiz", 2005);
        Student s3 = new Student("Yaren", "Yildiz", 2001); // s1 ile aynı içerik


        // Öğrencileri ekrana yazdırma (toString otomatik çalışır)
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println();

        // equals() ve hashCode() kontrolü
        System.out.println("s1 equals s2? " + s1.equals(s2)); // false
        System.out.println("s1 equals s3? " + s1.equals(s3)); // true

        System.out.println();
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s3 hashCode: " + s3.hashCode());

    }
}

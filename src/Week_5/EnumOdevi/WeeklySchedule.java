package Week_5.EnumOdevi;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class WeeklySchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir gun seciniz (ornegin :MONDAY, FRIDAY, SUNDAY) : ");
        String input=scanner.nextLine().toUpperCase();


        try {
            Day selectedDay = Day.valueOf(input);
            System.out.println(selectedDay + " günü çalışma saatleri: " + selectedDay.getWorkingHours());
        } catch (IllegalArgumentException e) {
            System.out.println("Geçersiz gün girdiniz!");
        }
    }
}

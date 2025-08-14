package Week_5.EnumOdevi;



     public enum Day {
         MONDAY("09:00 - 17:00"),
         TUESDAY("09:00 - 17:00"),
         WEDNESDAY("09:00 - 17:00"),
         THURSDAY("09:00 - 17:00"),
         FRIDAY("09:00 - 14:30"),
         SATURDAY("Çalışma yok"),
         SUNDAY("Çalışma yok");


         private final String workingHours;

         // Enum constructor
         Day(String workingHours) {
             this.workingHours = workingHours;
         }

         public String getWorkingHours() {
             return workingHours;
         }
     }


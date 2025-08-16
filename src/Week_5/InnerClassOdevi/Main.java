package Week_5.InnerClassOdevi;

public class Main {
    public static void main(String[] args) {
        Employee emp1= new Employee("Yaren", "Yildiz");
        Employee.ContactInfo contact1 = emp1.new ContactInfo("0538 226 19 77" , "yarenyldz654@gmail.com");
        emp1.displayEmployeeInfo(contact1);

        System.out.println();

        Employee emp2 = new Employee("Aleyna", "Yildiz");
        Employee.ContactInfo contact2 = emp2.new ContactInfo("0535 824 51 65","aleyy@gmail.com");
        emp2.displayEmployeeInfo(contact2);
    }
}

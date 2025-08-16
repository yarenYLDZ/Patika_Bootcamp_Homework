package Week_5.InnerClassOdevi;

public class Employee {

    private String name;
    private String surname;

    public class ContactInfo{
        private String phone;
        private String email;

        public ContactInfo(String phone,String email){
            this.phone=phone;
            this.email=email;
        }

        public void displayContactInfo(){
            System.out.println("Telefon: "+ phone + ", E-posta: " + email );
        }
    }

    public Employee(String name, String surname){
        this.name=name;
        this.surname=surname;
    }

    public void displayEmployeeInfo(ContactInfo contactInfo){
        System.out.println("Ad: " + name + " " + surname);
        contactInfo.displayContactInfo();
    }

}

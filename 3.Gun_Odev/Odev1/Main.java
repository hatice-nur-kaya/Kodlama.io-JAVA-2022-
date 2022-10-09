public class Main {
    public void main(String[] args) {
        // Değer ve Referans Tip
        // int sayi1 =10;
        // int sayi2=20;
        // sayi1 =sayi2;
        // sayi2=100;
        // System.out.println(sayi1);

        // int[] sayilar1 ={10,20,30};
        // int[] sayilar2 ={1,2,3};
        // sayilar1 = sayilar2;
        // sayilar2[0] =1000;
        // System.out.println(sayilar1[0]);
        CreditManager creditManager =new CreditManager();
        CustomerManager customerManager = new CustomerManager();
        customerManager.Save(1, "Hatice Nur", "KAYA", "123456884");
        Company company = new Company();
        Customer c1 =new Customer();
        Customer c2 =new Person();
        Customer c3 =new Company();

    }

    class CreditManager {
        public void Calculate() {
            System.out.println("Hesaplandı.");
        }

        public void Save() {
            System.out.println("Kredi Verildi.");
        }
    }

    public class Customer {
        private int Id;
        private String firstName;
        private String lastName;
        private String identify;

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getIdentify() {
            return identify;
        }

        public void setIdentify(String identify) {
            this.identify = identify;
        }
    }

    class CustomerManager {
        public void Save(int id, String firstName, String lastName, String identify) {
            System.out.println("Kaydedildi");
        }
    }

    class Person extends Customer {
        private String nationalaIdentity;

        public String getNationalaIdentity() {
            return nationalaIdentity;
        }

        public void setNationalaIdentity(String nationalaIdentity) {
            this.nationalaIdentity = nationalaIdentity;
        }
    }

    class Company extends Customer {
        private String CompanyName;
        private String taxNumber;

    }
}

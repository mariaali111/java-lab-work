package problem01;

public class Person {
    private String name;
    private String phone;
    private Address address;
    private DateOfBirth dob;

    public Person(String name, String phone, String houseNo, String street, String city, String state,
                  String date, String month, String year) {
        this.name = name;
        this.phone = phone;
        this.address = new Address(houseNo, street, city, state);
        this.dob = new DateOfBirth(date, month, year);
    }

    class Address {
        private String houseNo;
        private String street;
        private String city;
        private String state;

        Address(String houseNo, String street, String city, String state) {
            this.houseNo = houseNo;
            this.street = street;
            this.city = city;
            this.state = state;
        }

        void displayAddr() {
            System.out.println(houseNo + ", " + street + ", " + city + ", " + state + ".");
        }
    }

    class DateOfBirth {
        private String date;
        private String month;
        private String year;

        DateOfBirth(String date, String month, String year) {
            this.date = date;
            this.month = month;
            this.year = year;
        }

        void displayDOB() {
            System.out.println(date + "/" + month + "/" + year);
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.print("Address: ");
        address.displayAddr();
        System.out.print("DOB: ");
        dob.displayDOB();
    }
}

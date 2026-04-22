class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

class Student {
    private int id;
    private String name;
    private Address address;

    // Default constructor
    public Student() {
        this.id = 0;
        this.name = "Unknown";
        this.address = new Address("Not Assigned");
    }

    // Parameterized constructor
    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Shallow Copy Constructor
    public Student(Student s) {
        this.id = s.id;
        this.name = s.name;
        this.address = s.address; // same reference
    }

    // Deep Copy Method
    public Student deepCopy() {
        Address newAddr = new Address(this.address.city);
        return new Student(this.id, this.name, newAddr);
    }

    public void setCity(String city) {
        this.address.city = city;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", Name=" + name + ", City=" + address.city;
    }
}
public class Tester {
    public static void main(String[] args) {

        Address addr1 = new Address("Pune");

        // Original object
        Student s1 = new Student(1, "Rahul", addr1);

        // Shallow copy
        Student s2 = new Student(s1);

        // Deep copy
        Student s3 = s1.deepCopy();

        System.out.println("Before modification:");
        System.out.println("s1: " + s1);
        System.out.println("s2 (Shallow): " + s2);
        System.out.println("s3 (Deep): " + s3);

        // Modify original object's address
        s1.setCity("Mumbai");

        System.out.println("\nAfter modification:");
        System.out.println("s1: " + s1);
        System.out.println("s2 (Shallow): " + s2); // affected
        System.out.println("s3 (Deep): " + s3);    // not affected
    }
}

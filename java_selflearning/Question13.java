import java.util.*;

class Student {
    int roll;
    String name;
    String city;
    double marks;

    public Student(int r, String n, String c, double m) {
        roll = r;
        name = n;
        city = c;
        marks = m;
    }

    public String toString() {
        return name + " " + city + " " + marks;
    }
}

public class StudentSort {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(1, "Amit", "Pune", 80),
            new Student(2, "Ravi", "Mumbai", 90),
            new Student(3, "Neha", "Pune", 90),
            new Student(4, "Zara", "Mumbai", 85)
        };

        Arrays.sort(arr, (a, b) -> {
            if (!a.city.equals(b.city))
                return b.city.compareTo(a.city); // city desc
            else if (a.marks != b.marks)
                return Double.compare(b.marks, a.marks); // marks desc
            else
                return a.name.compareTo(b.name); // name asc
        });

        for (Student s : arr)
            System.out.println(s);
    }
}

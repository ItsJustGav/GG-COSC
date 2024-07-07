/**
 * Objective: Implement a class hierarchy for Person, Student, Employee, Faculty, and Staff.
 * Algorithm: Create base and derived classes with appropriate properties and methods.
 * Input and Output: Display class names and names of persons.
 * Created by: Gavin Guyote
 * Date: 6/13/2024
 */

// Basic class representing a person
class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    // Constructor to initialize a Person object
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Getter method for the name property
    public String getName() {
        return name;
    }

    // Overriding the toString method to provide a custom string of a Person object
    public String toString() {
        return "Class: Person, Name: " + name;
    }
}

// Subclass of Person for a student
class Student extends Person {
    // Constants representing different student statuses
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    // Constructor to initialize a Student object
    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress); // Call the constructor of the superclass (Person)
        this.status = status;
    }

    // Overriding the toString method to provide a custom string of a Student object
    public String toString() {
        return "Class: Student, Name: " + getName();
    }
}

// Subclass of Person for an employee
class Employee extends Person {
    private String office;
    private double salary;
    private String dateHired;

    // Constructor to initialize an Employee object
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String dateHired) {
        super(name, address, phoneNumber, emailAddress); // Call the constructor of the superclass (Person)
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // Override the toString method to provide a custom string of an Employee object
    public String toString() {
        return "Class: Employee, Name: " + getName();
    }
}

// Subclass of Employee for faculty members
class Faculty extends Employee {
    private String officeHours;
    private String rank;

    // Constructor to initialize a Faculty object
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired); // Call the constructor of the superclass (Employee)
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Override the toString method to provide a custom string of a Faculty object
    public String toString() {
        return "Class: Faculty, Name: " + getName();
    }
}

// Subclass of Employee for staff members
class Staff extends Employee {
    private String title;

    // Constructor to initialize a Staff object
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired); // Call the constructor of the superclass (Employee)
        this.title = title;
    }

    // Override the toString method to provide a custom string of a Staff object
    public String toString() {
        return "Class: Staff, Name: " + getName();
    }
}

// Main class to test the hierarchy and print information about each person
public class Test {
    public static void main(String[] args) {
        // Create instances of each class
        Person person = new Person("John Doe", "123 Main St", "555-5555", "john@main.com");
        Student student = new Student("Jane Boe", "456 Main St", "555-5556", "jane@main.com", Student.SENIOR);
        Employee employee = new Employee("Jim Joe", "789 Main St", "555-5557", "jim@main.com", "Room 101", 60000, "01/01/2020");
        Faculty faculty = new Faculty("Jack Loe", "101 Main St", "555-5558", "jack@main.com", "Room 102", 70000, "01/02/2019", "9-5", "Professor");
        Staff staff = new Staff("Joe Moe", "202 Main St", "555-5559", "joe@main.com", "Room 103", 50000, "01/03/2019", "Administrator");

        // Print information about each person using the overridden toString method
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

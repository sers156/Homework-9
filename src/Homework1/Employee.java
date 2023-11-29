package Homework1;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id2) {
        id = id2;

    }

    Employee(String surname2) {
        surname = surname2;

    }

    private Employee(double salary2) {
        salary = salary2;

    }

    double uvelichenieSalary() {
        salary *= 2;
        return salary;

    }

    public void Id() {
        System.out.println("ID = " + id);
    }
    public void Surname() {
        System.out.println("Surname = " + surname);
    }
    public void Salary() {
        System.out.println("Salary = " + salary);
    }
}


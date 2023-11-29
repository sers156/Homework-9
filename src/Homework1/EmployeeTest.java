package Homework1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1=new Employee(5);
        Employee emp2 = new Employee("Вадим");
        Employee emp3 = new Employee(40);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);


        System.out.println(emp2.id);
        System.out.println(emp2.surname);


        emp1.Id();
        emp1.Salary();
        emp1.Surname();

        emp2.Id();
        emp2.Salary();
        emp2.Surname();

    }
}


package Homework2;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Homework1.Employee emp1=new Homework1.Employee(5);
        Homework1.Employee emp3=new Homework1.Employee(40);

        System.out.println(emp1.surname);

        emp1.Id();
        emp1.Salary();
        emp1.Surname();
    }
}


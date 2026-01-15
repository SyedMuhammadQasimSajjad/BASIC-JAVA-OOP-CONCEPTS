import java.util.Scanner;

public class Managers extends Employee {
    public Managers(String name, int id, double salary) {
        super(name,salary,id);
    }

    double bonus;
    double salary;


    public void CalculateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Performance bonus : ");
        bonus = sc.nextDouble();
        salary = getSalary()+bonus;
        System.out.println("Salary for Manager "+getName() +"\n id-"+getId()+" is : " + salary);

    }
}

import model.Employee;
import service.EmployeeService;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Department: ");
                String dept = sc.nextLine();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                service.addEmployee(new Employee(id, name, dept, salary));
                System.out.println("Employee Added");
            }

            else if (choice == 2) {
                for (Employee e : service.getAllEmployees()) {
                    System.out.println(e);
                }
            }

            else {
                break;
            }
        }
        sc.close();
    }
}

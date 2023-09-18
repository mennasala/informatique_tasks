import mypackage.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a department name");
        String depName = sc.nextLine();
        Department d = new Department(depName);
        while(true){

            System.out.println("To add an employee to a department Enter 1");
            System.out.println("To remove an employee from a department Enter 2");
            System.out.println("To print employees on a department Enter 3");
            System.out.println("To Exit Enter 0");
            System.out.println("Please Enter your choice");
            int choice = sc.nextInt();
            if(choice==0){
                break;
            }
            switch (choice){
                case 1:
                    Employee e = new Employee();
                    System.out.println("Please Enter employee id\n");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Please Enter employee Name\n");
                    String name = sc.nextLine();
                    System.out.println("Please Enter employee age\n");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Please Enter employee address\n");
                    String address = sc.nextLine();
                    e.id = id;
                    e.name = name;
                    e.age = age;
                    e.address = address;
                    d.addEmployeeToDepartment(e);
                    break;
                case 2:
                    System.out.println("Please Enter employee id");
                    int empId = sc.nextInt();
                    d.removeEmployee(empId);
                    break;
                case 3:
                    d.printEmployees();
                    break;
            }
        }

    }
}
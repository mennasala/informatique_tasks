package mypackage;
import java.util.ArrayList;
public class Department {
    public String deparmentName;
    public Department(String d){
        this.deparmentName = d;
    }
    ArrayList<Employee> arr = new ArrayList<Employee>();
    public void printEmployees(){
        if(arr.size()==0){
            System.out.println("There is no employees to print");
            return;
        }
        for(Employee e : arr){
            System.out.println("Employee ID: " + e.id);
            System.out.println("Employee Name: " + e.name);
            System.out.println("Employee Age: " + e.age);
            System.out.println("Employee Address: " + e.address);
            System.out.println("************************************");
        }
    }

    public void addEmployeeToDepartment(Employee e){
        arr.add(e);
    }
    public void removeEmployee(int employeeId){
        if(arr.size()==0){
            System.out.println("There is no employees to remove");
            return;
        }
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i).id == employeeId){
                arr.remove(i);
                return;
            }
        }
        System.out.println("There is no employee with the given id");
    }

}

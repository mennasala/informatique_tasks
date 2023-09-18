package mypackage;

public class Employee {
    public int id, age;
    public String name, address;
    Department depInstance;
    void printData(){
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Age: " + this.age);
        System.out.println("Employee Address: " + this.address);
    }
}

import java.util.Scanner;
public class Employee extends DevOpsEngineer {
    int id;
    String name;
    int salary;
    void read(){
        System.out.println("Enter id name and salary of employee");
        Scanner s=new Scanner(System.in);
        id=s.nextInt();
        name=s.next();
        salary=s.nextInt();
    }
    void display(){
        System.out.println("Id: "+id+"\nName: "+name+"\nSalary: "+salary);
    }
    public static void main(String[] args) {
        Employee e1=new Employee();
        DevOpsEngineer d1=new DevOpsEngineer();        
        e1.read();       
        e1.display();
        d1.readbonus();
        System.out.println("Total salary is: "+d1.calculate());
    }
    
}
import java.util.*;
class DevOpsEngineer{
    float bonous;
    int salary;
    void readbonus(){
        System.out.println("enter bonous of devops engineer");
        Scanner s=new Scanner(System.in);
        bonous=s.nextFloat();
        System.out.println("enter salary of devops engineer");
        salary=s.nextInt();
        // bonous=20;
        // salary=20000;
    }
    int calculate(){
        salary*=bonous;
        return salary;
    }
}
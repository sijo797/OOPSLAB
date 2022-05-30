import java.util.Scanner;
class Employee{
public String name;
publicint age;
public long phoneNumber;
public String address;
public double salary;

public void printSalary()
{
 System.out.println("salary="+salary);
}
}
class Officer extends Employee
{
public String specialization;


}
class Manager extends Employee{
public String department;
}
Class Empinheritence{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
Officer o=new Officer();
System.out.println("Enter the officer's name");
o.name=sc.nextLine();
System.out.println("Enter address:");
o.specilaization=sc.nextLine();
System.out.println("Enter Specialzaton");
o.specialzation=sc.nextLine();
System.out.println("Enter age");
o.age=sc.nextInt();
System.out.println("Enter Phone number");
o.phoneNumber=sc.nextLong();

sc.nextLine();

System.out.println("*****************************");
System.out.println("Officer Details:");
System.out.println("Officer's name"+o.name);
System.out.println("Age:"+o.age);
System.out.println("Phone number:"+o.phonenumber);
System.out.println("Specialization:"+o.specialization);
o.printSalary();
System.out.println(*********************************");
sc.nextLine();

Manager m=new Manager();
System.out.println("Enter the manager's Details");
System.out.println("Enter the manager's name");
m.name=sc.nextLine();
System.out.println("Enter Address:");
m.address=sc.nextLine();
System.out.println("Enter Department");
m.department=sc.nextLine();
System.out.println("Enter age");
m.age=sc.nextInt();
System.out.println("Enter PhoneNumber:");

m.phoneNumber=sc.nextLong();
System.out.println("Enter salary:");
m.salary=sc.nextDouble();

sc.nextLine();

System.out.println("**********************");
System.out.println("OFFICER DETAILS:");
System.out.println("OFficer's name"+m.name);
System.out.println("Age:"+m.age);
System.out.println("Address:"+m.address);
System.out.println("PhoneNumber:"+m.phoneNumber);
System.out.println("Department:"+m.department);
m.printSalary();
System.out.println("**************************");
}
}





















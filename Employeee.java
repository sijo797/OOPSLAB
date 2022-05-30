import java.util.*;

class Employeee {

  
  private int no;
  private String name;
  private double sal;
  private String dept;

  
  public Employeee(int no, String name, double sal, String dept){
    this.no = no;
    this.name = name;
    this.sal = sal;
    this.dept = dept;
  }

  //Setter and getter methods
  public String getName(){
    return name;
  }
  public double getSal(){
    return sal;
  }
  public void setSal(double sal){
    this.sal = sal;
  }
  public String getDept(){
    return dept;
  }
  public void setDept(String dept){
    this.dept = dept;
  }

  // method to display employee details
  public void display(){
    System.out.printf("Employeee details: ");
    System.out.printf("%d, %s, %.2f, %s\n",no, name, sal, dept);
  }

public static void main(String[] args) {

    Employeee[] emp = new Employeee[9];
    emp[0] = new Employeee(1001, "Olivia", 5000, "Core Java");
    emp[1] = new Employeee(1002, "Amelia", 5500, ".Net");
    emp[2] = new Employeee(1003, "Ella", 4500, "Oracle");
    emp[3] = new Employeee(1004, "Amelia", 8000, "Core Java");
    emp[4] = new Employeee(1005, "Grace", 5000, "HTML");
    emp[5] = new Employeee(1006, "Olivia", 6500, "C++");
    emp[6] = new Employeee(1007, "Isla", 6000, "Advance Java");
    emp[7] = new Employeee(1008, "Ada", 7500, "Oracle");
    emp[8] = new Employeee(1009, "Myla", 7000, "C++");

    
    System.out.println("Original Employeee details: ");
    for(Employeee e : emp){
      e.display();
    }

    
    for(Employeee e: emp){
      if((e.getDept().toUpperCase().contains("JAVA")
       || e.getDept().toUpperCase().contains("HTML"))
      && (!e.getName().equalsIgnoreCase("Amelia"))){
         e.setDept("Python");
         e.setSal(e.getSal()+500);
       }
    }

   
    System.out.println("\nModified Employeee details: ");
    for(Employeee e : emp){
      e.display();
    }
  }
}



  
  
 

 











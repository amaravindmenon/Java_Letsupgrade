/////////////////////////////////////////////////////////////////////////////////////////////Question 1
package letsupgrade;

import java.util.Scanner;
class employee{
    String name;
    int age;
    float salery;
    String designation;
   public void getdetails(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the name");
       name = sc.nextLine();
       
       System.out.println("Enter the age");
       age = sc.nextInt();
       
       System.out.println("Enter the designation");
       designation = sc.nextLine();
       
       System.out.println("Enter the salery");
       salery = sc.nextFloat();

   }
   public void displaydetails(){
       System.out.println("Enter the name"+this.name);
       System.out.println("Enter the age"+this.age);
       System.out.println("Enter the salery"+this.salery);
       System.out.println("Enter the designation"+this.designation);
   }
}

public class Letsupgrade {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.getdetails();
        e1.displaydetails();
    }
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////Question 2

package letsupgrade;

import java.util.Scanner;
class engineer{
    String name;
    String language;
    String designation;
    
   public void getdetails(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter engineer the name");
       name = sc.nextLine();
       
       System.out.println("Enter the engineer language");
       language = sc.nextLine();
       
       System.out.println("Enter the engineer designation");
       designation = sc.nextLine();

   }
   public void displaydetails(){
       System.out.println("engineer name "+this.name);
       System.out.println("engineer liked language "+this.language);
       System.out.println("engineer designation "+this.designation);
   }
}

class doctor{
    String name;
    String degree;
    String specification;
    
   public void getdetails(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the doctor name");
       name = sc.nextLine();
       
       System.out.println("Enter the Doctor degree");
       degree = sc.nextLine();
       
       System.out.println("Enter the doctor specification");
       specification = sc.nextLine();

   }
   public void displaydetails(){
       System.out.println("doctor the name "+this.name);
       System.out.println("the doctor degree "+this.degree);
       System.out.println("the specification "+this.specification);
   }
}

class pilots{
    String name;
    String experience;
    String compname;
    
   public void getdetails(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the pilot name");
       name = sc.nextLine();
       
       System.out.println("Enter the pilot experience");
       experience = sc.nextLine();
       
       System.out.println("Enter the pilots compname");
       compname = sc.nextLine();

   }
   public void displaydetails(){
       System.out.println("piilot name "+this.name);
       System.out.println("the pilot experience "+this.experience);
       System.out.println("the pilot compname "+this.compname);
   }
}

////////////////////////////////////////////////////////////////////////////////////////// Question 3

public class Letsupgrade {
    public static void main(String[] args) {
        engineer e1 = new engineer();
        doctor d1 = new doctor();
        pilots p1 = new pilots();
        p1.getdetails();
        p1.displaydetails();
    }
}


////////////////////////////////////////////////////////////////////////////////////////// Question 4

package letsupgrade;

import java.util.Scanner;
class employee{
    String name;
    int age;
    float salery;
    String designation;
   public void getdetails(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the name");
       name = sc.nextLine();
       
       System.out.println("Enter the age");
       age = sc.nextInt();
       
       System.out.println("Enter the designation");
       designation = sc.nextLine();
       
       System.out.println("Enter the salery");
       salery = sc.nextFloat();

   }
   public void displaydetails(){
       System.out.println("Enter the name"+this.name);
       System.out.println("Enter the age"+this.age);
       System.out.println("Enter the salery"+this.salery);
       System.out.println("Enter the designation"+this.designation);
   }
}

public class Letsupgrade {
    public static void main(String[] args) {
        employee e1 = new employee();
        employee e2 = new employee();
        employee e3 = new employee();
        e1.getdetails();
        e1.displaydetails();
        e2.getdetails();
        e2.displaydetails();
        e3.getdetails();
        e3.displaydetails();
    }
}

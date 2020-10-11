
class Employee{
        private String Name;
        private int Age;
        private String City;
        
        Employee(String Name,int Age,String City){
            this.Name = Name;
            this.Age = Age;
            this.City = City;
        }
        
        void display(){
            System.out.println("Name Of Employee is : "+Name);
            System.out.println("Name Of Employee is : "+Age);
            System.out.println("Name Of Employee is : "+City);
        }
        
    }    
public class Assignment1{

     public static void main(String []args){
        Employee E1 = new Employee("Tarun",20,"Delhi");
        E1.display();
         Employee E2 = new Employee("Aravind",24,"Janakpuri");
        E1.display();
     }
}

/******************************************************************************
              Question 1
*******************************************************************************/
import java.util.Scanner;
class avenger{
   String name;
   int age;
   String power;
   String weapon;
   String planet;
   public void getdetails(String name,int age,String power,String weapon,String planet){
       this.name = name;
       this.age = age;
       this.power = power;
       this.weapon = weapon;
       this.planet = planet;
   }
   public void showdetails(){
       System.out.println("Name Is: "+this.name);
       System.out.println("age Is: "+this.age);
       System.out.println("power Is: "+this.power);
       System.out.println("weapon Is: "+this.weapon);
       System.out.println("planet Is: "+this.planet);
   } 
}
public class Main
{
	public static void main(String[] args) {
	    avenger a1 = new avenger();
	    a1.getdetails("mika",10,"flying","akm","earth");
	    a1.showdetails();
	}
}

/******************************************************************************
                          Question 2
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5};
	    for(int i=0; i<5; i++){
	        if(arr[i] %2 != 0){
	            	System.out.println("Odd Number "+arr[i]);
	        }
	    }
	}
}


/******************************************************************************
              Question 3
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int arr[] = new int[5];
	    int sum = 0;
	    for(int i=0; i<5; i++){
	        System.out.println("Enter Number "+ (i+1));
	        arr[i] = sc.nextInt();
	    }
	    for(int i=0; i<5; i++){
	       sum+=arr[i];
	    }
	    System.out.println("Sum Is: "+sum);
	}
}

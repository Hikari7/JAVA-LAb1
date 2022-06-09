
import java.util.Scanner;


public class  Excercise2 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your cents  ");
    int cents = scanner.nextInt();
    int dollars;
     
   
    
    System.out.println("The value is " + cents + " cents");

    dollars = (cents / 100);
    System.out.println("$" + dollars + "." + cents);

    
scanner.close(); 
        
      }
}

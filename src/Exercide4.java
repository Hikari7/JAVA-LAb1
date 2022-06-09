// Write a program that takes a number as input and prints its multiplication table up to 10. Sample Output:
// Input a number: 9
// Expected Output :
// 9 x 1 = 9 9 x 2 = 18 9 x 3 = 27 ... 9 x 10 = 90


import java.util.Scanner;

public class Exercide4 {

  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Input the Number: ");
    int result = num .nextInt();
    for (int i = 1; i <= 10; i++) {
     System.out.println(result + "×" + i + " = " + ( result*i));
    }
    
  }
}

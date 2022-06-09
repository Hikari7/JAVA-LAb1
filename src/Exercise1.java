import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {

        double r;
        double area;        

        Scanner scanner = new Scanner(System.in);

        System.out.print( "The radius is: " );

            r = scanner.nextDouble();
       		area = r * r * Math.PI;
       		System.out.println( "The area is: " + area );

            scanner.close();
    }
}


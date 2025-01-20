import java.util.Scanner;

 public class Volumes{
 public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter a number: ");
   double length = input.nextDouble();

double area = Math.sqrt(3)/4 * Math.pow(length, 2);

double volume = area*length;
System.out.printf("area is %.3f volume is %.3f",area ,volume);






}
}
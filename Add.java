import java.util.Scanner;

public class Add{
 public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  
System.out.print("Enter a number: ");
int num1 = input.nextInt();

System.out.print("Enter a number: ");
double num2 = input.nextDouble();
 
 System.out.print("Enter a number: ");
 float num3 = input.nextFloat();

 double sum = num1 + num2 + num3;

System.out.print(sum);

}
}
  
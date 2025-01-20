import java.util.Scanner;

public class Compare{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int num1 = input.nextInt();

System.out.print("Enter a number: ");
int num2 = input.nextInt();


if (num1 > num2){
 System.out.print(1);

}else if (num2 > num1){
 System.out.print(-1);

}else if (num1 == num2){
 System.out.print(0);

    }


  }

}
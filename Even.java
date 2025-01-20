import java.util.Scanner;

public class Even{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

if (number % 2 == 0){
  System.out.print(1);
}else if (number % 2 != 0){
  System.out.print(0);

 }



}

}
import java.util.Scanner;

public class Maximum{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number1 = input.nextInt(); 

System.out.print("Enter a number: ");
int number2 = input.nextInt();

System.out.print("Enter a number: ");
int number3 = input.nextInt();

int number = 0;

if (number1 > number2){
System.out.print("number1 is a max");
}else if (number2 > number3){
System.out.print("number2 is a max");
}else if (number3 > number1){
System.out.print("number3 is a max");
}
}

}
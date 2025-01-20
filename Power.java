import java.util.Scanner;
import java.lang.Math;

public class Power{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number1 = 0;
int number2 = 1;
int count = 0;
System.out.printf("%s%6s%6s", "a", "b", "pow(a, b)");


while (count <= 5){

	System.out.printf("%d%6d%6d", number1, number2, (int)Math.pow(number1, number2));


}




}


}
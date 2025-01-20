import java.util.Scanner; d

public class Value{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.print("Enter a number(String): ");
String num = input.nextLine();

int number = Integer.valueOf(num);

System.out.print(number);
}
}
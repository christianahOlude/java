import java.util.Scanner;
public class Sums{
 public static void main(String[] args){
 
  Scanner input = new Scanner(System.in); 

   int sum = 0;
int count =1 ;
while( count <= 10){
count+=1;
System.out.print("Enter 10 number: ");
 int enter = input.nextInt();

sum +=enter;
  }

  System.out.print(sum);

    }

}
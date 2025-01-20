import java.util.Scanner;

 public class Values{
  public static void main(String[] args){

Scanner input = new Scanner(System.in);

//Tell the user to enter five numbers
System.out.print("Enter a number: ");
 int num1 = input.nextInt();

System.out.print("Enter a number: ");
 int num2 = input.nextInt();

System.out.print("Enter a number: ");
 int num3 = input.nextInt();

System.out.print("Enter a number: ");
 int num4 = input.nextInt();

System.out.print("Enter a number: ");
 int num5 = input.nextInt();

/* name the variables and add 1 to the calculations
   if it is negative, increment numbers by one,
   if it is positive, increment numbers  by one,
   then if it's zero, increment numbers by one */ 
 
int negative = 0;
 int positive = 0;
 int zero = 0;

if (num1 < 0){
 negative ++; 
 }
if (num2 < 0){
 negative ++;
 }
if (num3 < 0){ 
negative ++;
}
if (num4 < 0){
negative ++;
}
if (num5 < 0){
negative ++;
}


if (num1 > 0){
positive ++;
}
if (num2 > 0){
positive ++;
}
if (num3 > 0){
positive ++;
}
if (num4 > 0){
positive ++;
}
if (num5 > 0){
positive ++;
}

if (num1 == 0){
zero ++;
}
if (num2 == 0){
zero ++;
}
if (num3 == 0){
zero ++;
}
if (num4 == 0){
zero ++;
}
if (num5 == 0){
zero ++;
}

/**print final answer using the variable names from before*/ 
System.out.printf("Negative numbers are %d%nPositive numbers are %d%nZero numbers are %d", negative, positive, zero);




}


}




import java.util.Scanner;

public class Days{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a month number: ");
int monthumber = input.nextInt();

System.out.print("Enter a year: ");
int year = input.nextInt();

// int days = 0;

if(monthnumber == 1) {
 System.out.printf("January %d has 31 days", year);

}else if(monthnumber == 2 && year % 4 == 0){
 System.out.printf("febuary %d has 29 days", year);

}else if(monthnumber == 2 && year % 4 != 0){
 System.out.printf("Febuary %d has 28 days", year);

}else if (monthnumber == 3) {
 System.out.printf("March %d has 31 days", year);

}else if (monthnumber == 4) {
 System.out.printf("April %d has 30 days", year);

}else if (monthnumber == 5) {
 System.out.printf("May %d has 31 days", year);

}else if (monthnumber == 6) {
 System.out.printf("June %d has 30 days", year);

}else if (monthnumber == 7) {
 System.out.printf("July %d has 31 days", year);

}else if (monthnumber == 8) {
 System.out.printf("August %d has 31 days", year);

}else if (monthnumber == 9) {
 System.out.printf("September %d has 31 days", year);

}else if (monthnumber == 10) {
 System.out.printf("October %d has 31 days", year);

}else if (monthnumber == 11) {
 System.out.printf("November %d has 30 days", year);

}else if (monthnumber == 12) {
 System.out.printf("December %d has 31 days", year);
   }

}

}
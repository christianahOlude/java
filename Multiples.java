import java.util.Scanner;

  public class Multiples{
   public static void main(String[] args){

   Scanner input = new Scanner(System.in);

   System.out.print("Enter first integer");
    int enter1 = input.nextInt();
     int result1 = enter1*3;
    

      System.out.print("Enter second integer");
        int enter2= input.nextInt();
         int result2 = enter2*2;
         
         
         int result3 = result1 % result2;
         
       if (result3==0) {
        
          System.out.printf("The second number %d  is a multiple of first number %d%n.", enter1, enter2);
	} else { System.out.printf("The second number %d  is not a mutiple of the first number %d%n", enter1, enter2);
	}

}


}
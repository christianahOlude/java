import java.util.Scanner;

public class EvenNumbers{
	public static void main(String... args){

	int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	for(int number = 0; number <= array.length; number++){
		

		if(number % 2 != 0){
			System.out.println(number);
		}
	}
}
}
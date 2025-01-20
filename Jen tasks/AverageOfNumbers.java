public class AverageOfNumbers{
	public static void main(String... args){

	int average = 0;
	int sum = 0;

	int [] number = {5, 20, 5, 4, 5, 7, 8, 9};
    
		for(int userInput = 0 ; userInput < number.length; userInput++){
			  System.out.println(number[userInput]);

				sum+= number[userInput];
			average = sum / number[userInput];
			}
		System.out.println("The average of the number is: "+ average);	
	}
}
public class SumOfNumbers{
	public static void main(String[] args){

	int sum = 0;


	int [] number = {1, 2, 3, 4, 5};
    
		for(int userInput = 0 ; userInput < number.length; userInput++){
		
			  System.out.println(number[userInput]);
				sum += number[userInput];
			}  
		
		System.out.println("The sum of the number is: " +sum);
		}
}
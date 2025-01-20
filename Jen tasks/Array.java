public class Array{
	public static void main(String[] args){

	int sum = 0;
	int average = 0;


	int [] number = {5, 20, 5, 4, 5, 7, 8, 9};
    
		for(int i = 0 ; i < number.length; i++){
			if (number[i] % 2 == 0){
			  System.out.println(number[i]);
			}
				sum += number[i];
				  average = sum / number.length;
		
	}
		System.out.println("The sum of the number is: " +sum);
		System.out.println("The average is: "  +average);











	}
}
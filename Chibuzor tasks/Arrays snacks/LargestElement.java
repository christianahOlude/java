public class LargestElement{
	public static void main(String[] args){
	
	int [] numbers = {12,23,43,55,76};

	int large = array(numbers);
	
	System.out.print(large);
}
public static int array(int[] numbers){

	int largest = numbers[0];

	for(int number = 0; number < numbers.length; number++){
		if(numbers[number] > largest){
			largest = numbers[number];

		}
	}
	return largest;
	}
}
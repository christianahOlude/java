public class EvenNumber{
	public static void main(String... args){

	int [] numbers = {2, 4, 5, 8, 6};

	System.out.print("The number is: ");

	evenPositions(numbers);
	
	}
public static int evenPositions(int[] array){
	int even = array[0];
	
	for(int number = 0; number < array.length; number++){

		if(array[number] % 2 == 0){
			System.out.print(array[number]);

		}
	}
	return even;
}
}
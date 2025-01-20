public class OddNumber{
	public static void main(String... args){

	int [] numbers = {2, 4, 5, 8, 6};

	System.out.print("The number is: ");

	oddPositions(numbers);
	
	}
public static int oddPositions(int[] arr){
	int odd = arr[0];
	
	for(int number = 0; number < arr.length; number++){

		if(arr[number] % 2 != 0){
			System.out.print(arr[number]);

		}
	}
	return odd;
}
}
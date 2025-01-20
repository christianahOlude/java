public class ReverseList{
	public static void main(String[] args){

	int[] numbers = {1,2,3,4,5};

	System.out.print("The reverse of the list is: ");

	array(numbers);
	}

public static int array(int[] number){
	int reverse = number[0];

	for(int range = number.length; range > 0; range--){
		System.out.print(range);
	}
	return reverse;
	}
}
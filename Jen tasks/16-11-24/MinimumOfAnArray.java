public class MinimumOfAnArray{
	public static void main(String[] args){

	int [] numbers = {4, 2, 9, 1, 6};
	int min = numbers[0];

	for(int count = 0; count < numbers.length; count++){;
	
		if(numbers[count] < min){
			min = numbers[count];
		}
		}
			System.out.print("The minimum value is: "+ min);
	}
}
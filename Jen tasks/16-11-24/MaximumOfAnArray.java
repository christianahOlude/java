public class MaximumOfAnArray{
	public static void main(String[] args){

	int [] numbers = {1, 5, 2, 8, 3};
	int max = numbers[0];

	for(int count = 0; count < numbers.length; count++){;
	
		if(numbers[count] > max){
			max = numbers[count];
		}
		}
			System.out.print("The maximum value is: "+ max);

	}
}
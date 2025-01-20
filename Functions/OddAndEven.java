public class OddAndEven{
	public static void main(String[] args){

	int[] numbers = {1,2,3,6,8,10,1};
	int count = 0;
	
	for(int index = numbers.length; index > 0; index--){
		if (index % 2 == 0){
		 count += index;
	}
		System.out.print(count);
}
}
}
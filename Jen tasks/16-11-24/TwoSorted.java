public class TwoSorted{
	public static void main(String[] args){

	int[] array = {1, 3, 5};
	int[] arrays = {2, 4, 6};
	int[] numbers = new int [array.length + arrays.length];
	
	for(int count = 0; count < numbers.length; count++){
	   if(count < array.length){
	numbers[count] = array[count];
	}
	if(count >= array.length){
	  numbers[count] = arrays[count+array.length];
	}
    }
	int temp = 0;
	for(int number = 0; number < numbers.length;number++){
	   for(int counter = number +1; counter < numbers.length; counter++){
			if(numbers[counter]< numbers[number]){
				temp = numbers[counter];
				numbers[counter] = numbers[number];
				numbers[number]=temp;
			}
		}
	}

		System.out.println(Arrays.toString(numbers));
	}


}

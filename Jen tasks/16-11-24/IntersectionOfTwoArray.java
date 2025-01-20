public class IntersectionOfTwoArrays(
	public static void main(String[] args){

	int [] arrays = {1, 2, 3, 4};
	int [] array = {3, 4, 5, 6};

	for(int number = 0; number < arrays.length; number++){
		int counter = 0;
	for(int count=number+1;count<array.length;count++){
		if(arrays[number]==array[count]){
				counter++;
		}
	}
		if(counter>0) System.out.println(arrays[number]);
	}


}















}
}
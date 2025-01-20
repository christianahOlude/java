public class DuplicateValues{
	public static void main(String[] args){

	int [] arrays = {1, 4, 3, 2, 3, 2};


	for(int number = 0; number < arrays.length; number++){
		int counter = 0;
		for(int count=number+1;count<arrays.length;count++){
			if(arrays[number]==arrays[count]){
				counter++;
			}
		}
		if(counter>0) System.out.println(arrays[number]);
	}
	
}
}
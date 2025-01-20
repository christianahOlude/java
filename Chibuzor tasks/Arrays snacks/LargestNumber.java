import java.util.Arrays;
public class LargestNumbrTask{
	public static int largestOf(int [] numbers){
		
	int largest = numbers[5];

	for(int index : numbers){
		if(index > largest)largest = index;
	}
	return largest;

	}

public static void main(String... args){
		
	}
}





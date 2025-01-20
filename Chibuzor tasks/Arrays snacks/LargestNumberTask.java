import java.util.Arrays;
public class LargestNumberTask{
	public static int largestOf(int [] numbers){
		
	int largest = numbers[5];

	for(int index : numbers){
		if(numbers[index] > largest)largest =numbers[index];
	}
	return largest;

	}

public static void main(String... args){
	int[] arrs = {12,34,65,43};
	System.out.println(largestOf(arrs));
		
	}
}





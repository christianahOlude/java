public class OddElementTask{

	public static int getOddNumber(int[] arrayValue){
		int oddValue = 0;
		for(int index = 0; index < arrayValue.length; index++){
			if(arrayValue[index] % 2 == 0)oddValue = arrayValue[index];
		}
	return oddValue;

	}

public static void main(String... args){
	
	int[] values = {1,2,3,4,5,6,5,7,8,9};
	System.out.println(getOddNumber(values));
	
	}

}
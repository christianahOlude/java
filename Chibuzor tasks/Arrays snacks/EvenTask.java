public class EvenTask{


public static int getAllEvenNumbers(int[] numbers){
	int result = 0;
	for(int index = 0; index < numbers.length; index++){
		if(index % 2 == 0)result = index;
	}

	return result;
}

public static void main(String... args){
int[] number = {1,2,3,4,5,6,7,8,9,8,76,54,3};
System.out.print(getAllEvenNumbers(number));
}

}
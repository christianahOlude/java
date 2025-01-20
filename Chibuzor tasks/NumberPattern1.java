public class NumberPattern1{
	public static void main(String [] args){
	
	printUpperTriangle(5);

	printLowerTriangle(4);
	printNewLine();

	
}
	public static void printUpperTriangle(int numberOfTimes){
		for(int i = 1; i < numberOfTimes; i++){
			printNumber(i);
			printNewLine();
		}
	}
	
	public static void printLowerTriangle(int numberOfTimes){
		for(int i = numberOfTimes; i > 0; i--){
			printNumber(i);
			printNewLine();
		}
	}
	


	public static void printNumber(){
		System.out.print("* ");
	}

	public static void printNewLine(){
		System.out.println();

	}
	public static void printNumber(int numberOfTimes){
	for(int i = 0; i < numberOfTimes; i++){
		printNumber();
	}
	}

	
}

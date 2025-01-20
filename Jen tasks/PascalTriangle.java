
public class PascalTriangle{
	public static void main(String[] args){

int rows = 5;
	for(int i = 0; i < rows; i++){
		int value = 1;

	  for(int j = 0; j < rows - i; j++){
		System.out.print(" ");
	}

	for(int k = 0; k <= i; k++){
		value = value * (i - k) / (k + 1);

	      System.out.print(value + " ");
}
		System.out.println();
}



}
}
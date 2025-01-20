public class Triangle{
	public static void main(String[] args){

int rows = 7;
	for(int i = 0; i < rows; i++){
		int value = 1;

	  for(int j = 0; j < rows - i; j++){
		System.out.print(" ");
	}

	for(int k = 0; k < i; k++){
		value = i - k;

	      System.out.print(value + " ");
}
		System.out.println();
}


	for(int i = 0; i < rows; i++){
	
	for(int m = 0; m < i ; m++){
		System.out.print(" ");
	}
  	for(int j = rows; j > i; j--){
		System.out.print(j - i + " ");
	}
	for(int k = 0; k < rows; k++){
		System.out.print(" ");
	}
	System.out.println(" ");
}


}
}
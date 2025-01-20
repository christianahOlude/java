
public class Table{
public static void main(String[] args){
	
		for (int multiple = 1; multiple <= 12; multiple ++){
			for(int number = 1; number <= 12; number++){
			  int result = number * multiple;
			System.out.printf("%d * %d = %d%n", number,multiple,result);
			}
		}
			
	}
}
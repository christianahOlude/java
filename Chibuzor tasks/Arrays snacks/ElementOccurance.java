public class ElementOccurance{
//pass in two arguement inside the method, an array and a integer value
public static int isOccur(int[] occurElement, int element){
//declare and initialse a counter so that you will use it to count the occurran
	
	for(int index = 1; index < occurElement.length; index++){
		if(occurElement[index] == element)occurElement[index] = element;
		}
	return element;
	}


public static void main(String[] args){
int[] arrayValue = {1,2,34,56,54,321,1,1,2};
int element = 34;
int result = isOccur(arrayValue, element);
System.out.println("Element: "+ arrayValue + " found "+ element );

}

}
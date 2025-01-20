import java.util.Scanner;

public class AwardARank{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int rank = scan.nextInt();
	
	switch (rank){

	case 1:
	 if(rank == 1){
	 System.out.print("Gold Medal");
	}
	case 2:
	 if(rank == 2){
	System.out.print("Silver Medal");
	}
	case 3:
	 if(rank == 3){
	System.out.print("Bronze Medal");
	}
	case 4:
	 if(rank == 4){
	 System.out.print("Participant Ribbon");
	}
	}
}
}
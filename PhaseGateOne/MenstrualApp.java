import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class MenstrualApp{

	public static void main(String[] args){

	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter start date: ");
		String startDate = input.nextLine();
		
		System.out.print("Enter end date: ");
		String endDate = input.nextLine();

		System.out.print("Enter your menstural cycle: ");
			int days = input.nextInt();

		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		LocalDate periodStartTime = LocalDate.parse(startDate,date);	
		LocalDate periodEndTime = LocalDate.parse(endDate,date);
		Period period = Period.between(periodStartTime,periodEndTime);

		System.out.println("Your mensturation duration: " + period);

		LocalDate ovulationPeriod = periodEndTime.plusDays(days/2);
		System.out.println("Your ovulation period start: " + ovulationPeriod);

		LocalDate ovulationPeriodEnd = ovulationPeriod.plusDays(2);
		System.out.println("Your ovulation period end: " + ovulationPeriodEnd);

		LocalDate freePeriod = periodEndTime.plusDays(1);
		System.out.println("Your safe period start: " + freePeriod);	

		LocalDate endFreePeriod = periodEndTime.plusDays(6);
		System.out.println("Your safe period ends: " + endFreePeriod);

		LocalDate fertilePeriodstart = ovulationPeriod.minusDays(4);

		LocalDate fertilePeriodend = ovulationPeriodEnd.plusDays(2);
	
		LocalDate nextPeriodStart = periodEndTime.plusDays(days);
		System.out.println("Your next period start: " + nextPeriodStart);

	}	
}
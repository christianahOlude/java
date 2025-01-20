import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
       
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a mark: ");
	int mark = input.nextInt();

	System.out.print("Enter attendance: ");
	int attendance = input.nextInt();

        char grade;
        if (mark >= 90) {
            grade = 'A';
        } else if (mark >= 80) {
            grade = 'B';
        } else if (mark >= 70) {
            grade = 'C';
        } else if (mark >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        if (attendance < 75) {
            grade = (char) (grade + 1); 
        }

        if (grade > 'F') {
            grade = 'F';
        }
        System.out.println("Student Grade: " + grade);
}
}
    
import java.util.Scanner;
import java.util.Arrays;

public class MbtiPersonalityTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int [] answersA = new int[4];
		int [] answersB = new int[4];
		String[] personality = new String[4];
		String [] responses = new String[20];

		String[][] questions = {
				{"1. expend energy, enjoy groups", "\t\tconserve energy, enjoy one-on-one"},
				{"2. Interpret literally", "\t\tLook for meaning and possibilities"},
				{"3. Logical, thinking, questioning", "\t\tempathetic, feeling, accomodating"},
				{"4. organised, orderly", "\t\tflexible, adaptable"},
				{"5. more outgoing, think out loud", "\t\tmore reserved, think to yourself"},
				{"6. practical, realistic, experimental", "\t\timaginative, innovative, theoretical"},
				{"7. candid, straight forward, frank", "\t\ttactful, kind, encouraging"},
				{"8. plan. schedule", "\t\tunplanned, spontaneous"},
				{"9. seek many tasks, public activities, interaction", "\t\tseek private, solitary activities with quiet to concentration"},
				{"10. standard, usual, conventional", "\t\tdifferent, novel, unique"},
				{"11. firm, tend to criticize, hold the line", "\t\tgentle, tend to appreciate, concilliate"},
				{"12. regulated, structured", "\t\teasy-going,live and let live"},
				{"13. external, communicative, express yourself", "\t\tinternal, reticent, keep to yourself"},
				{"14. focus on here-and-now", "\t\tlook to the future, global perspective, big picture"},
				{"15. tough-minded, just", "\t\ttender-hearted, merciful"},
				{"16. preparation, plan ahead", "\t\tgo with the flow, adapt as you go"},
				{"17. active, initiate", "\t\treflective, deliberate"},
				{"18. facts, things, what is", "\t\tideas, dreams, what could be, philosophical"},
				{"19. matter of fact, issue-orientated", "\t\tsensitive, people-orientated, compassionate"},
				{"20. control, govern", "\t\tlatitude, freedom"}

		};

		System.out.print("What is your name? ");
		String name = input.nextLine();
		for (int index = 0; index < 4; index++) {
			for (int i = index; i < questions.length; i += 4) {
				System.out.print(questions[i][0]);
				System.out.print(questions[i][1]);
				System.out.println();
				String answer = input.nextLine();
				if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b")   ) {
					if (answer.equalsIgnoreCase("a")) {
						answersA[index]++;
						responses[i] = questions[i][0];
					} else if (answer.equalsIgnoreCase("b")) {
						answersB[index]++;
						responses[i] = questions[i][1];
					}
				} else {
					System.out.println("Wrong answer.");
					i -= 4;
				}
			}
		}

		if (answersA[0] > answersB[0]) {
			personality[0] = "E";
		} else {
			personality[0] = "I";
		}

		if (answersA[1] > answersB[1]) {
			personality[1] = "S";
		}else {
			personality[1] = "N";
		}
		if (answersA[2] > answersB[2]) {
			personality[2] = "T";
		}else{
			personality[2] = "F";
		}
		if (answersA[3] > answersB[3]) {
			personality[3] = "J";
		}else{
			personality[3] = "P";
		}

		String personalityString = "";

		for (String letter : personality) {
			personalityString += letter;
		}

		System.out.println("your options");

		for (String choice : responses) {
			System.out.println(choice.trim());
		}

		switch (personalityString) {
			case "ISTJ":
				System.out.println("ISTJ (Introverted, Sensing, Thinking, Judging)\n Individuals with ISTJ personality types are known for their practicality organization, and reliability. They value tradition and order, and are often drawn to careers in law enforcement, finance, and government. ISTJs are detail-oriented and analytical, making them excellent problem-solvers. They are also loyal and committed to their loved ones, and value long-term relationships. However, ISTJs may struggle with adaptability and spontaneity, preferring routine and structure");
				break;


			case "ISFJ":
				System.out.println("""
			ISFJ (Introverted, Sensing, Feeling, Judging)
			ISFJs are compassionate and supportive individuals who prioritize the needs of others. They are meticulous and organized, with a strong attention to detail. ISFJs excel in careers that involve helping others, such as teaching, nursing, and social work. They value harmony and stability, and are often peacemakers in their personal and professional lives. However, ISFJs may struggle with assertiveness and boundary-setting, and may need to work on expressing their own needs and desires.
			""");
				break;


			case "INFJ":
				System.out.println("""
			
			INFJ (Introverted, Intuitive, Feeling, Judging)
			INFJs are visionary and empathetic individuals who are driven to make a positive difference in the world. They are creative and innovative, with a strong connection to their intuition. INFJs excel in careers that involve helping others, such as counseling, teaching, and social justice. They value authenticity and integrity, and are often drawn to artistic or humanitarian pursuits. However, INFJs may struggle with burnout and self-care, and may need to prioritize their own needs.
			""");
				break;

			case "INTJ":
				System.out.println("""
			INTJ (Introverted, Intuitive, Thinking, Judging)
			INTJs are strategic and analytical individuals who are driven to achieve greatness. They are independent and self-motivated, with a strong desire for knowledge and understanding. INTJs excel in careers that involve innovation and problem-solving, such as science, technology, and entrepreneurship. They value efficiency and effectiveness, and are often drawn to leadership roles. However, INTJs may struggle with interpersonal relationships and emotional intelligence.
			""");
				break;


			case "ISTP":
				System.out.println("""
			ISTP (Introverted, Sensing, Thinking, Perceiving)
			ISTPs are resourceful and adaptable individuals who thrive in dynamic environments. They are practical and hands-on, with a strong connection to the physical world. ISTPs excel in careers that involve troubleshooting and problem-solving, such as engineering, technology, and emergency response. They value freedom and flexibility, and are often drawn to unconventional lifestyles.
			""");
				break;


			case "ISFP":
				System.out.println("""
			ISFP (Introverted, Sensing, Feeling, Perceiving)
			ISFPs are artistic and compassionate individuals who value creativity and self-expression. They are gentle and empathetic, with a strong connection to the emotional realm. ISFPs excel in careers that involve art, music, and performance. They value authenticity and individuality, and are often drawn to alternative lifestyles
			""");
				break;


			case "INFP":
				System.out.println("""
			INFP (Introverted, Intuitive, Feeling, Perceiving)
			INFPs are idealistic and creative individuals who are driven to make a positive difference in the world. They are empathetic and compassionate, with a strong connection to their intuition. INFPs excel in careers that involve writing, teaching, and social justice. They value authenticity and integrity, and are often drawn to artistic or humanitarian pursuits.
			""");
				break;


			case "INTP":
				System.out.println("""
			INTP (Introverted, Intuitive, Thinking, Perceiving)
			INTPs are innovative and analytical individuals who are driven to understand the world around them. They are independent and self-motivated, with a strong desire for knowledge and understanding. INTPs excel in careers that involve science, technology, and philosophy. They value intellectual freedom and curiosity.
			""");
				break;


			case "ESTP":
				System.out.println("""
			ESTP (Extraverted, Sensing, Thinking, Perceiving)
			ESTPs are adventurous and action-oriented individuals who thrive in dynamic environments. They are practical and hands-on, with a strong connection to the physical world. ESTPs excel in careers that involve sales, marketing, and entrepreneurship. They value freedom and flexibility
			""");
				break;


			case "ESFP":
				System.out.println("""
			ESFP (Extraverted, Sensing, Feeling, Perceiving)
			ESFPs are spontaneous and enthusiastic individuals who value creativity and self-expression. They are social and outgoing, with a strong connection to the emotional realm. ESFPs excel in careers that involve entertainment, teaching, and event planning.
			""");
				break;


			case "ENFP":
				System.out.println("""
			ENFPs are charismatic and imaginative individuals who inspire others with their creativity and passion. They are empathetic and compassionate, with a strong connection to their intuition. ENFPs excel in careers that involve writing, teaching, and social justice.
			""");
				break;


			case "ENTP":
				System.out.println("""
			ENTP (Extraverted, Intuitive, Thinking, Perceiving)
			ENTPs are entrepreneurial and innovative individuals who are driven to revolutionize the status quo. They are independent and self-motivated, with a strong desire for knowledge and understanding. ENTPs excel in careers
			""");
				break;


			case "ESTJ":
				System.out.println("""
			ESTJ (Extraverted, Sensing, Thinking, Judging)
			As an ESTJ, you possess a unique blend of assertive leadership and practical expertise, making you a respected authority in your field. Your ability to bring order and stability to any organization is unparalleled, and your decisiveness and confidence inspire others to follow your lead. Your strong sense of responsibility and duty drives you to take charge and ensure that tasks are completed efficiently. You value tradition and structure, and your attention to detail is exceptional. With your natural charisma and leadership abilities, you excel in roles that require strategic planning and execution.
			""");
				break;


			case "ESFJ":
				System.out.println("""
			ESFJ (Extraverted, Sensing, Feeling, Judging)
			As an ESFJ, you are a beloved community builder, renowned for your warmth and exceptional organizational skills. Your talent for bringing people together and fostering meaningful connections creates a positive impact on those around you. Your empathy and support nurture growth, and your dedication to helping others is unwavering. You excel in roles that involve teamwork, mediation, and conflict resolution. Your attention to detail and ability to multitask make you an invaluable asset in any organization.
			""");
				break;


			case "ENFJ":
				System.out.println("""
			ENFJ (Extraverted, Intuitive, Feeling, Judging)
			As an ENFJ, you possess a rare combination of charismatic leadership and empathetic understanding. Your ability to inspire others to grow and develop is unparalleled, and your strategic vision motivates and guides those around you. Your unique blend of intuition and compassion enables you to navigate complex emotional landscapes with ease. You excel in roles that require coaching, mentoring, or counseling, and your natural charisma makes you a compelling public speaker. Value your exceptional interpersonal skills, and continue to harness your transformative power to make a positive impact.
			""");
				break;


			case "ENTJ":
				System.out.println("""
			ENTJ (Extraverted, Intuitive, Thinking, Judging)
			As an ENTJ, you embody the spirit of confident leadership and strategic vision. Your entrepreneurial drive and innovative thinking propel you toward greatness, and your logical analysis uncovers innovative solutions. Your trailblazing nature and willingness to take calculated risks inspire others to follow your lead. You thrive in challenging environments, where your quick thinking and adaptability enable you to stay ahead of the curve.
			""");
				break;

			default:
				System.out.println("invalid input");
				break;


		}
	}
}

	

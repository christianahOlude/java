import java.util.Scanner;

public class Nokia{
 
	public static void main(String[] args){

	displayMenu();
	}

	
	
public static void displayMenu(){
	Scanner input = new Scanner(System.in);
 	String menu = """
    	
	Welcome dear customer,press

	1. phonebook
	2. Messages
	3. Chat
	4. Call Register
	5. Tones
	6. Settings
	7. Call Divert
	8. Games
	9. Calculator
	10. Remainder
	11. Clock
	12. Profiles
	13. SIM Services
	14. Exit

	Enter ur prefered choice!!!

""";
	print(menu);
	int userChoice = input.nextInt();

	switch(userChoice){

	case 1 -> phoneBook();
	case 2 -> messages();
	case 3 -> displayMenu();
	case 4 -> callRegister();
	case 5 -> tones();
	case 6 -> settings();
	case 7 -> displayMenu();
	case 8 -> displayMenu();
	case 9 -> displayMenu();
	case 10 -> displayMenu();
	case 11 -> clock();
	case 12 -> displayMenu();
	case 13 -> displayMenu();
	case 14 -> System.exit(12);
	default -> displayMenu();

	
	}

	
}

	public static void print(String nokia){
		System.out.println(nokia);
	}


	public static void phoneBook(){
	Scanner input = new Scanner(System.in);
	String options = """
	1. Search
	2. Service Nos
	3. Add name
	4. Erase
	5. Edit
	6. Assign tone
	7. Send b'card
	8. Options
	9. Speed dials
	10. Voice tags

	""";
	print(options);
	
	int userChoice = input.nextInt();

	switch(userChoice){

	case 8 -> phoneBookView();

	}

}



public static void phoneBookView(){
	Scanner input = new Scanner(System.in);
	String view = """
	1. Type of view
	2. Memory status

	""";
	print(view);
	displayMenu();
	
	
	}



public static void messages(){
	Scanner input = new Scanner(System.in);
	String messages = """
	1. Write messages
	2. Inbox 
	3. Outbox
	4. Picture messages
	5. Templates
	6. Smileys
	7. Message settings
	8. Info service 
	9. Voice mailbox number
	10. Service command editor

""";
	print(messages);
	
	int userChoice = input.nextInt();

	switch(userChoice){
	
	case 7 -> messageSettings();

	}
}

public static void messageSettings(){
	Scanner input = new Scanner(System.in);
	String messageSettings = """
	1. Set 1
	2. Common

""";
	print(messageSettings);

	int userChoice = input.nextInt();

	switch(userChoice){

	case 1 -> set();
	}
}

public static void set(){
	Scanner input = new Scanner(System.in);
	String set = """
	1. Message centre number
	2. Messages sent as
	3. Message validity

""";
	print(set);
	
	int userChoice = input.nextInt();

	switch(userChoice){

	case 2 -> common();

	}
}
public static void common(){
	Scanner input = new Scanner(System.in);
	String common = """
	1. Delivery reports
	2. Reply via same centre
	3. Character support

""";
	print(common);

	int userChoice = input.nextInt();

	displayMenu();
	
	}

public static void callRegister(){
	Scanner input = new Scanner(System.in);
	String callRegister = """
	1. Missed calls
	2. Received calls
	3. Dialled numbers
	4. Erase recent calls
	5. Show call duration
	6. Show call costs
	7. Call cost setting
	8. Prepaid credit

""";
	print(callRegister);
	
	int userChoice = input.nextInt();

	switch(userChoice){

	case 5 -> showCallDuration();
	}
}

public static void showCallDuration(){
	Scanner input = new Scanner(System.in);
	String showCallDuration = """
	1. Last call duration
	2. All calls' duration
	3. Received calls' duration
	4. Dialled calls' duration
	5. Clear timers

""";
	print(showCallDuration);

	callRegister();

	int userChoice = input.nextInt();

	switch(userChoice){

	case 6 -> showCallCosts();
	}
}
public static void showCallCosts(){
	Scanner input = new Scanner(System.in);
	String showCallCosts = """
	1. Last call cost
	2. All calls' cost
	3. Clear counters

""";
	print(showCallCosts);

	int userChoice = input.nextInt();

	switch(userChoice){

	case 7 -> callCostSettings();
	}
}
public static void callCostSettings(){
	Scanner input = new Scanner(System.in);
	String callCostSetting = """
	1. Call cost limit
	2. Show costs in

""";
	print(callCostSetting);

	int userChoice = input.nextInt();
	
	callRegister();

}
public static void tones(){
	Scanner input = new Scanner(System.in);
	String tones = """
	1. Ringing tone
	2. Ringing volume
	3. Incoming call alert
	4. Composer
	5. Message alert tone
	6. Keypad tones
	7. Warning and game tones
	8. Vibrating alert
	9. Screen saver
""";
	print(tones);
	
	int userChoice = input.nextInt();
	
}
public static void settings(){
	Scanner input = new Scanner(System.in);
	String settings = """
	1. Call settings
	2. Phone settings
	3. Security setting
	4. Restore factory settings

""";
	print(settings);
	
	int userChoice = input.nextInt();

	switch(userChoice){

	case 1 -> callSettings();
	}
}
public static void callSettings(){
	Scanner input = new Scanner(System.in);
	String callSettings = """
	1. Automatic redial
	2. Speed dialling 
	3. Call waiting options
	4. Own number sending
	5. Phone line in use
	6. Automatic answer
""";	
	print(callSettings);

	int userChoice = input.nextInt();

	switch(userChoice){
	
	case 2 -> phoneSettings();
	
	}
}
public static void phoneSettings(){
	Scanner input = new Scanner(System.in);
	String phoneSettings = """
	1. Language
	2. Cell info display
	3. Welcome note
	4. Network selection
	5. Lights
	6. Confirm SIM service actions
""";
	print(phoneSettings);

	int userChoice = input.nextInt();

	switch(userChoice){

	case 2 -> securitySettings();
	}
}
public static void securitySettings(){
	Scanner input = new Scanner(System.in);
	String securitySettings = """
	1. PIN code request
	2. Call barring service
	3. Fixed dialling
	4. Closed user group
	5. Phone security
	6. Change access codes
""";
	print(securitySettings);

	int userChoice = input.nextInt();

	displayMenu();
}
public static void clock(){
	Scanner input = new Scanner(System.in);
	String clock = """
	1. Alarm
	2. Clock settings
	3. Date setting
	4. Stopwatch
	5. Countdown timer
	6. Auto update of date and time
""";
	print(clock);

	displayMenu();
	}
}

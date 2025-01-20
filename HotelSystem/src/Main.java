import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       ArrayList<Rooms> rooms = new ArrayList<>();
        ArrayList<Customers> customers = new ArrayList<>();


        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Naija Comfort Room");
        System.out.println("Please enter your choice");
        String menu = """
                1. Book a room
                2. View booking
                3. Edit profile
                4. Check room availability
                5. Payment status
                6. Cancel booking
                7. View all available rooms
                8. view Notifications 
                9. exit
                """;

        System.out.println(menu);
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> bookRoom();
            case 2 -> cancelBooking();
            case 3 -> editProfile();
            case 4 -> checkRoomAvailability();
            case 5 -> paymentStatus();
            case 6 -> viewBooking();
            case 7 -> viewAllAvailableRooms();
            case 8 -> viewNotifications();
            case 9 -> System.exit(0);
        }
    }

    public static void bookRoom() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Naija Comfort inn: ");
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter your email address: ");
        String email = input.nextLine();
        System.out.print("Select room type(Single/Double/Suite): ");
        String roomType = input.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = input.nextInt();



        ArrayList<Booking> bookings = Hotel.getBookings();



        Booking booking = new Booking();
        booking.setBookingID(bookings.size() + 1);
        booking.setCustomerID();
        booking.setRoomNumber();
        booking.setRoomType();
        booking.setCheckInDate();
        booking.setCheckOutDate();

        System.out.println("Booking successful");


        menu();

    }

    public static void cancelBooking() {
        Scanner input = new Scanner(System.in);

        System.out.print("Are you sure you want to cancel the reservation? (Y/N): ");
        String confirm = input.next();
        if (confirm.equals("Y")) {
            System.out.print("Enter booking reference: ");
            String bookingReference = input.nextLine();

            System.out.print("Reservation cancelled successfully");
        }
        menu();
    }
    public static void checkRoomAvailability() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rooms are available? ");
        int rooms = input.nextInt();

        menu();
    }

    public static void editProfile() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your email address: ");
        String email = input.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = input.nextLine();
    }
    public static void paymentStatus() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter room type(Single/Double/Suite): ");
        String roomType = input.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = input.nextInt();
        System.out.print("Is this a festive period? (Y/N): ");
        String confirm = input.next();
        if (confirm.equals("y")) {
            System.out.print("Festive period surcharge: ");
            double festivePeriod = input.nextDouble();
        }
        menu();
    }

    public static void viewBooking() {
        Scanner input = new Scanner(System.in);
        System.out.println("View guest details for room: ");
        String room = input.nextLine();

        menu();
    }


    public static void viewAllAvailableRooms() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many rooms are available? : ");
        String room = input.nextLine();

        menu();
    }

    public static void generateReports() {
        Scanner input = new Scanner(System.in);
        System.out.println("Generate weekly report: ");
        String room = input.nextLine();

        menu();
    }

    public static void viewNotifications() {
        Scanner input = new Scanner(System.in);

        System.out.println("Send reminder for booking : ");
    }


}

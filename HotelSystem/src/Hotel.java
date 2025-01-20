import java.util.ArrayList;

public class Hotel {
    private String hotelName;
    private String hotelAddress;
    private String listOfRooms;
    static ArrayList<Booking> bookings = new ArrayList<>();
    ArrayList<Customers> customers = new ArrayList<>();
    private ArrayList<Rooms> rooms = new ArrayList<>();

    public void createRooms(){
        Rooms room = new Rooms("Single", "001", 2000, true);
        rooms.add(room);

        Rooms room1 = new Rooms("double", "002", 5000, true);
        rooms.add(room1);

        Rooms room2 = new Rooms("Suite", "003", 10000, true);
        rooms.add(room2);

        Rooms room3 = new Rooms("Single", "004", 2000, true);
        rooms.add(room);

        Rooms room4 = new Rooms("double", "005", 5000, true);
        rooms.add(room1);

        Rooms room5 = new Rooms("Suite", "006", 10000, true);
        rooms.add(room2);

        Rooms room6 = new Rooms("Single", "007", 2000, true);
        rooms.add(room);

        Rooms room7 = new Rooms("double", "008", 5000, true);
        rooms.add(room1);

        Rooms room8 = new Rooms("Suite", "009", 10000, true);
        rooms.add(room2);

        Rooms room9 = new Rooms("Single", "010", 2000, true);
        rooms.add(room);

        Rooms room10 = new Rooms("double", "011", 5000, true);
        rooms.add(room1);

        Rooms room11 = new Rooms("Suite", "012", 10000, true);
        rooms.add(room2);



    }

    public static ArrayList<Booking> getBookings() {
        return bookings;
    }

    public static void setBookings(ArrayList<Booking> bookings) {
        Hotel.bookings = bookings;
    }

    public static ArrayList<Booking> addBookings(Booking booking){
        bookings.add(booking);
        return bookings;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Hotel(String hotelName, String hotelAddress, String listOfRooms) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.listOfRooms = listOfRooms;
    }
    public String getHotelName() {
        return hotelName;
    }
    public String getHotelAddress() {
        return hotelAddress;
    }
    public String getListOfRooms() {
        return listOfRooms;
    }
    public void setListOfRooms(String listOfRooms) {
        this.listOfRooms = listOfRooms;
    }

}

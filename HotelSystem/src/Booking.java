import java.util.ArrayList;
public class Booking {
    private int bookingID;
    private int customerID;
    private String roomNumber;
    private String roomType;
    private String checkInDate;
    private String checkOutDate;

        public Booking() {
            this.bookingID = 0;
            this.customerID = 0;
            this.roomNumber = "";
            this.roomType = "";
            this.checkInDate = "";
            this.checkOutDate = "";

        }
        public int getBookingID() {
            return bookingID;
        }
        public void setBookingID(int bookingID) {
            this.bookingID = bookingID;
        }
        public int getCustomerID() {
            return customerID;
        }
        public void setCustomerID(int customerID) {
            this.customerID = customerID;
        }
        public String getRoomNumber() {
            return roomNumber;
        }
        public void setRoomNumber(String roomNumber) {
            this.roomNumber = roomNumber;
        }
        public String getRoomType() {
            return roomType;
        }
        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }
        public String getCheckInDate() {
            return checkInDate;
        }
        public void setCheckInDate(String checkInDate) {
            this.checkInDate = checkInDate;
        }
        public String getCheckOutDate() {
            return checkOutDate;
        }
        public void setCheckOutDate(String checkOutDate) {
            this.checkOutDate = checkOutDate;
        }


}

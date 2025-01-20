public class Rooms {
    private String roomNumber;
    private String roomType;
    private double price;
    private boolean isAvailable;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Rooms( String roomType, String roomNumber,  double price, boolean isAvailable) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.price = 0.0;
        this.isAvailable = false;
            }

            public String getRoomNumber() {
        return roomNumber;
            }
            public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
            }
            public double getPrice() {
        return price;
            }
            public void setPrice(double price) {
        this.price = price;
            }
            public boolean isAvailable() {
        return isAvailable;
            }
            public void setAvailable(boolean available) {
        isAvailable = available;
            }

}

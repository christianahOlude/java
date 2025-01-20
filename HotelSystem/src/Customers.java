public class Customers {
    private int customerID;
    private String customerName;
    private String customerPhone;
    private String customerEmail;

        public Customers(int customerID, String customerName, String customerPhone, String customerEmail) {
            this.customerID = customerID;
            this.customerName = customerName;
            this.customerPhone = customerPhone;
            this.customerEmail = customerEmail;


        }
        public int getCustomerID() {
            return customerID;
        }
        public void setCustomerID(int customerID) {
            this.customerID = customerID;
        }
        public String getCustomerName() {
            return customerName;
        }
        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }
        public String getCustomerPhone() {
            return customerPhone;
        }
        public void setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
        }
        public String getCustomerEmail() {
            return customerEmail;
        }
        public void setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
        }

}

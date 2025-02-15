public class Cars{
    private String  model;
    private int year;
    private String color;

    public Cars(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }


}

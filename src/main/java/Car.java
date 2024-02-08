public class Car {
    private String brand;
    private String color;
    private int km;
    private int buildYear;

    public Car(String brand, String color, int km, int buildYear) {
        this.brand = brand;
        this.color = color;
        this.km = km;
        this.buildYear = buildYear;
    }

    public void addKm(int km){
        this.km = km + this.km;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }

    public int getBuildYear() {
        return buildYear;
    }
}

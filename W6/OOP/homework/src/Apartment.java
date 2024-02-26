public class Apartment {
    // Properties
    private String name;
    private String address;
    private int floorCount;
    private String region;
    private double rent1Bedroom;
    private double rent2Bedroom;
    private double rent3Bedroom;

    // Constructor
    public Apartment(String name, String address, int floorCount, String region, double rent1Bedroom, double rent2Bedroom, double rent3Bedroom) {
        this.name = name;
        this.address = address;
        this.floorCount = floorCount;
        this.region = region;
        this.rent1Bedroom = rent1Bedroom;
        this.rent2Bedroom = rent2Bedroom;
        this.rent3Bedroom = rent3Bedroom;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getRent1Bedroom() {
        return rent1Bedroom;
    }

    public void setRent1Bedroom(double rent1Bedroom) {
        this.rent1Bedroom = rent1Bedroom;
    }

    public double getRent2Bedroom() {
        return rent2Bedroom;
    }

    public void setRent2Bedroom(double rent2Bedroom) {
        this.rent2Bedroom = rent2Bedroom;
    }

    public double getRent3Bedroom() {
        return rent3Bedroom;
    }

    public void setRent3Bedroom(double rent3Bedroom) {
        this.rent3Bedroom = rent3Bedroom;
    }
}


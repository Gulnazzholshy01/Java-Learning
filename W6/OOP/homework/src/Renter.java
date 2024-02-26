public class Renter {
    // Properties
    private String name;
    private String email;
    private String moveInDate;
    private String city;
    private String preferredRegion;
    private int preferredNumBedrooms;
    private int preferredNumBaths;


    //Constructor
    public Renter(String name, String email, String moveInDate, String city, String preferredRegion, int preferredNumBedrooms, int preferredNumBaths) {
        this.name = name;
        this.email = email;
        this.moveInDate = moveInDate;
        this.city = city;
        this.preferredRegion = preferredRegion;
        this.preferredNumBedrooms = preferredNumBedrooms;
        this.preferredNumBaths = preferredNumBaths;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(String moveInDate) {
        this.moveInDate = moveInDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPreferredRegion() {
        return preferredRegion;
    }

    public void setPreferredRegion(String preferredRegion) {
        this.preferredRegion = preferredRegion;
    }

    public int getPreferredNumBedrooms() {
        return preferredNumBedrooms;
    }

    public void setPreferredNumBedrooms(int preferredNumBedrooms) {
        this.preferredNumBedrooms = preferredNumBedrooms;
    }

    public int getPreferredNumBaths() {
        return preferredNumBaths;
    }

    public void setPreferredNumBaths(int preferredNumBaths) {
        this.preferredNumBaths = preferredNumBaths;
    }
}
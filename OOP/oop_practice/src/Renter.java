public class Renter {
    // Properties
    private String name;
    private String email;
    private String moveInDate;
    private String city;
    private String preferredRegion;
    private int preferredNumBedrooms;
    private int preferredNumBaths;


    //Default Constructor
    public Renter() {
        this.name = "N/A";
        this.email = "N/A";
    }

    //Overloaded Constructor
    public Renter(String moveDate, String preRegion, String city ) {
        this.name = "Not Set";
        this.email = "Not Set";
        moveInDate = moveDate;
        preferredRegion = preRegion;
        this.city = city;
    }
   

    // Constructor
    // public Renter(String name, String email, String moveInDate, String preferredRegion, int preferredNumBedrooms, int preferredNumBaths) {
    //     this.name = name;
    //     this.email = email;
    //     this.moveInDate = moveInDate;
    //     this.city = city;
    //     this.preferredRegion = preferredRegion;
    //     this.preferredNumBedrooms = preferredNumBedrooms;
    //     this.preferredNumBaths = preferredNumBaths;
    // }


    //Instance Method - Working Method
    public void outputNameEmail(){
        System.out.println("Name: " + name + " Email: " + email);

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

    public String toString() //Overriding the toString()
    {
       return "Name: " + name + ", "+ "Email: "+ email + " Preferred Region: " + preferredRegion + " Move in Date: " + moveInDate;
    }
}
public class Customer {
    private String name;
    private String email;
    private double weightKilos;
    //private double bmr;


    //Default Constructor
    public Customer(){
        this.name = "N/A";
        this.email = "N/A";
    } 
      
    //Constructor
    public Customer(String name, String email, double weightKilos) {
        this.name = name;
        this.email = email;
        this.weightKilos = weightKilos;
    }
    
    
    //Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email= email;
    }

    public double getWeightKilos() {
        return weightKilos;
    }

    public void setweightKilos(double weightKilos){
        this.weightKilos = weightKilos;
    }

    //Class Method
    public double convertWeighttoPounds(){
        return weightKilos * 2.20462;
    }

    //Working Method
    // private void calculateBMR(){
    //     bmr = 88.362 + (13.397 * weightKilos);
    // }
}

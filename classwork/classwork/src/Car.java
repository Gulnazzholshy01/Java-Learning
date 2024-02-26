public class Car {
    private String name;
    private String model;
    private double price;

    // Constructor
    public Car(String name, String model, double price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    //Getters and Setters
    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //Class Method
    public double discountPrice(){
        return price * 0.2;
    }
}

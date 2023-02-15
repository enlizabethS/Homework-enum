public class Car {
    String title;
    int tankCapacity;
    Fuel fuel;

    public Car(String title, int tankCapacity, Fuel fuel) {
        this.title = title;
        this.tankCapacity = tankCapacity;
        this.fuel = fuel;
    }
    public double calculatePrice(){
        return fuel.getPrice() * tankCapacity;
    }

    @Override
    public String toString() {
        return "Car: "  + title + "\n" +
                "Tank Capacity: " + tankCapacity + "\n" +
                "Full tank : "+
                calculatePrice();
    }
}

public enum Fuel {
    GAS95(1.57),GAS98(1.76),DIZEL(1.74);
    double price;

    Fuel(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

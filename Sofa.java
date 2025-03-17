class Sofa implements Furniture {
    private double volume;
    private double distance;

    public Sofa(double volume, double distance) {
        this.volume = volume;
        this.distance = distance;
    }

    public double getVolume() {
        return volume;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public void accept(ShippingCostCalculator visitor) {
        visitor.calculateShipping(this);
    }
}

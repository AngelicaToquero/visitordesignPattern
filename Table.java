class Table implements Furniture {
    private double surfaceArea;

    public Table(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    @Override
    public void accept(ShippingCostCalculator visitor) {
        visitor.calculateShipping(this);
    }
}
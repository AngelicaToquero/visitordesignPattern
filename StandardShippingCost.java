class StandardShippingCost implements ShippingCostCalculator {
    @Override
    public void calculateShipping(Chair chair) {
        double cost = chair.getWeight() * 2.0;  // Flat rate per kg
        System.out.println("Shipping cost for Chair: $" + cost);
    }

    @Override
    public void calculateShipping(Table table) {
        double cost = table.getSurfaceArea() * 5.0;  // Cost based on surface area
        System.out.println("Shipping cost for Table: $" + cost);
    }

    @Override
    public void calculateShipping(Sofa sofa) {
        double cost = (sofa.getVolume() * 10) + (sofa.getDistance() * 0.5);  // Volume & distance-based cost
        System.out.println("Shipping cost for Sofa: $" + cost);
    }
}
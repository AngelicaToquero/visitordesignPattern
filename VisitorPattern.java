public class VisitorPattern{
    public static void main(String[] args) {
        Furniture[] furnitureItems = {
            new Chair(10),   
            new Table(4),    
            new Sofa(3, 100) 
        };

        ShippingCostCalculator shippingCalculator = new StandardShippingCost();

        for (Furniture furniture : furnitureItems) {
            furniture.accept(shippingCalculator);
        }
    }
}
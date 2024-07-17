public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        // Implement logic to verify quantity and adjust shipping costs
        if (order.getItemCount() > 5) {
            order.setShippingCost(0);
            System.out.println("QuantityObserver: Free shipping applied. Shipping cost: " + order.getShippingCost());
        } else {
            order.setShippingCost(10); // Default shipping cost
            System.out.println("QuantityObserver: Default shipping cost applied. Shipping cost: " + order.getShippingCost());
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int id;
    private int itemCount;
    private double itemCost;
    private double shippingCost = 7.99;  // Default shipping cost
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public void addItem(double price) {
        // Add logic to add an item
        // and notify observers
        this.itemCost += price;
        this.itemCount++;
        notifyObservers();
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    // Getters and setters for itemCount, itemCost and ShippingCost
    public int getItemCount() {
        return itemCount;
    }
    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
}
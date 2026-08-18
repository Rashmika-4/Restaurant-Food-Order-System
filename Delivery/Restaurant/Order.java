package Restaurant;

public class Order {

    private int orderId;
    private String customerName;
    private String foodName;
    private int quantity;
    private double unitPrice;
    private double totalAmount;

    public Order(int orderId, String customerName,
                 String foodName, int quantity, double unitPrice) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.foodName = foodName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public void calculateOrderAmount() {

        totalAmount = quantity * unitPrice;
    }

    public void displayOrderDetails() {

                System.out.println("ORDER DETAILS:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Name: " + foodName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: Rs. " + unitPrice);
        System.out.println("Total Amount: Rs. " + totalAmount);
           }
}

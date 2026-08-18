package Delivery;

import Restaurant.Restaurant;
import Restaurant.Order;

public class Delivery {

    public static void main(String[] args) {


        System.out.println("RESTAURANT FOOD ORDER SYSTEM");
        int restId = 101;
        String name = "RKode Restaurant";
        String address = "Chennai";

        String food1 = "Pizza";
        String food2 = "Burger";
        String food3 = "Pasta";

        double price1 = 250;
        double price2 = 150;
        double price3 = 200;

        Restaurant restaurant = new Restaurant(
            restId, name, address,
            food1, food2, food3,
            price1, price2, price3
        );

        restaurant.displayRestaurantDetails();

        int orderId = 5001;
        String customerName = "Arun";
        String foodName = "Pizza";
        int quantity = 2;
        double unitPrice = 250;

        Order order = new Order(
            orderId, customerName, foodName,
            quantity, unitPrice
        );

        order.calculateOrderAmount();
        order.displayOrderDetails();

        System.out.println("Restaurant ID using getter : "
                           + restaurant.getRestId());

        restaurant.setName("RKode Food Corner");

        System.out.println("After changing restaurant name:");

        restaurant.displayRestaurantDetails();

    }
}

package Restaurant;

public class Restaurant {

    private int restId;
    private String name;
    private String address;
    private String food1;
    private String food2;
    private String food3;
    private double price1;
    private double price2;
    private double price3;

    public Restaurant(int restId, String name, String address,
                      String food1, String food2, String food3,
                      double price1, double price2, double price3) {

        this.restId = restId;
        this.name = name;
        this.address = address;
        this.food1 = food1;
        this.food2 = food2;
        this.food3 = food3;
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
    }

    public int getRestId() {
        return restId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayRestaurantDetails() {

      
        System.out.println("RESTAURANT DETAILS:");
        System.out.println("Restaurant ID: " + restId);
        System.out.println("Restaurant Name: " + name);
        System.out.println("Address: " + address);


        System.out.println("FOOD MENU");

        System.out.println("1. " + food1 + " - Rs." + price1);
        System.out.println("2. " + food2 + " - Rs." + price2);
        System.out.println("3. " + food3 + " - Rs." + price3);

        
    }
}

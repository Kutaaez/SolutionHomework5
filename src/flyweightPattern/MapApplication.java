package flyweightPattern;

public class MapApplication {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MarkerStyle shop = MarkerStyleFactory.getStyle("shop", "Red");
            shop.display("Location " + i);
        }

        for (int i = 0; i < 5; i++) {
            MarkerStyle restaurant = MarkerStyleFactory.getStyle("restaurant", "Green");
            restaurant.display("Location " + i);
        }

        System.out.println("Total unique styles created: " + MarkerStyleFactory.getTotalStyles());
        System.out.println("Total markers created: " + MarkerStyleFactory.getTotalMarkersCreated());

    }
}
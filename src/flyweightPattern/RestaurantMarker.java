package flyweightPattern;

public class RestaurantMarker implements MarkerStyle{
    private String color;

    public RestaurantMarker(String color) {
        this.color = color;
    }

    @Override
    public void display(String location) {
        System.out.println("Displaying Restaurant at " + location + " with " + color + " color.");
    }
}

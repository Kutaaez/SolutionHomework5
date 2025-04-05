package flyweightPattern;

public class ShopMarker implements MarkerStyle{
    private String color;

    public ShopMarker(String color) {
        this.color = color;
    }

    @Override
    public void display(String location) {
        System.out.println("Displaying Shop  at " + location + " with " + color + " color.");
    }
}

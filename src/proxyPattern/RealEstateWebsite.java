package proxyPattern;

public class RealEstateWebsite {
    public static void main(String[] args) {
        Image krisha = new ImageProxy("bostandyq.jpg");

        krisha.displayThumbnail();      // No heavy loading
        krisha.displayFullImage();      // Loads high-res on demand
    }
}

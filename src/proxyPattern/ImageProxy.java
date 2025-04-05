package proxyPattern;

public class ImageProxy implements  Image{
    private String imageName;
    private HighDefinitionImage realImage;

    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying thumbnail for: " + realImage);
    }
    @Override
    public void displayFullImage() {
        if (realImage == null) {
                realImage = new HighDefinitionImage(imageName);
        }
        realImage.displayFullImage();
    }
}

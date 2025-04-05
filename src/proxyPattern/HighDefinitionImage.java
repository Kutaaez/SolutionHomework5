package proxyPattern;

public class HighDefinitionImage implements Image{
    private String imageName;

    public HighDefinitionImage(String imageName) {
        this.imageName = imageName;
        loadFullImage();

    }
    private void loadFullImage() {
        System.out.println("* Loading full image from: " + imageName);
    }

    @Override
    public void displayFullImage() {
        System.out.println("[ ] Displaying FULL image: " + imageName);
    }
    public void displayThumbnail() {
        System.out.println("o Displaying thumbnail for: " + imageName);
    }
    public void uploadOrReplaceImage(String newImageName) {

        System.out.println("Image " + imageName + " is replaced with " + newImageName);
        this.imageName = newImageName;
        loadFullImage();
    }
}

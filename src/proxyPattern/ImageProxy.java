package proxyPattern;

public class ImageProxy implements  Image{
    private String imageName;
    private HighDefinitionImage realImage;
    private Agent agent;


    public ImageProxy(String imageName, Agent agent) {
        this.imageName = imageName;
        this.agent = agent;
    }

    public String getImageName() {
        return imageName;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("-\no Displaying thumbnail for: " + getImageName() + " low resolution.");
    }
    public void load() {
        // Defer loading until necessary
        if (realImage == null) {
            realImage  = new HighDefinitionImage(imageName);
        }
    }
    @Override
    public void displayFullImage() {
        load();
        realImage.displayFullImage();
    }

    // only logged in agents can upload or replace images.
    public void uploadOrReplaceImage(String newImageName) {
        if (agent.isLoggedIn()) {
            load();
            System.out.println("✔ Agent " + agent.getUsername() + " is uploading/replacing the image.");
            realImage.uploadOrReplaceImage(newImageName);

        } else {
            System.out.println("✖ Access denied. Please log-in  to upload or replace images.");
        }
    }
}

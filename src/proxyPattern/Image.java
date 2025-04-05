package proxyPattern;

public interface Image {
    void displayThumbnail();
    void displayFullImage();
    void uploadOrReplaceImage(String newImageName);
}
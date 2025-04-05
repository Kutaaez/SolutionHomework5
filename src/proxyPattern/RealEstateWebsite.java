package proxyPattern;

public class RealEstateWebsite {
    public static void main(String[] args) {
        //created objects.
        Agent user = new Agent("Zharaskhan Miramuly");
        Agent user2 = new Agent("Aitanov Daniar");
        Image krisha = new ImageProxy("bostandyq.jpg", user);
        Image potolok = new ImageProxy("auezovski.png", user2);
        krisha.displayThumbnail();      // No heavy loading
        krisha.displayFullImage();      // Loads high-res on demand

        potolok.displayThumbnail();
        potolok.uploadOrReplaceImage("almalinskyy.png");
        user2.logIn();
        potolok.uploadOrReplaceImage("almalinskyy.png");
        potolok.displayFullImage();
    }
}

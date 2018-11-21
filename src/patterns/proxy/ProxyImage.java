package patterns.proxy;

public class ProxyImage implements Image {
    RealImage realImage;
    String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void diasplay() {
        if (realImage == null) {
            realImage = new RealImage(this.fileName);
        }

        realImage.diasplay();
    }
}

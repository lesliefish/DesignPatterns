package patterns.proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void diasplay() {
        System.out.println("Display image : " + this.fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Load from disk : " + this.fileName);
    }
}

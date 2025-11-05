package DocumentEditor.data;

public class ImageElements implements DocumentElement {
    public ImageElements(String imagePath) {
        this.imagePath = imagePath;
    }

    String imagePath;

    @Override
    public String render() {
        return "[Image is: " + imagePath + "]";
    }
}

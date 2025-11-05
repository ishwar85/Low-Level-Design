package DocumentEditor.data;

public class TextElements implements DocumentElement {

    String text;

    public TextElements(String text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text;
    }
}

package DocumentEditor.data;

public class NewLineElements implements DocumentElement {
    @Override
    public String render() {
        return "\n";
    }
}

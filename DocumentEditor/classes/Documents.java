package DocumentEditor.classes;

import DocumentEditor.data.DocumentElement;

import java.util.ArrayList;
import java.util.List;

public class Documents {

    List<DocumentElement> elementList = new ArrayList<>();

    public void addElement(DocumentElement documentElement) {
        elementList.add(documentElement);
    }

    public String render() {
        StringBuilder result = new StringBuilder();
        for (DocumentElement element : elementList) {
            result.append(element.render());
        }
        return result.toString();
    }

}

package DocumentEditor.classes;

import DocumentEditor.classes.Documents;
import DocumentEditor.data.ImageElements;
import DocumentEditor.data.NewLineElements;
import DocumentEditor.data.TextElements;
import DocumentEditor.storage.Persistence;

public class DocumentEditor {
    private Documents document;
    private Persistence storage;
    private String renderedDocument = "";

    public DocumentEditor(Documents document, Persistence storage) {
        this.document = document;
        this.storage = storage;
    }

    public void addText(String text) {
        document.addElement(new TextElements(text));
    }

    public void addImage(String imagePath) {
        document.addElement(new ImageElements(imagePath));
    }
    public void addNewLine() {
        document.addElement(new NewLineElements());
    }

    // Adds a new line to the document.

    public String renderDocument() {
        if (renderedDocument.isEmpty()) {
            renderedDocument = document.render();
        }
        return renderedDocument;
    }

    public void saveDocument() {
        storage.save(renderDocument());
    }
}

package DocumentEditor;

import DocumentEditor.classes.DocumentEditor;
import DocumentEditor.classes.Documents;
import DocumentEditor.storage.FileStorage;
import DocumentEditor.storage.Persistence;

public class DocumentEditorClient {
    public static void main(String[] args) {
        Documents document = new Documents();
        Persistence persistence = new FileStorage();

        DocumentEditor editor = new DocumentEditor(document, persistence);

        // Simulate a client using the editor with common text formatting features.
        editor.addText("Hello, world!");
        editor.addNewLine();
        editor.addText("This is a real-world document editor example.");
        editor.addNewLine();
        editor.addText("Indented text after a tab space.");
        editor.addNewLine();
        editor.addImage("picture.jpg");

        // Render and display the final document.
        System.out.println(editor.renderDocument());

        editor.saveDocument();
    }
}

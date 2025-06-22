public class WordDocumentFactory extends DocumentFactory{
    @Override
    public document createDocument() {
        return new WordDocument();
    }
}

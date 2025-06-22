public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public document createDocument() {
        return new ExcelDocument();
    }
}

public class PdfDocumentFactory extends DocumentFactory{
    @Override
    public document createDocument() {
        return new PdfDocument();
    }
}

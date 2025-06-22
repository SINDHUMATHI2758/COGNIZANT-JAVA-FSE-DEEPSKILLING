public class WordDocument implements document{
    @Override
    public void open() {
        System.out.println("Pdf Document is opening...");
    }

    @Override
    public void close() {
        System.out.println("Pdf Document is closing...");
    }
}

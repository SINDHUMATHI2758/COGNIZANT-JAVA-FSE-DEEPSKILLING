public class ExcelDocument implements document{
    @Override
    public void open() {
        System.out.println("Excel Document Opening....");
    }

    @Override
    public void close() {
        System.out.println("Excel Document Closing...");
    }
}

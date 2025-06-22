import java.util.Arrays;

public class BinarySearch {
    private static BinarySearch instance;
    private BinarySearch(){}
    public static BinarySearch getInstance(){
        if(instance==null){
            instance=new BinarySearch();
        }
        return instance;
    }
    public void binarySearch(Book[] books,String title){
        Arrays.sort(books,(b1,b2)->b1.title.compareToIgnoreCase(b2.title));
        int low=0;
        int high= books.length-1;
        while(low<high){
            int mid=(low+high)/2;
            int comparison = title.compareToIgnoreCase(books[mid].title);
            if(comparison==0){
                System.out.println("Book Id "+books[mid].bookId+"/nTitle "+books[mid].title+"/nAuthor "+books[mid].author);
            }
            else if(comparison<0)
                high=mid-1;
            else
                low=mid+1;
        }
    }
}

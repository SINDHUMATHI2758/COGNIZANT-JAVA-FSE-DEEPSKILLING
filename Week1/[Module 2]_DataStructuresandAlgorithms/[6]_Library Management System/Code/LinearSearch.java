public class LinearSearch {
    private static LinearSearch instance;
    private LinearSearch(){}
    public static LinearSearch getInstance(){
        if(instance==null){
            instance=new LinearSearch();
        }
        return instance;
    }
    public void linearSearch(Book[] books,String title){
        int n= books.length;
        for(int i=0;i<n;i++){
            if(books[i].title.equalsIgnoreCase(title)){
                System.out.println("Book ID: "+books[i].bookId+"\nTitle: "+books[i].title+"\nAuthor: "+books[i].author);
            }
        }
    }
}

import java.util.Arrays;
import java.util.Comparator;
public class BinarySearch {
    private static BinarySearch instance;
    private BinarySearch(){
        
    }

    public static BinarySearch getInstance() {
        if(instance==null){
            instance=new BinarySearch();
        }
        return instance;
    }
    public void binarySearch(Product[] products,String name){
       Arrays.sort(products,(p1,p2)->p1.productName.compareToIgnoreCase(p2.productName));
        int low=0,high=products.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int target=name.compareToIgnoreCase(products[mid].productName);
            if(target== 0) {
                System.out.println("Product ID: " + products[mid].productId + "\nProduct Name: " + products[mid].productName + "\nProdcut Category: " + products[mid].category + "\nProduct Quantity: " + products[mid].quantity + "\nProduct Amount: " + products[mid].amount);
                break;
            }

            else if (target < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
    }
}

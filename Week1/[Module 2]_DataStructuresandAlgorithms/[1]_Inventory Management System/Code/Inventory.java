import java.util.ArrayList;

public class Inventory {
    ArrayList<Product>products=new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product added successfully");
    }
    public void deleteProduct(int productId){
        for(Product p:products){
            if(p.productId==productId){
                products.remove(p);
                System.out.println("Prodcut removed successfully");
                return;
            }

                System.out.println("Product Id does not exist");

        }
    }
    public void updateProduct(int productId,String productName,int quantity,double price){
        for(Product p:products){
            if(p.productId==productId) {
                p.productName = productName;
                p.quantity = quantity;
                p.price = price;
                System.out.println("Product Updated Successfully");
                System.out.println("Product Id: " + p.productId + "/nProduct Name: " + p.productName + "/nQuantity: " + p.quantity + "/nPrice: " + p.price);
                return;
            }
        }
        System.out.println("Product Id does not exist");
    }
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (Product p : products) {
                p.displayProduct();
            }
        }
    }
}

public class LinearSearch {
    private static LinearSearch instance;
    private LinearSearch(){

    }
    public static LinearSearch getInstance(){
    if(instance==null) {
        instance = new LinearSearch();
    }
        return instance;
    }
    public void linearSearch(Product[] products,String name){
        for(int i=0;i< products.length;i++){
            if(products[i].productName.equalsIgnoreCase(name)){
                System.out.println("Product ID: "+products[i].productId+"\nProduct Name: "+products[i].productName+"\nProdcut Category: "+products[i].category+"\nProduct Quantity: "+products[i].quantity+"\nProduct Amount: "+products[i].amount);
            }
        }
    }

}
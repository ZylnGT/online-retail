package RetailSystemFiles;
public class Product {
   private int productId;
   private String name;
   private double price;
   private int quantity;
   
   public Product(int prodId, String n, double p, int q ){
      productId = prodId;
      name = n;
      price = p;
      quantity = q;
   }
   
      
   public Product(){
      productId = 00;
      name = "";
      price = 0;
      quantity =0;
   }

   //setters
   public void setProductId(int _productId){
      productId = _productId;
   }

   public void setProductName(String _name){
      name = _name;
   }

   public void setProductPrice(double _price){
      price = _price;
   }

   //getters
   public int getProductId(){
      return productId;
   }

   public String getName(){
      return name;
   }

   public double getPrice(){
      return price;
   }

   public int getQuantity(){
      return quantity;
   }

   //methods
   public void updatePrice(double _price){
      this.price = _price;
   }

   public void updateStock(int _quantity){
      this.quantity = _quantity;
   }
   
   public String toString(){
      return "product id: " + productId + "\nname: " + name + "\nprice: " + price + "\nquanity: " + quantity;
   }
}
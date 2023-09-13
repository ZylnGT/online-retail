package RetailSystemFiles;
public class Inventory {
    private int MAX;
    private Product[] list;
    private int counter;
    private int maxQuantity;

    public Inventory() {
        MAX = 20;
        list = new Product[MAX];
        list[0] = new Product(1, "apple", 11.99, 20);
        list[1] = new Product(34, "orange", 10.99, 30);
        list[2] = new Product(65, "pineapple", 14.50, 40);
        list[3] = new Product(21, "banana", 15.30, 50);
        counter = 4;
        maxQuantity = 99;
    }

    public int getCounter(){
        return counter;
    }
    //methods
    public boolean addProduct(Product p){
        if(counter >= MAX){
            System.out.println("Maximum limit of Products made");
            return false;
        }

        counter++;
        list[counter - 1] = p;
        return true;
    }

    public boolean removeFromInventory(int index){
        if(counter == 0){
            System.out.println("Your cart is empty");
            return false;
        }

        System.out.println(list[index-1].getName() + " has been removed from storage");
        for(int i = index - 1; i < counter - 1; i++){
            list[i] = list[i + 1];
        }
        counter--;

        return true;
    }

    public boolean updateInventoryStock(int index, int qty){
        list[index - 1].updateStock(qty);
        return true;
    }

    public boolean deductInventoryStock(int index, int qty){
        list[index - 1].updateStock(list[index - 1]. getQuantity() - qty);
        return true;
    }

    public void showInventory(){
        for(int i = 0; i < counter; i++){
            System.out.println("[" + (i + 1) + "]" + "  $" + list[i].getPrice() + "    " + list[i].getName().toUpperCase() + "          stock: " + list[i].getQuantity());
        }
    }

    public boolean refillInventory(int index){
        if(list[index - 1].getQuantity() >= maxQuantity){
            System.out.println("Stock of this product is already full");
            return false;
        }
        list[index - 1].updateStock(maxQuantity);
        return true;
    }

    public Product findProduct(int index){
        return list[index - 1];
    }
}
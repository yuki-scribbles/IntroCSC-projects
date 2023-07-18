//Student Name: Trina Dang
//LSU ID: 899459534

package cakeshop;

public class CakeShop {
    public static void main(String[] args) {
        //makes an object Inventory that will contain a list of cakes
        Inventory cakeInventory = new Inventory();
        //adds cakes onto array list
        cakeInventory.addCake(new Cake("Chocolate", 1, 149.99));
        cakeInventory.addCake(new Cake("Chocolate", 3, 299.99));
        cakeInventory.addCake(new Cake("Carrot", 2, 99.99));
        cakeInventory.addCake(new Cake("Vanilla", 6, 199.99));
        //sorts the cakes and prints it
        cakeInventory.listInventory();
    }
    
}

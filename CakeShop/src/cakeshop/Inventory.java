//Student Name: Trina Dang
//LSU ID: 899459534

package cakeshop;
import java.util.ArrayList;
import java.util.Collections;

public class Inventory{
    //makes the array list of cakes
    ArrayList<Cake> cakes = new ArrayList<Cake>();
    //method for adding an object of cake onto the array list
    public void addCake(Cake cake){
        cakes.add(cake);
    }
    //method to call sorting of Cakes and print out details of the cakes
    public void listInventory(){
        Collections.sort(cakes);
        //enhanced for loop
        for(Cake i:cakes){
            i.printCard();
        }
    }
}

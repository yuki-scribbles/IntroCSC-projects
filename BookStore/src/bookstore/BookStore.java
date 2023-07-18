//Student Name: Trina Dang
//LSU ID: 899459534

package bookstore;
import java.util.ArrayList;
import java.util.Collections;

//The program has a list of written works, sorted by genre and then title

public class BookStore{
    public static void main(String[] args) {
        
        //Array list of objects of the class Publication
        ArrayList<Publication> myBookStore = new ArrayList<>();
        
        myBookStore.add(new Book("Patricia Churchland", "Consciousness", "Neurophilosophy"));
        myBookStore.add(new Magazine("Springer Nature", "Nature", "Science and Technology"));
        myBookStore.add(new Publication("Mastering the game of Go", "Science and Technology"));
        myBookStore.add(new Book("LazyTown", "On the Nature of Baking Cakes", "Cakeshop Philosophy"));
        
        Collections.sort(myBookStore);
        
        //Runs through the array list and prints out the info
        for(Publication p: myBookStore)
        System.out.println(p.getInfo());
        
    }
    
}

//Student Name: Trina Dang
//LSU ID: 899459534

package bookstore;

public class Magazine extends Publication {
    /*
    Subclass of Publication. Creates a magazine
    */
    
    //instance variable
    private String publisher;
    
    /**
     * Constructor to create a magazine
     * @param publisher - Magazine's publisher
     * @param title - Magazine's title
     * @param genre - Magazine's genre
     */
    public Magazine(String publisher, String title, String genre){
        super(title, genre);
        this.publisher = publisher;        
    }
    
    /**
     * 
     * @return a string with title, genre, and publisher
     */
    @Override
    public String getInfo(){
        return(title + ", " + genre + ". Published by " + publisher);
    }
}

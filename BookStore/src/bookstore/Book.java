//Student Name: Trina Dang
//LSU ID: 899459534

package bookstore;

public class Book extends Publication {
    /*
    Subclass of publication. Creates a book 
    */
    
    //instance variable
    private String author;
    
    /*
    Creates object of book
    @param author - author of book
    @param title - title of book
    @param genre - genre of book
    */
    public Book(String author, String title, String genre){
        super(title, genre);
        this.author = author;
    }
    
    /*
     * 
     * @return a string to format title, genre, and author
     */
    @Override
    public String getInfo(){
        return(title + ", " + genre + ". Written by " + author);
    }
    
}

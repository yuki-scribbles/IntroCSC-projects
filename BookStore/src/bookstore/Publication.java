//Student Name: Trina Dang
//LSU ID: 899459534

package bookstore;

public class Publication implements Comparable <Publication>{
    /**Superclass Publication. Used to represent different types of written works
       Implements the comparable interface so items can be sorted.
    **/
    
    //instance variables
    String title;
    String genre;    
    
    /**
     * Creates a publication
     * @param title - title of the publication
     * @param genre - genre of publication
     */
    public Publication(String title, String genre){
        this.genre = genre;
        this.title = title;
    }
    
    /**
     * @return a string of the publication's title and genre
     */
    public String getInfo(){
        return(title + ", " + genre);
    }
    
    /**
    comparable function to compare by genre and then title
    @return -1,0, or 1 to sort objects    
    **/
    @Override
    public int compareTo(Publication other){
        //genre and then title
        if(genre.compareTo(other.genre) != 0){
            return genre.compareTo(other.genre);
        } else {
            return title.compareTo(other.title);
        }
    }
    
}

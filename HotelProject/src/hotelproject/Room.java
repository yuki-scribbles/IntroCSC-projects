package hotelproject;
import java.util.Collections;

public class Room implements Comparable <Room> {
    protected int number;
    protected double price;
    
    public Room(int number, double price){
        this.number = number;
        this.price = price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void getRoomInfo(){
        System.out.printf("");
    }
    
    public double getPrice(){
        return price;
    }
    
    public int compareTo(Room other){
        return Double.compare(price,other.price);
    }
    
}

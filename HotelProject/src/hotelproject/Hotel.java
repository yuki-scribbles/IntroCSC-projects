package hotelproject;

import java.util.ArrayList;
import java.util.Collections;

public class Hotel implements Comparable<Hotel>{
    private String name;
    private int stars;
    private double rating;
    private double averageRoomPrice;
    ArrayList<Room> Rooms = new ArrayList<>();
    
    public void addRoom(Room r){
       Rooms.add(r);
    }
    
    public void listRooms(){
        Collections.sort(Rooms);
        for (Room r: Rooms){
            r.getRoomInfo();        
        }
    }
    
    public double getAverageRoomPrice(){
        double sum = 0;
        for (Room r: Rooms){
            sum += r.getPrice();
        }
        averageRoomPrice = sum/Rooms.size();
        return averageRoomPrice;
    }
    
    public int compareTo(Hotel other){
        if (Double.compare(getAverageRoomPrice(),other.getAverageRoomPrice()) != 0){
            return Double.compare(other.getAverageRoomPrice(), getAverageRoomPrice());
        } else {
            return Double.compare(other.getRating(), getRating());
        }
    }
    
    public Hotel(String name, int stars){
        this.name = name;
        this.stars = stars;
    }
    
    public String getName(){
        return name;
    }
    
    public int getStars(){
        return stars;
    }
    
    public void setRating(double rating){
        this.rating = rating;
    }
    public double getRating(){
        return rating;
    }
    
    public void setRoomPrice(double price){
        this.averageRoomPrice = price;
    }
    
    
    public void printInfo(){
        System.out.println(name + "  \tavg: " + averageRoomPrice + "\t" + stars 
                           + " stars\t\t" + rating + " rating");
    }
    
}

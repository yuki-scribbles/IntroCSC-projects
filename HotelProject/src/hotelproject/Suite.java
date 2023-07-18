package hotelproject;

public class Suite extends Room {
    private int numRooms;
    private boolean kitchen;
    
    public Suite(int number, double price, int numRooms, boolean kitchen){
        super(number, price);
        this.numRooms = numRooms;
        this.kitchen = kitchen;
    }
    
    public void getRoomInfo(){
        System.out.printf("Suite %d\t$%.2f \t%d rooms\t\t%s\n", 
                        number, price, numRooms, kitchen ? "Smoking" : "Non-smoking");
    }
}

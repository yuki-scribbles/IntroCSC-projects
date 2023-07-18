//Student Name: Trina Dang
//LSU ID: 899459534

package cakeshop;
public class Cake implements Comparable<Cake>{
    //instance variables
    private String flavor;
    private int tiers;
    private double price;
    
    //constructor of Cake with attributes flavor, tiers, and price
    public Cake(String flavor, int tiers, double price ){
        this.flavor = flavor;
        this.tiers = tiers;
        this.price = price;
    }
    //method to set price
    public void setPrice(double Price){
        price = Price;
    }
    
    //method to print details of the cake
    public void printCard(){
        System.out.printf("A %d tier %s cake\t\t$%.2f\n",tiers, flavor, price);
    }
    
    //method to compare the cakes, first by flavor and then price
    public int compareTo(Cake other){
        if(flavor.compareTo(other.flavor)!=0){
            return flavor.compareTo(other.flavor);
        } else {
            return Double.compare(price, other.price);
        }
    }
}

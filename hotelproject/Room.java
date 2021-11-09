//Name: Lillian Moreau
//Submission Time: 5:50

package hotelproject;

public class Room implements Comparable<Room>{
    protected int roomNo;
    protected double price;
    
    public Room(int roomNumber, double roomPrice){
        roomNo = roomNumber;
        price = roomPrice;
    }
    
    public void setPrice(double roomPrice){
        price = roomPrice;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getRoomInfo(){
        return "";
    }
   
    public int compareTo(Room other){
        return Double.compare(price,other.price);
    }
}

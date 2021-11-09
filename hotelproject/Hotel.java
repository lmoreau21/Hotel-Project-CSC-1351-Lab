//Name: Lillian Moreau
//Submission Time: 5:50

package hotelproject;
import java.util.ArrayList;
import java.util.Collections;

public class Hotel implements Comparable<Hotel>{
    private String name;
    private int stars;
    private double googleRating;
    private double averageRoomPrice;
    
    ArrayList<Room> rooms = new ArrayList<>();
   
    public Hotel(String hotelName, int hotelStars){
        name = hotelName;
        stars = hotelStars;
        
    }
    public void setGoogleRating(double hotelGoogleRating){
        googleRating = hotelGoogleRating;
    }
    public double getAverageRoomPrice(){
        double sum = 0;
        int count = 0;
        for(Room room: rooms){
            sum += room.getPrice();
            count++;
        }
        averageRoomPrice = sum/count;
        return sum/count;
    }
    public void listRooms(){
        Collections.sort(rooms);
        for(Room r: rooms){
            System.out.print(r.getRoomInfo());
        }
    }
    public void addRoom(Room r){
        rooms.add(r);
    }
    public String getInfo(){
        return String.format("%-16s%s%.2f%10d stars%13.2f google stars", name, "$", averageRoomPrice, stars, googleRating);
    }
    public int compareTo(Hotel other){
        if(Double.compare(averageRoomPrice,other.averageRoomPrice)!=0)
            return Double.compare(averageRoomPrice,other.averageRoomPrice);
        else if(Integer.compare(stars,other.stars)!=0)
            return -1 * Integer.compare(stars,other.stars);
        else
            return -1 * Double.compare(googleRating, other.googleRating);
    }
    
    
}

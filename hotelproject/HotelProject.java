//Name: Lillian Moreau
//Submission Time: 5:50

package hotelproject;

import java.util.ArrayList;
import java.util.Collections;

public class HotelProject {

    public static void main(String[] args) {
        
        ArrayList<Hotel> hotels = new ArrayList<>();         
        
        Hotel h1 = new Hotel("Hilton", 5);
        h1.setGoogleRating(4.1);
        
        h1.rooms.add(new SingleRoom(101, 122.5, "Queen", true)); 
        h1.rooms.add(new SingleRoom(102, 180.99, "King", true)); 
        h1.rooms.add(new SingleRoom(203, 160.0, "Twin", false)); 
        h1.rooms.add(new Suite(601, 400.5, 2, false)); 
        h1.rooms.add(new Suite(602, 600.5, 3, true)); 
        h1.getAverageRoomPrice();
        
        Hotel h2 = new Hotel("Marriott", 4);
        h2.setGoogleRating(4.5);
        
        h2.rooms.add(new SingleRoom(1001, 350, "Queen", false));
        h2.rooms.add(new SingleRoom(1002, 377, "King", true)); 
        h2.rooms.add(new Suite(3304, 1001, 2, true)); 
        h2.rooms.add(new Suite(4304, 1500, 4, true)); 
        h2.getAverageRoomPrice();
        
        hotels.add(h1);
        hotels.add(h2);

        Collections.sort(hotels);
        
        System.out.println("-----------------------------------------------------------------");
        for(Hotel h: hotels)
        {
            System.out.println(h.getInfo());
            System.out.println("-----------------------------------------------------------------");
            h.listRooms();
            System.out.println("-----------------------------------------------------------------");
        
        }
        
    }
    
}

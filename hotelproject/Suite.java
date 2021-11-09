//Name: Lillian Moreau
//Submission Time: 5:50

package hotelproject;

public class Suite extends Room{
    private int numRoom;
    private boolean hasKitchen;
    public Suite(int roomNo, double price, int numberOfRooms, boolean roomHasKitchen){
        super(roomNo, price);
        numRoom = numberOfRooms;
        hasKitchen = roomHasKitchen;
    }
    
    @Override
    public String getRoomInfo(){
        String info = "Suite " + roomNo + "\t$" + price + "\t\t"+ numRoom + "\t\t";
        if(hasKitchen)
            return info + "Kitchen" + "\n";
        else
            return info + "No Kitchen" + "\n";
    }
}


//Name: Lillian Moreau
//Submission Time: 5:50

package hotelproject;

public class SingleRoom extends Room{
    private String bedType;
    private boolean smoking;
    public SingleRoom(int roomNo, double price, String roomBedType, boolean roomSmoking){
        super(roomNo, price);
        bedType = roomBedType;
        smoking = roomSmoking;
    }
    
    @Override
    public String getRoomInfo(){
        String info = "Room " + roomNo + " \t$" + price + "\t\t"+ bedType + "\t\t";
        if(smoking)
            return info + "Smoking" + "\n";
        else
            return info + "No Smoking" + "\n";
    }
    
    
}
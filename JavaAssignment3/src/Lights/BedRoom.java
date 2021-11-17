package Lights;
//Child Class 2

/* Inherits properties from HomeParent */
public class BedRoom extends HomeParent{
    static String ownerName;
    //String roomName = "Bedroom";
    BedRoom(String ownerName,int noOfLights,String roomName ){

        super(noOfLights,roomName);
        this.ownerName = ownerName;
    }

    public static void main(String[] args) {

        BedRoom bedroom1 = new BedRoom("Harry",5,"Bed Room");
        System.out.println("Owner Name :" + bedroom1.ownerName );
        bedroom1.printNoOfLights();
        BedRoom bedroom2 = new BedRoom("Neville",3,"Bed Room");
        System.out.println("Owner Name :" + bedroom2.ownerName );
        bedroom1.printNoOfLights();


    }


}

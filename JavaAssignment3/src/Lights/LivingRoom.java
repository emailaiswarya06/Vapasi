package Lights;
//Child Class 1

/* Inherits properties from HomeParent */
public class LivingRoom extends HomeParent{
     static String ownerName;
    LivingRoom(String ownerName,int noOfLights,String roomName ){

        super(noOfLights,roomName);
        this.ownerName = ownerName;
    }

    public static void main(String[] args) {

        LivingRoom living1 = new LivingRoom("Ron",20,"Living Room");
        System.out.println("Owner Name :" + living1.ownerName );
        living1.printNoOfLights();
        LivingRoom living2 = new LivingRoom("Hermoine",10,"Living Room");
        System.out.println("Owner Name :" + living1.ownerName );
        living1.printNoOfLights();

    }
}

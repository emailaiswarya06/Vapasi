package Lights;
// HomeParent > BedRoom > StudyRoom

/* Inherits properties from HomeParent
    Suppressed the method in super class
*
* */
public class StudyRoom extends BedRoom {
    StudyRoom(String ownerName, int noOfLights, String roomName) {
        super(ownerName, noOfLights, roomName);
        //this.ownerName = ownerName;
    }

    void printNoOfLights(){
        System.out.println("Suppress the super class method and inside child method");
        System.out.println("No of Lights in "+roomName+" = "+noOfLights);

    }

    public static void main(String[] args) {
        StudyRoom studyRoom1 = new StudyRoom("Dumbledore",25,"Special Study Room");
        System.out.println("Owner Name :" + studyRoom1.ownerName );
        studyRoom1.printNoOfLights();
    }
}

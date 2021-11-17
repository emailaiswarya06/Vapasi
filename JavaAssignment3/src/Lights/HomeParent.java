package Lights;
/* Parent class - contains variables and methods for printing no of lights*/
/*
        Inheritance -
        1. Hierarchical inheritance
        Parent class = HomeParent.java
        Child 1      = LivingRoom.java
        Child 2      = Bedroom.java

        2. MultiLevel Inheritance
        Parent class = HomeParent.java
        Child 1      = Bedroom.java
            SubChild 1 = StudyRoom.java
 */

public class HomeParent {

     static int noOfLights;
     static String roomName;

    public HomeParent(int noOfLights,String roomName){
        this.noOfLights=noOfLights;
        this.roomName =roomName;
    }


     void printNoOfLights(){
        System.out.println("No of Lights in "+roomName+" = "+noOfLights);

    }

}


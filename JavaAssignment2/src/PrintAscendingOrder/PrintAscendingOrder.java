package PrintAscendingOrder;

import java.util.Scanner;


public class PrintAscendingOrder {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number ");
        int number= sc.nextInt();
        AscendingApplication asc = new AscendingApplication(number);
        System.out.println();
        asc.insertNumberIntoArray();


        asc.sortArray();
        System.out.println("Ordered Number : ");
        asc.printArray();
    }


}



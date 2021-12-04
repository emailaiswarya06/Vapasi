import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {

        /*Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Array Length ");
        int arrayLength= sc.nextInt();
        int[] array = new int[arrayLength];*/
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //InsertData(array);
        AddData(array);


    }
    static void InsertData(int[] arr){

    }

    static void AddData(int[] arr) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }
}

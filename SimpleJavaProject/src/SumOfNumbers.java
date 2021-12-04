import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number ");
        int number= sc.nextInt();
        //int number =100;
        int  sum = 0;

        for(int i = 1; i <= number; i++)
        {

            sum = sum + i;
        }

        System.out.println("Sum of numbers first " +number+" numbers = " + sum);
    }
}


import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to add 2 or 3");
        int numberCheck = sc.nextInt();

        if (numberCheck < 2 || numberCheck > 3) {
            System.out.print("Enter 2 or 3 ");
        } else {
            System.out.print("Enter the Number 1 ");
            int num1 = sc.nextInt();
            System.out.print("Enter the Number 2 ");
            int num2 = sc.nextInt();
            if(numberCheck==3){
            System.out.print("Enter the Number 3 ");
            int num3 = sc.nextInt();
            int sum2 = add(num1, num2, num3);
            System.out.println("Sum of two three : " + sum2);
            }
            if(numberCheck==2){
            int sum1 = add(num1, num2);
            System.out.println("Sum of two numbers : " + sum1);}

        }
    }
    static int add(int num1,int num2){
        return num1+num2;
    }
    static int add(int num1,int num2,int num3) {
        return num1+num2+num3;
    }
}



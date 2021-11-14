/*
        Java Assignment 2
Assignment : Program should take continuous input on what operation to perform from user.
             Should take inputs required for operation and print output at every operation.
 */

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double operand1,operand2,output;
        String str="Y";
        char operator,flag ='Y';
        Scanner reader = new Scanner(System.in);

        while(str.length()==1 && (flag =='Y'|| flag =='y')){


            System.out.print("Enter two numbers: ");
            operand1 = reader.nextDouble();
            operand2 = reader.nextDouble();
            //Get the operator input from user
            System.out.print("Enter an operator (+, -, *, /): ");
            operator = reader.next().charAt(0);
            //handling proper operator input
            if(operator=='+' || operator=='-'|| operator=='*'|| operator=='/') {
                output = Calculate(operator,operand1,operand2);
                System.out.println(" The calculated output of " + operand1 + " " + operator + " " + operand2 + " = " + output);
            }
            else {
                System.out.println("Enter correct operator (+, -, *, /)");
            }
            System.out.print("Do you Still want to calculate : Press 'Y' to continue or 'N' to exit");
            str = reader.next();
            flag = str.charAt(0);
        }

        if ((str.length()==1) && (flag =='n'|| flag == 'N')) {
            System.out.println("Thank You! You have Exited the calculator program");
        }else {
            //handling valid input to continue or exit the program
            if (str.length()!=1 ||flag !='Y'|| flag != 'y' ){
                System.out.println("Enter a valid input 'Y' to continue or 'N' to exit");
            }
        }


    }

    static double Calculate( char operator, double operand1,double operand2){
        double output;

        switch(operator) {
            case '+': output = operand1 + operand2;
                break;
            case '-': output = operand1 - operand2;
                break;
            case '*': output = operand1 * operand2;
                break;
            case '/': output = operand1 / operand2;
                break;
            default:
                return 0;
        }

        //System.out.println(" The calculated output of " +operand1 + " "+operator + " " +operand2+ " = "+output);
        return output;
    }
}

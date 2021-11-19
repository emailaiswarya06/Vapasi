package Polymorphism;
/*  Method Overloading - same method name and different signatures to achieve code readability
    Objective : Find largest of two or three numbers

 */

public class LargestOfNumbers {
    int max, temp;
    double maxDouble;

    public static void main(String[] args) {

        LargestOfNumbers obj = new LargestOfNumbers();
        System.out.println("Largest of two number : Integers = " + obj.largestNumber(10, 20));
        System.out.println("Largest of three number : Integers = " + obj.largestNumber(10, 90, 16));
        System.out.println("Largest of two number : Double = " + obj.largestNumber(99.9, 10.8));
    }

    int largestNumber(int number1, int number2) {

        max = number1 > number2 ? number1 : number2;
        return max;

    }

    int largestNumber(int number1, int number2, int number3) {

        temp = number1 > number2 ? number1 : number2;
        max = temp > number3 ? temp : number3;
        return max;

    }

    double largestNumber(double number1, double number2) {

        maxDouble = (number1 > number2 ? number1 : number2);
        return maxDouble;
    }
}
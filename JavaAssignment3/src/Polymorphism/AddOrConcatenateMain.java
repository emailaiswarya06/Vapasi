package Polymorphism;

/* Method overriding - same method name and signature
        SubClass will have a specific implementation of the same method in parent/super class

      Super/Parent class - Adder method - to add two numbers
      Sub/Child class - Adder method - to concatenate the numbers as a single number
      Parent and child should have a IS-A relationship (Inheritance)

 */

public class AddOrConcatenateMain {

    int adder(int number1,int number2){

        return (number1+number2);
    }

}

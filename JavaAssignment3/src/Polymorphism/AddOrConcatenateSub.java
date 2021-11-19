package Polymorphism;

/*
If Parent type reference referes to parent object , parent methos is called
If Parent type reference referes to child object , child method is called
Sub Class contains adder method to Concatenate the numbers
*/

public class AddOrConcatenateSub extends AddOrConcatenateMain {

    int adder(int number1,int number2){

        String numberToStr1,numberToStr2;
        numberToStr1 = Integer.toString(number1);
        numberToStr2 = Integer.toString(number2);
        System.out.println("The Concatenation of two numbers : "+(numberToStr1+numberToStr2) );
        return 0;
    }

    public static void main(String[] args) {

        AddOrConcatenateMain obj1 = new AddOrConcatenateMain();
        System.out.println("Addition of two numbers : "+obj1.adder(2,3));
        AddOrConcatenateMain obj2 = new AddOrConcatenateSub();
        obj2.adder(2,3);
    }
}

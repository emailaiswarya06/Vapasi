package org.vapasi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int num1=10;
        int num2=20;
        System.out.println( "Hello World!" );
        add(num1,num2);

    }
     static void add(int num1, int num2) {
         System.out.println("Total : "+ (num1+num2));
    }
}

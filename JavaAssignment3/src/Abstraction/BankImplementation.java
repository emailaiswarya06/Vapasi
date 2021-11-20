package Abstraction;

public class BankImplementation {

    public static void main(String[] args) {
        //Bank of America
        BankOfAmerica boa = new BankOfAmerica(1,2,1,10,1);
        boa.bankDetails();
        System.out.println("Total value denomination for deposit = $ "+boa.implementDenomination());

        //Capital One
        CapitalOne capitalOne = new CapitalOne(100,20,0,0,0);
        capitalOne.bankDetails();
        System.out.println("Total value denomination for deposit = $ "+capitalOne.implementDenomination());

        //Wells Fargo
        WellsFargo wellsFargo = new WellsFargo(0,50,1,7,8);
        wellsFargo.bankDetails();
        System.out.println("Total value denomination for deposit = $ "+wellsFargo.implementDenomination());


    }




}

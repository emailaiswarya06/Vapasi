package Abstraction;

public class CapitalOne extends Bank{
    private int valueHundred,valueFifty,valueTwenty,valueTen,valueOne;
    private int depositAmount;

    CapitalOne(int valueHundred, int valueFifty, int valueTwenty, int valueTen, int valueOne){

        this.valueHundred = valueHundred;
        this.valueFifty = valueFifty;
        this.valueTwenty = valueTwenty;
        this.valueTen = valueTen;
        this.valueOne = valueOne;
    }


    @Override
    void bankDetails() {
        System.out.println("Denomination for Capital One having SWIFT Code : NFBKUSF1XXX");
    }

    @Override
    int implementDenomination() {
        depositAmount = (this.valueHundred*100)+(this.valueFifty*50)+(this.valueTwenty*20)+(this.valueTen*10)+(this.valueOne*1);
        return depositAmount;
    }

}


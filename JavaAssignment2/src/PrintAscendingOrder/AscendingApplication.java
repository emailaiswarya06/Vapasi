package PrintAscendingOrder;

import java.io.OptionalDataException;

class AscendingApplication {

     int inputNumber;
     int arrLength;
     int array[];


     AscendingApplication(int number) {
         this.inputNumber = number;

         //get the length of the number
         arrLength = Integer.toString(inputNumber).length();

         //initialize the array
         int[] array = new int[arrLength];
         this.array = array;

     }

         // store the integer number into array
          void insertNumberIntoArray(){

             for(int i=0;i<array.length;i++){

                 array[i]= inputNumber %10;
                 inputNumber = inputNumber /10;
             }
     }
        //print an array
        void printArray(){
            for(int i=0;i<array.length;i++){

                System.out.print(array[i]);
            }

        }
        //sort the number in increasing order of digits
        void sortArray(){

            int temp=0;
            for (int i = 0; i < array.length; i++)
            {
                for (int j = i + 1; j < array.length; j++)
                {
                    if (array[i] > array[j])
                    {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

        }


    }



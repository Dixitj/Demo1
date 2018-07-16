package com.example.dixitjain.myapplication;



import java.util.ArrayList;
import java.util.Collections;


public abstract class CollectionofMethods {


// Variable
private static ArrayList<Integer> binaryArray = new ArrayList<>();


// Method to Find Prime NUmber
    public String primeNumberCal ( String value) {

        // Local variable
        int number = Integer.parseInt(value);

        // Logic to Find Prime Number
        if (number <= 1)

            return "Valid Number";

        else {

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {

                    return "Number is not Prime";

                }
            }

            return "Number is Prime";
        }
    }



    int binarySearch(int element){


        // Local Variables
        int i = 0;
        int arraylength = binaryArray.size();


        // Logic to Implement Binary Search
        if (binaryArray.size() != 0) {
            while (i <= arraylength) {

                int middle = (arraylength / 2) ;
                if (element == binaryArray.get(middle)) {

                    return middle;

                } else if (element < binaryArray.get(middle)) {

                    arraylength = middle - 1;

                } else

                    i = middle + 1;

            }
        }

        return  -1 ;

    }



    void  binaryAdd(int element){

        // Logic to Add and sort Array
        binaryArray.add(element);
        Collections.sort(binaryArray);
        System.out.println(binaryArray);

    }

}

package org.lld.utility;

public class DiceUtility {

    public int roll( int noOfDices){

        int sum =0;

        for( int i =0; i < noOfDices; i++){
            sum += (int) (Math.random() * 6)+1;
        }
        return sum;
    }

}

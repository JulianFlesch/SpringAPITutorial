package com.julianflesch.springapitutorial;


public class PiDigit {

    public final int idx;
    public final char  digit;


    /**
     * @param n long integer representing the index of a digit in pi.
     **/
    public PiDigit(int n){
        this.idx  = n;
        this.digit = computePiAt(n);
    }

    public long getIdx(){
        return this.idx;
    }

    public char getDigit(){
        return this.digit;
    }

    /**
     * Returns the i-th digit of pie.
     *
     * @param i integer representing a zero-based index in pi
     * @return the digit in pi at position i or '-' if the index is out of range
     */
    public char computePiAt(int i){
        char digit = '-';

        // use the internal PI constant to retrieve a String with PI digits
        String piStr = String.valueOf(Math.PI);

        // remove the decimal point
        piStr = piStr.substring(0, 1) + piStr.substring(2);


        if (i < piStr.length()) {
            digit = piStr.charAt(i);
        }

        return digit;
    }

}

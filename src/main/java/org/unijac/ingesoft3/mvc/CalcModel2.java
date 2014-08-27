package org.unijac.ingesoft3.mvc;

import java.math.BigInteger;

/**
 * Created by alexhd on 27/08/14.
 */
public class CalcModel2 {
    private static final String INITIAL_VALUE = "0";
    private BigInteger total;


    public CalcModel2() {
        reset();
    }

    public void reset() {
        total = new BigInteger(INITIAL_VALUE);
    }

    public void addTo(String value){
        total = total.add(new BigInteger(value));
    }

    public void subTo(String value){
        total = total.subtract(new BigInteger(value));
    }

    public void divideBy(String value){
        total = total.divide(new BigInteger(value));
    }

    public void multiplyBy(String value){
        total = total.multiply(new BigInteger(value));
    }

    public void setValue(String value){
        total = new BigInteger(value);
    }

    public String getValue(){
        return total.toString();
    }
}

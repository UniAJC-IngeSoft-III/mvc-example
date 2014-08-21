package org.unijac.ingesoft3.mvc;

import java.math.BigInteger;

/**
 * Created by alexhd on 20/08/14.
 */
public class CalcModel {
    private static final String INITIAL_VALUE = "1";
    private BigInteger total;


    public CalcModel() {
        reset();
    }

    public void reset() {
        total = new BigInteger(INITIAL_VALUE);
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

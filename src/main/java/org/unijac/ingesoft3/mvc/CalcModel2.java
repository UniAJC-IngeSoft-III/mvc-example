package org.unijac.ingesoft3.mvc;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Stack;

/**
 * Created by alexhd on 27/08/14.
 */
public class CalcModel2 {
    private static final String INITIAL_VALUE = "0";
    private BigInteger total;
    private BigInteger last;
    private String operation;
    private String error;

    public CalcModel2() {
        reset();
    }

    public void reset() {
        total = new BigInteger(INITIAL_VALUE);
        operation = null;
        last = null;
        error = null;
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

    public void multiplyBy(){
        total = total.multiply(last);
    }

    public void pushOperation(String operation){
        this.operation = operation;
        last = total;
        total = new BigInteger(INITIAL_VALUE);
    }

    public void setValue(String value){
        total = new BigInteger(value);
    }

    public String getValue(){
        return total.toString();
    }

    public void doOperation() throws ArithmeticException{
        if(testOperation()){
            BigInteger result;
            switch (operation){
                case "X":
                    total = last.multiply(total);
                    last = null;
                    operation = null;
                    break;
                case "/":
                    total = last.divide(total);
                    last = null;
                    operation = null;
                    break;
                case "+":
                    total = last.add(total);
                    last = null;
                    operation = null;
                    break;
                case "-":
                    total = last.subtract(total);
                    last = null;
                    operation = null;
                    break;
            }
        }
    }

    public boolean testOperation() {
        return last != null && operation != null;
    }
}

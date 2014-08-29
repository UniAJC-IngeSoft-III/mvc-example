package org.unijac.ingesoft3.mvc;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by alexhd on 27/08/14.
 */
public class CalcModel2 {
    private static final String INITIAL_VALUE = "0";
    private BigDecimal total;
    private BigDecimal last;
    private String operation;

    public CalcModel2() {
        reset();
    }

    public void reset() {
        total = new BigDecimal(INITIAL_VALUE);
        operation = null;
        last = null;
    }

    public void pushOperation(String operation){
        this.operation = operation;
        last = total;
        total = new BigDecimal(INITIAL_VALUE);
    }

    public void setValue(String value){
        total = new BigDecimal(value);
    }

    public String getValue(){
        return total.toString();
    }

    public void doOperation() throws ArithmeticException{
        if(testOperation()){
            BigDecimal result;
            switch (operation){
                case "X":
                    total = last.multiply(total).setScale(2, RoundingMode.HALF_UP);
                    last = null;
                    operation = null;
                    break;
                case "/":
                    total = last.divide(total, 2, RoundingMode.HALF_UP);
                    last = null;
                    operation = null;
                    break;
                case "+":
                    total = last.add(total).setScale(2, RoundingMode.HALF_UP);
                    last = null;
                    operation = null;
                    break;
                case "-":
                    total = last.subtract(total).setScale(2, RoundingMode.HALF_UP);
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

package edu.uniajc.ingesoft3;

import edu.uniajc.ingesoft3.mvc.CalcController2;
import edu.uniajc.ingesoft3.mvc.CalcModel2;
import edu.uniajc.ingesoft3.mvc.CalcView2;

/**
 * Created by alexhd on 8/26/14.
 */
public class App2 {
    public static void main(String[] args) {
        CalcModel2 model = new CalcModel2();
        CalcView2 view = new CalcView2();
        CalcController2 controller = new CalcController2(model, view);

        view.setVisible(true);
    }
}

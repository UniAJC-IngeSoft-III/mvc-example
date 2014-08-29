package edu.uniajc.ingesoft3;

import edu.uniajc.ingesoft3.mvc.CalcController;
import edu.uniajc.ingesoft3.mvc.CalcModel;
import edu.uniajc.ingesoft3.mvc.CalcView;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView(model);
        CalcController controller = new CalcController(model, view);

        view.setVisible(true);
    }
}

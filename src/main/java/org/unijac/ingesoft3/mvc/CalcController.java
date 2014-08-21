package org.unijac.ingesoft3.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alexhd on 20/08/14.
 */
public class CalcController {

    private CalcModel model;
    private CalcView  view;

    public CalcController(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;

        this.view.addMultiplyListener(new MultiplyListener());
        this.view.addClearListener(new ClearListener());
    }

    private class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                userInput = view.getUserInput();
                model.multiplyBy(userInput);
                view.setTotal(model.getValue());

            } catch (NumberFormatException nfex) {
                view.showError("Bad input: '" + userInput + "'");
            }
        }

    }

    private class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.reset();
            view.reset();
        }
    }
}

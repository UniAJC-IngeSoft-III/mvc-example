package org.unijac.ingesoft3.mvc;

import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alexhd on 27/08/14.
 */
public class CalcController2 {
    private final CalcModel2 model;
    private final CalcView2 view;
    private String number = "0";

    public CalcController2(CalcModel2 model, CalcView2 view) {
        this.model = model;
        this.view = view;

        view.setDisplay(model.getValue());
        view.addCalcListener(new CalcListener());
    }

    private class CalcListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)e.getSource();
            String key = button.getText();
            Boolean command = StringUtils.indexOf("0123456789.",key) < 0;

            if(!command){
                if((number + key).matches("[0-9]*|[0-9]+.[0-9]*")){
                    if(number.equals("0"))
                        number = "";
                    number += key;
                }
            }else{
                switch (key){
                    case "C":
                        number = "0";
                        break;
                }
            }

            view.setDisplay(number);
        }
    }
}

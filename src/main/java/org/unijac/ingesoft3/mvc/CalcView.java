package org.unijac.ingesoft3.mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by alexhd on 20/08/14.
 */
public class CalcView extends JFrame {
    private static final String INITIAL_VALUE = "1";

    private JTextField m_userInputTf = new JTextField(5);
    private JTextField m_totalTf = new JTextField(20);
    private JButton m_multiplyBtn = new JButton("Multiply");
    private JButton m_clearBtn = new JButton("Clear");

    private CalcModel model;

    public CalcView(CalcModel model) {
        this.model = model;
        this.model.setValue(INITIAL_VALUE);

        m_totalTf.setText(this.model.getValue());
        m_totalTf.setEditable(false);

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel(("Input")));
        content.add(m_userInputTf);
        content.add(m_multiplyBtn);
        content.add(new JLabel("Total"));
        content.add(m_totalTf);
        content.add(m_clearBtn);

        this.setContentPane(content);
        this.pack();

        this.setTitle("Simple Calc - MVC");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void reset(){
        m_totalTf.setText(INITIAL_VALUE);
    }

    String getUserInput() {
        return m_userInputTf.getText();
    }

    void setTotal(String newTotal){
        m_totalTf.setText(newTotal);
    }

    void showError(String message){
        JOptionPane.showMessageDialog(this, message);
    }

    void addMultiplyListener(ActionListener listener){
        m_multiplyBtn.addActionListener(listener);
    }

    void addClearListener(ActionListener listener){
        m_clearBtn.addActionListener(listener);
    }
}

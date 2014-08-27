package org.unijac.ingesoft3.mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alexhd on 8/26/14.
 */
public class CalcView2 extends JFrame implements ActionListener {
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn6;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn0;
    private JButton btnDot;
    private JButton btnAdd;
    private JButton btnSub;
    private JButton btnDiv;
    private JButton btnMul;
    private JButton btnCls;
    private JButton btnCalc;
    private JTextField textDisplay;

    private JButton createControl(Container content, JButton button, int x, int y, int width, int height){
        GridBagConstraints constraints;
        constraints = new GridBagConstraints();
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        content.add(button, constraints);
        button.addActionListener(this);
        return button;
    }

    public CalcView2() {
        super("Calculadora");
        setSize(300, 180);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        Container content = this.getContentPane();
        content.setLayout(new GridBagLayout());

        textDisplay = new JTextField("");
        textDisplay.setEditable(false);
        GridBagConstraints constraints;
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        content.add(textDisplay, constraints);


        btnCls = createControl(content, new JButton("C"), 3, 0, 1, 1);

        btn7 = createControl(content, new JButton("7"), 0, 1, 1, 1);
        btn8 = createControl(content, new JButton("8"), 1, 1, 1, 1);
        btn9 = createControl(content, new JButton("9"), 2, 1, 1, 1);
        btnDiv = createControl(content, new JButton("/"), 3, 1, 1, 1);

        btn4 = createControl(content, new JButton("4"), 0, 2, 1, 1);
        btn5 = createControl(content, new JButton("5"), 1, 2, 1, 1);
        btn6 = createControl(content, new JButton("6"), 2, 2, 1, 1);
        btnMul = createControl(content, new JButton("X"), 3, 2, 1, 1);

        btn1 = createControl(content, new JButton("1"), 0, 3, 1, 1);
        btn2 = createControl(content, new JButton("2"), 1, 3, 1, 1);
        btn3 = createControl(content, new JButton("3"), 2, 3, 1, 1);
        btnSub = createControl(content, new JButton("-"), 3, 3, 1, 1);

        btn0 = createControl(content, new JButton("0"), 0, 4, 1, 1);
        btnDot = createControl(content, new JButton("."), 1, 4, 1, 1);
        btnCalc = createControl(content, new JButton("="), 2, 4, 1, 1);
        btnAdd = createControl(content, new JButton("+"), 3, 4, 1, 1);
/*
*/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton button = (JButton)e.getSource();
            char key = button.getText().charAt(0);
            String value = "";
            switch (key){
                case 48: value = "zero";
                    break;
                case 49: value = "one";
                    break;
                case 50: value = "two";
                    break;
                case 51: value = "tree";
                    break;
                case 52: value = "four";
                    break;
                case 53: value = "five";
                    break;
                case 54: value = "six";
                    break;
                case 55: value = "seven";
                    break;
                case 56: value = "eight";
                    break;
                case 57: value = "nine";
                    break;
                case 67: value = "clear";
                    break;
                case 88: value = "mul";
                    break;
                case 46: value = "dot";
                    break;
                case 47: value = "div";
                    break;
                case 45: value = "sub";
                    break;
                case 43: value = "sum";
                    break;
                case 61: value = "calc";
                    break;
            }
            textDisplay.setText(value);
        }
    }

}


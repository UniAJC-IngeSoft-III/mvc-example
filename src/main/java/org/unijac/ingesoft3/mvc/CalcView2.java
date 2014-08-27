package org.unijac.ingesoft3.mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by alexhd on 8/26/14.
 */
public class CalcView2 extends JFrame {
    private JTextField textDisplay;

    private JButton createControl(Container content, JButton button, int x, int y, int width, int height){
        GridBagConstraints constraints;
        constraints = new GridBagConstraints();
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        content.add(button, constraints);
        // button.addActionListener(controller);
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

        textDisplay = new JTextField();
        textDisplay.setEditable(false);
        textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        GridBagConstraints constraints;
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        content.add(textDisplay, constraints);


        createControl(content, new JButton("C"), 3, 0, 1, 1);

        createControl(content, new JButton("7"), 0, 1, 1, 1);
        createControl(content, new JButton("8"), 1, 1, 1, 1);
        createControl(content, new JButton("9"), 2, 1, 1, 1);
        createControl(content, new JButton("/"), 3, 1, 1, 1);

        createControl(content, new JButton("4"), 0, 2, 1, 1);
        createControl(content, new JButton("5"), 1, 2, 1, 1);
        createControl(content, new JButton("6"), 2, 2, 1, 1);
        createControl(content, new JButton("X"), 3, 2, 1, 1);

        createControl(content, new JButton("1"), 0, 3, 1, 1);
        createControl(content, new JButton("2"), 1, 3, 1, 1);
        createControl(content, new JButton("3"), 2, 3, 1, 1);
        createControl(content, new JButton("-"), 3, 3, 1, 1);

        createControl(content, new JButton("0"), 0, 4, 1, 1);
        createControl(content, new JButton("."), 1, 4, 1, 1);
        createControl(content, new JButton("="), 2, 4, 1, 1);
        createControl(content, new JButton("+"), 3, 4, 1, 1);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDisplay(String number) {
        textDisplay.setText(number);
    }

    public void addCalcListener(ActionListener action) {
        Container content = this.getContentPane();
        Component[] components = content.getComponents();
        for (Component component : components) {
            if(component instanceof JButton){
                JButton button = (JButton) component;
                button.addActionListener(action);
            }
        }
    }
}


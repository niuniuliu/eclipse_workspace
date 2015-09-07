package org.nitpro.gui2;

import java.awt.*;
import java.awt.event.*;

class MyCalculatorPanel extends Panel implements ActionListener  {

    private TextField display;
    private double arg;
    private String op = "=";
    private boolean start = true;

    public MyCalculatorPanel() {
        setLayout(new BorderLayout());

        display = new TextField("0");
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        Panel p = new Panel();
        p.setLayout(new GridLayout(5, 5));
        p.add(new Label());
        Button button = new Button("退格");// Backspace
        button.addActionListener(this);
        p.add(button);
        p.add(new Label());
        button = new Button("归零");
        button.addActionListener(this);
        p.add(button);
        p.add(new Label());
        String buttons = "789×÷456+-123.=0";
        for(int i = 0; i < buttons.length(); i++) {
            addButton(p, buttons.substring(i, i+1));
        }
        button = new Button("平方根");
        button.addActionListener(this);
        p.add(button);
        button = new Button("倒数");
        button.addActionListener(this);
        p.add(button);
        button = new Button("立方根");
        button.addActionListener(this);
        p.add(button);
        button = new Button("ln(x)");
        button.addActionListener(this);
        p.add(button);

        add(p, BorderLayout.CENTER);
    }

    private void addButton(Container c, String s) {
        Button b = new Button(s);
        c.add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        String s = evt.getActionCommand();
        if('0' <= s.charAt(0) && s.charAt(0) <= '9'
            || s.equals(".")) {
            if(start) display.setText(s);
            else display.setText(display.getText() + s);
            start = false;
        } else if(s.equals("退格")) {
            backspace();
        } else if(s.equals("归零")) {
            reset();
        } else if(s.equals("平方根")) {
            sqrt();
        } else if(s.equals("立方根")) {
            sqrt3();
        } else if(s.equals("倒数")) {
            reciprocal();
        } else if(s.equals("ln(x)")) {
            lnX();
        } else {
            if(start) {
                if(s.equals("-")) {
                    display.setText(s);
                    start = false;
                }
                else op = s;
            } else {
                // Here should use Double.parseDouble(String s) since JDK1.2,
                // but to run on JDK1.x, we backward
                calculate(Double.valueOf(display.getText()).doubleValue());
                op = s;
                start = true;
            }
        }
    }

    // 退格
    void backspace() {
        String text = display.getText();
        if(text.length() == 1) {
            display.setText("0");
        } else {
            display.setText(text.substring(0, text.length() - 1));
        }
    }

    // 归零
    void reset() {
        display.setText("0");
        start = true;
        op = "=";
    }

    // 平方根
    void sqrt() {
        double number = Double.valueOf(display.getText()).doubleValue();
        try {
            arg = Math.sqrt(number);
        } catch(Exception ex) {
            arg = 0;
        }
        display.setText(arg + "");
        start = true;
    }

    // 立方根
    void sqrt3() {
        double number = Double.valueOf(display.getText()).doubleValue();
        try {
            arg = Math.pow(number, 1.0/3);
        } catch(Exception ex) {
            arg = 0;
        }
        display.setText(arg + "");
        start = true;
    }

    // 倒数
    void reciprocal() {
        double number = Double.valueOf(display.getText()).doubleValue();
        try {
            arg = 1.0/number;
        } catch(Exception ex) {
            arg = 0;
        }
        display.setText(arg + "");
        start = true;
    }

    // 自然对数
    void lnX() {
        double number = Double.valueOf(display.getText()).doubleValue();
        try {
            arg = Math.log(number);
        } catch(Exception ex) {
            arg = 0;
        }
        display.setText(arg + "");
        start = true;
    }

    private void calculate(double n) {
        if(op.equals("+")) arg += n;
        else if(op.equals("-")) arg -= n;
        else if(op.equals("×")) arg *= n;
        else if(op.equals("÷")) arg /= n;
        else if(op.equals("=")) arg = n;

        display.setText(arg + "");
    }

}

public class Calculator extends Frame {

    public Calculator() {
        setTitle("简易计算器");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.jpg"));
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        add(new MyCalculatorPanel(), BorderLayout.CENTER);
        pack();
        setResizable(false);
        centerWindow(this);
    }


        /** *//** Center the given window */
      public static final void centerWindow(Window window) {
        if(window == null) return;
        // Center the window
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension windowSize = window.getSize();
        if (windowSize.height > screenSize.height)
          windowSize.height = screenSize.height;
        if (windowSize.width > screenSize.width)
          windowSize.width = screenSize.width;
        window.setLocation((screenSize.width - windowSize.width) / 2,
          (screenSize.height - windowSize.height) / 2);
      }

    public static void main(String[] args) {
        new Calculator().show();
    }
}


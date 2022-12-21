import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static double firstNum ;
    static double secondNum ;
    static double result;
    static String  oparatioin ;
    String answer;

    public static void main(String[] args) {


        // I tried to write this program without OOP and I think it can be usefull for who are new in java and do not know OOP.

        //I will be happy if you say your comment and review for my code






        //defining frame


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750 , 750);
       // frame.setResizable(false);
        frame.setTitle("Calculator");
        frame.getContentPane().setBackground(new Color(0x05373B));

        //dfining label

        JLabel label = new JLabel();
        frame.add(label);
        Border border = BorderFactory.createLineBorder(new Color(0x150101));
        label.setBorder(border);

        //dfining buttons and radiobuttons

        JRadioButton radioButton1 = new JRadioButton();
        JRadioButton radioButton2 = new JRadioButton();
        JButton btn1 = new JButton();
        JButton btn2 = new JButton();
        JButton btn3 = new JButton();
        JButton btn4 = new JButton();
        JButton btn5 = new JButton();
        JButton btn6 = new JButton();
        JButton btn7 = new JButton();
        JButton btn8 = new JButton();
        JButton btn9 = new JButton();
        JButton btn0 = new JButton();
        JButton btnEqual = new JButton();
        JButton btnDelete = new JButton();
        JButton btnClear = new JButton();
        JButton btnSum = new JButton();
        JButton btnMines = new JButton();
        JButton btnDivide = new JButton();
        JButton btnDot = new JButton();
        JButton btnMultiplication = new JButton();
        JButton btnNegative = new JButton();


        // adding buttons to frame

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn0);
        frame.add(btnEqual);
        frame.add(btnDelete);
        frame.add(btnClear);
        frame.add(btnSum);
        frame.add(btnMines);
        frame.add(btnDivide);
        frame.add(btnMultiplication);
        frame.add(btnNegative);
        frame.add(btnDot);
        frame.add(radioButton1);
        frame.add(radioButton2);


        //doing more things on buttons ( like setting bounds and setting text)


        btn1.setBounds(200 ,300, 60, 60);
        btn2.setBounds(300 ,300, 60, 60);
        btn3.setBounds(400 ,300, 60, 60);
        btn4.setBounds(200 ,400, 60, 60);
        btn5.setBounds(300 ,400, 60, 60);
        btn6.setBounds(400 ,400, 60, 60);
        btn7.setBounds(200 ,500, 60, 60);
        btn8.setBounds(300 ,500, 60, 60);
        btn9.setBounds(400 ,500, 60, 60);
        btn0.setBounds(300 ,200, 60, 60);
        btnEqual.setBounds(300 ,600, 60, 60);
        btnDelete.setBounds(400 ,600, 60, 60);
        btnClear.setBounds(200 ,600, 60, 60);
        btnSum.setBounds(500 ,400, 60, 60);
        btnMines.setBounds(500 ,500, 60, 60);
        btnDivide.setBounds(500 ,600, 60, 60);
        btnMultiplication.setBounds(500 ,300, 60, 60);
        btnNegative.setBounds(400 ,200, 60, 60);
        radioButton1.setBounds(200 ,200, 60, 60);
        radioButton2.setBounds(500 ,200, 60, 60);
        btnDot.setBounds(100 ,400, 60, 60);

        btn1.setText("1");
        btn2.setText("2");
        btn3.setText("3");
        btn4.setText("4");
        btn5.setText("5");
        btn6.setText("6");
        btn7.setText("7");
        btn8.setText("8");
        btn9.setText("9");
        btn0.setText("0");
        btnEqual.setText("=");
        btnDelete.setText("D"); // delete
        btnClear.setText("C"); // clear
        btnSum.setText("+");
        btnMines.setText("-");
        btnDivide.setText("/");
        btnMultiplication.setText("*");
        btnNegative.setText("(-)");
        btnDot.setText(".");
        radioButton1.setText("Sin");
        radioButton2.setText("Cos");

        ButtonGroup buttonGroup = new ButtonGroup();

        frame.setLayout(null);

        btn1.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btn2.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btn3.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btn4.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btn5.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btn6.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btn7.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btn8.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btn9.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btn0.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btnEqual.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btnDelete.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btnClear.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btnSum.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btnMines.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btnDivide.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btnDot.setFont(new Font("Segoe Print" , Font.BOLD , 30));
        btnMultiplication.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        btnNegative.setFont(new Font("Segoe Print" , Font.BOLD , 15));
        radioButton1.setFont(new Font("Segoe Print" , Font.BOLD , 10));
        radioButton2.setFont(new Font("Segoe Print" , Font.BOLD , 10));

        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        btnSum.setForeground(new Color(0x1922F1));
        btnMines.setForeground(new Color(0x1922F1));
        btnDivide.setForeground(new Color(0x1922F1));
        btnMultiplication.setForeground(new Color(0x1922F1));
        btnClear.setForeground(new Color(0xFF0000));
        btnDelete.setForeground(new Color(0xFF0000));
        btnEqual.setForeground(new Color(0x0DBE29));
        btnNegative.setForeground(new Color(0xAF02E0));
        radioButton1.setBackground(new Color(0x9D697C));
        radioButton2.setBackground(new Color(0x9D697C));
        btnDot.setForeground(new Color(0x020101));


        // I can use Jpanel too


        //defining textfields and adding and buttons unfocusing


        JTextField textField = new JTextField();
        frame.add(textField);
        textField.setBounds(0,0, 750, 180);
        textField.setBackground(new Color(0x4797F5));
        textField.setFont(new Font("Ink Free" , Font.ITALIC , 35));
        textField.setEditable(false);

        btn1.setFocusable(false);
        btn2.setFocusable(false);
        btn3.setFocusable(false);
        btn4.setFocusable(false);
        btn5.setFocusable(false);
        btn6.setFocusable(false);
        btn7.setFocusable(false);
        btn8.setFocusable(false);
        btn9.setFocusable(false);
        btnEqual.setFocusable(false);
        btnDelete.setFocusable(false);
        btnClear.setFocusable(false);
        btnDivide.setFocusable(false);
        btnSum.setFocusable(false);
        btnMines.setFocusable(false);
        btnMultiplication.setFocusable(false);
        btnNegative.setFocusable(false);
        btnDot.setFocusable(false);
        radioButton1.setFocusable(false);
        radioButton2.setFocusable(false);
        btn0.setFocusable(false);








        //defining action listening for buttons




        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn1.getText();
                textField.setText(EnterNumber);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn2.getText();
                textField.setText(EnterNumber);

            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    String EnterNumber = textField.getText() + btn3.getText();
                    textField.setText(EnterNumber);
                }
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    String EnterNumber = textField.getText() + btn4.getText();
                    textField.setText(EnterNumber);
                }
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    String EnterNumber = textField.getText() + btn5.getText();
                    textField.setText(EnterNumber);
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    String EnterNumber = textField.getText() + btn6.getText();
                    textField.setText(EnterNumber);
                }
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    String EnterNumber = textField.getText() + btn7.getText();
                    textField.setText(EnterNumber);
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {

                    String EnterNumber = textField.getText() + btn8.getText();
                    textField.setText(EnterNumber);
                }
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    String EnterNumber = textField.getText() + btn9.getText();
                    textField.setText(EnterNumber);
                }
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    String EnterNumber = textField.getText() + btn0.getText();
                    textField.setText(EnterNumber);
                }
            }
        });
        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    firstNum = Double.parseDouble(textField.getText());
                    textField.setText("");
                    oparatioin = "+";


                }
            }
        });
        btnMines.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    firstNum = Double.parseDouble(textField.getText());
                    textField.setText("");
                    oparatioin = "-";



                }
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    firstNum = Double.parseDouble(textField.getText());
                    textField.setText("");
                    oparatioin = "/";


                }
            }
        });
        btnMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    firstNum = Double.parseDouble(textField.getText());
                    textField.setText("");
                    oparatioin = "*";


                }
            }
        });



        btnNegative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {

                    int M = Integer.parseInt(textField.getText());
                    textField.setText(String.valueOf(M * -1));

                }
            }
        });

        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == radioButton1)
                {
                    double M = Integer.parseInt(textField.getText());
                    textField.setText(String.valueOf(trianglesMath1(M)));
                    radioButton2.setEnabled(false);
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnClear)
                {
                    textField.setText("");
                    radioButton1.setEnabled(false);
                    radioButton1.setEnabled(true);
                    radioButton2.setEnabled(false);
                    radioButton2.setEnabled(true);


                }
            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String EnterNumber = textField.getText() + btnDot.getText();
                textField.setText(EnterNumber);

            }
        });

        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {

                    String answer;
                    secondNum = Double.parseDouble(textField.getText());
                    if ( oparatioin == "+")
                    {
                        result = firstNum + secondNum;
                        answer = String.valueOf(result);
                        textField.setText(answer);
                    }
                    else if (oparatioin == "-")

                    {
                        result = firstNum - secondNum;
                        answer = String.valueOf(result);
                        textField.setText(answer);
                    }
                    else if (oparatioin == "/")

                    {
                        result = firstNum / secondNum;
                        answer = String.valueOf(result);
                        textField.setText(answer);
                    }
                    else if (oparatioin == "*")

                    {
                        result = firstNum * secondNum;
                        answer = String.valueOf(result);
                        textField.setText(answer);
                    }



                }
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == radioButton2)
                {
                    double M = Integer.parseInt(textField.getText());
                    textField.setText(String.valueOf(trianglesMath2(M)));
                    radioButton1.setEnabled(false);
                }
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String delete = null;
                if (textField.getText().length() > 0)
                {
                    StringBuilder stringBuilder = new StringBuilder(textField.getText());
                    stringBuilder.deleteCharAt(textField.getText().length() - 1);
                    delete = stringBuilder.toString();
                    textField.setText(delete);
                }
            }
        });
















    }




    //  Methods for defining sin and cos ( for radians )
    // I write without java own sin and cos methods


    public static double trianglesMath1 ( double X){
        double SinX;
        //deegree to radian
        double X1 = 180 / X;
        double degree = 3.14 / X1;
        double sum = 0;
        int i = 1; // index of loop
        int j = 0;// index of array
        double pow = 1;
        double fact = 1;
        double[] a = new double[50];
        while (i <= 50) {
            pow = degree * pow;
            fact = i * fact;
            a[j] = pow / fact;
            i++;
            pow = degree * pow;
            fact = fact * i;
            j++;
            i++;
        }
        j = 0;
        while (j < 50) {
            double M = a[j] - a[j + 1];
            sum = sum + M;
            j = j + 2;
        }
        return sum;

    }
    public static double trianglesMath2 ( double X){
        double CosX;
        //deegree to radian
        double X1 = 180 / X;
        double degree = 3.14 / X1;
        double sum = 1;
        int i = 2; // index of loop
        int j = 0;// index of array
        double pow = 1;
        double fact = 1;
        pow = degree * pow;
        double[] a = new double[55];
        while (i <= 52) {
            pow = degree * pow;
            fact = i * fact;
            a[j] = pow / fact;
            i++;
            pow = degree * pow;
            fact = fact * i;
            j++;
            i++;
        }
        j = 0;
        while (j < 50) {
            double M = a[j] - a[j + 1];
            sum = sum - M;
            j = j + 2;
        }
        return sum;
    }


}
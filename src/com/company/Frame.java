package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.Color;
public class Frame extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    public int turn;
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    public Frame() {
        JFrame frame = new JFrame();
        frame.setTitle("Tic-Tac-Toe");
        // creating buttons and initializing them to their position in the 3x3 for tictactoe


        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        //setting up frame settings
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(150,150,150));
        textfield.setForeground(new Color(135,206,250));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        int SWidth= frame.getWidth();
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,SWidth,2000);

        title_panel.add(textfield);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);

        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(200,200,200));
        button_panel.add(button1);
        button_panel.add(button2);
        button_panel.add(button3);
        button_panel.add(button4);
        button_panel.add(button5);
        button_panel.add(button6);
        button_panel.add(button7);
        button_panel.add(button8);
        button_panel.add(button9);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        //Creating X and O for


        //count is just a random variable so that the for loop can work
    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == button1 && turn % 2 == 0 && !((button1.getText().equals("X")) || (button1.getText().equals("O")))) {
            button1.setText("X");
            button1.setBackground(new Color(206, 85, 219));
            button1.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button1 && turn % 2 == 1 && !((button1.getText().equals("X")) || (button1.getText().equals("O")))) {
            button1.setText("O");
            button1.setBackground(new Color(249, 242, 57));
            button1.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button2 && turn % 2 == 0 && !((button2.getText().equals("X")) || (button2.getText().equals("O")))) {
            button2.setText("X");
            button2.setBackground(new Color(206, 85, 219));
            button2.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button2 && turn % 2 == 1 && !((button2.getText().equals("X")) || (button2.getText().equals("O")))) {
            button2.setText("O");
            button2.setBackground(new Color(249, 242, 57));
            button2.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button3 && turn % 2 == 0 && !((button3.getText().equals("X")) || (button3.getText().equals("O")))) {
            button3.setText("X");
            button3.setBackground(new Color(206, 85, 219));
            button3.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button3 && turn % 2 == 1 && !((button3.getText().equals("X")) || (button3.getText().equals("O")))) {
            button3.setText("O");
            button3.setBackground(new Color(249, 242, 57));
            button3.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button4 && turn % 2 == 0 && !((button4.getText().equals("X")) || (button4.getText().equals("O")))) {
            button4.setText("X");
            button4.setBackground(new Color(206, 85, 219));
            button4.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button4 && turn % 2 == 1 && !((button4.getText().equals("X")) || (button4.getText().equals("O")))) {
            button4.setText("O");
            button4.setBackground(new Color(249, 242, 57));
            button4.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button5 && turn % 2 == 0 && !((button5.getText().equals("X")) || (button5.getText().equals("O")))) {
            button5.setText("X");
            button5.setBackground(new Color(206, 85, 219));
            button5.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button5 && turn % 2 == 1 && !((button5.getText().equals("X")) || (button5.getText().equals("O")))) {
            button5.setText("O");
            button5.setBackground(new Color(249, 242, 57));
            button5.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button6 && turn % 2 == 0 && !((button6.getText().equals("X")) || (button6.getText().equals("O")))) {
            button6.setText("X");
            button6.setBackground(new Color(206, 85, 219));
            button6.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button6 && turn % 2 == 1 && !((button6.getText().equals("X")) || (button6.getText().equals("O")))) {
            button6.setText("O");
            button6.setBackground(new Color(249, 242, 57));
            button6.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button7 && turn % 2 == 0 && !((button7.getText().equals("X")) || (button7.getText().equals("O")))) {
            button7.setText("X");
            button7.setBackground(new Color(206, 85, 219));
            button7.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button7 && turn % 2 == 1 && !((button7.getText().equals("X")) || (button7.getText().equals("O")))) {
            button7.setText("O");
            button7.setBackground(new Color(249, 242, 57));
            button7.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button8 && turn % 2 == 0 && !((button8.getText().equals("X")) || (button8.getText().equals("O")))) {
            button8.setText("X");
            button8.setBackground(new Color(206, 85, 219));
            button8.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button8 && turn % 2 == 1 && !((button8.getText().equals("X")) || (button8.getText().equals("O")))) {
            button8.setText("O");
            button8.setBackground(new Color(249, 242, 57));
            button8.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button9 && turn % 2 == 0 && !((button9.getText().equals("X")) || (button9.getText().equals("O")))) {
            button9.setText("X");
            button9.setBackground(new Color(206, 85, 219));
            button9.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        } else if (e.getSource() == button9 && turn % 2 == 1 && !((button9.getText().equals("X")) || (button9.getText().equals("O")))) {
            button9.setText("O");
            button9.setBackground(new Color(249, 242, 57));
            button9.setFont(new Font("Impact",Font.BOLD,80));
            turn++;
            gameWon();
        }
    }
    public void gameWon() {
        if ((button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button7.getText().equals("X") && button5.getText().equals("X") && button3.getText().equals("X")) || (button9.getText().equals("X") && button5.getText().equals("X") && button1.getText().equals("X"))) {
            xWins();
            }
        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button7.getText().equals("O") && button5.getText().equals("O") && button3.getText().equals("O")) || (button9.getText().equals("O") && button5.getText().equals("O") && button1.getText().equals("O"))) {
            oWins();
            }else
        if(turn == 9){
            catGame();
        }
        }
        public void xWins(){
        textfield.setText("Player X Won! Congratulations!");
        textfield.setFont(new Font("Serif",Font.BOLD,80));
        title_panel.add(textfield);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);

        }
        public void oWins(){
        textfield.setText("Player O Won! Congratulations!");
        textfield.setFont(new Font("Serif",Font.BOLD,80));
        title_panel.add(textfield);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);

        }
        public void catGame(){
            textfield.setText("No one Won! CatGame!");
            textfield.setFont(new Font("Serif",Font.BOLD,80));
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    public static void main(String[] args) {
        new Frame();
    }
}
package org.wolf.Swing101;
/*
 * =====================================================================================================================
 * MIT LIcense
 * Copyright © 2020, Vishnuvardhan Reddy, Wolf Inc.
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 *
 *
 * =====================================================================================================================
 * Here I demonstrate some basic funcitonality of Swing Library used in Java.
 * We use the JFrame class of the javax.swing library to make a Frame and align
 * our elements of choice.
 * Basic Steps in creating a Swing GUI
 *
 * Step 0 : Import Swing Library
 * Step 1 : create a new frame object of the JFrame Class.
 * Step 2 : Set its dimensions (also, make sure what happens on closing the screen by default).
 * Step 3 : Create a new panel object of the JPanel Class.
 * Step 4 : Place the components.
 * Step 5 : Set the Frame visible
 *
 * For various components / classes in the Java Swing Library refer to :
 * https://docs.oracle.com/javase/7/docs/api/javax/swing/package-summary.html
 *
 * 
 */

import javax.swing.*;

public class swing01 {
    public static void main(String[] args) {

        //Step 01
        JFrame frame = new JFrame("My first Frame");


        //Step 02
        frame.setSize(1080, 1920);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Step 03
        JPanel panel = new JPanel();

        //Step 04
        frame.add(panel);

        //Step 05
        placeComponents(panel);


        //Step 06
        frame.setVisible(true);
    }

    public static void placeComponents(JPanel panel) {
        //Layout

        JLabel userLabel = new JLabel("User");

        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(10, 50, 80, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);


        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
    }
}

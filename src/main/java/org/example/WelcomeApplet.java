package org.example;

import javax.swing.*;

public class WelcomeApplet extends JApplet {
    @Override
    public void init() {
        add(new JLabel("Welcome to Java", JLabel.CENTER));
    }
}

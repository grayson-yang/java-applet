package org.example;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 */
public class MyApplet extends java.applet.Applet {
    /**
     * The no-arg constructor is called by the browser when the web
     * page containing this applet is initially loaded, or reloaded
     */
    public MyApplet() {

    }

    /**
     * Called by the browser after the applet is loaded
     */
    @Override
    public void init() {

    }

    /**
     * Called by the browser after the init() method, or
     * every time the Web page is visited
     */
    @Override
    public void start() {
    }

    /**
     * Called by the browser when the page containing this
     * applet becomes inactive
     */
    @Override
    public void stop() {

    }

    /**
     * Called by the browser when the Web browser exists
     */
    @Override
    public void destroy() {

    }

    public void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Applet is in the frame");

        // Create an instance of the applet
        MyApplet applet = new MyApplet();

        // Add the applet to the frame
        frame.add(applet, BorderLayout.CENTER);

        // Invoke applet's init method
        applet.init();
        applet.start();

        // Display the frame
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

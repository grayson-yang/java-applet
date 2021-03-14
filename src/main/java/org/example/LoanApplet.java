package org.example;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoanApplet extends JApplet {
    // Determine if it is application
    private boolean isStandalone = false;

    // Declare and create text fields for interest rate,
    // year, loan amount, monthly payment, and total payment.
    private JTextField jtfAnnualInterestRate = new JTextField();
    private JTextField jtfNumberOfYears = new JTextField();
    private JTextField jtfLoanAmount = new JTextField();
    private JTextField jtfMonthlyPayment = new JTextField();
    private JTextField jtfTotalPayment = new JTextField();

    // Declare and create a Compute Payment button
    private JButton jbtComputeLoan = new JButton("Compute Payment");

    @Override
    public void init() {
        // Get parameter values from the HTML file
        String message = getParameter("MESSAGE");
        int x = Integer.parseInt(getParameter("X"));
        int y = Integer.parseInt(getParameter("Y"));

        // Create a message label
        JLabel messageLabel = new JLabel(message);

        // Add the message label to the applet
        add(messageLabel, BorderLayout.NORTH);

        // Set properties on the text fields
        jtfMonthlyPayment.setEditable(false);
        jtfTotalPayment.setEditable(false);

        // Right align text fields
        jtfAnnualInterestRate.setHorizontalAlignment(JTextField.RIGHT);
        jtfNumberOfYears.setHorizontalAlignment(JTextField.RIGHT);
        jtfLoanAmount.setHorizontalAlignment(JTextField.RIGHT);
        jtfMonthlyPayment.setHorizontalAlignment(JTextField.RIGHT);
        jtfTotalPayment.setHorizontalAlignment(JTextField.RIGHT);

        // Panel p1 to hold labels and text fields
        JPanel p1 = new JPanel(new GridLayout(5, 2));
        p1.add((new Label("Annual Interest Rate")));
        p1.add(jtfAnnualInterestRate);
        p1.add((new Label("Number of Years")));
        p1.add(jtfNumberOfYears);
        p1.add((new Label("Loan Amount")));
        p1.add(jtfLoanAmount);
        p1.add((new Label("Monthly Payment")));
        p1.add(jtfMonthlyPayment);
        p1.add((new Label("Total Payment")));
        p1.add(jtfTotalPayment);
        p1.setBorder(new TitledBorder("Enter interest rate, year and loan amount"));

        // Panel p2 to hold the button
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(jbtComputeLoan);

        // Add the components to the applet
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        // Register listener
        jbtComputeLoan.addActionListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get values from text fields
            double interest = Double.parseDouble(jtfAnnualInterestRate.getText().trim());
            int year = Integer.parseInt(jtfNumberOfYears.getText().trim());
            double loanAmount = Double.parseDouble(jtfLoanAmount.getText().trim());

            // Create a loan object
            Loan loan = new Loan(interest, year, loanAmount);

            // Display monthly payment and total payment
            jtfMonthlyPayment.setText(String.format("%.2f", loan.getMonthlyPayment()));
            jtfTotalPayment.setText(String.format("%.2f", loan.getTotalPayment()));
        }
    }

    public void main(String[] args) {
        // It runs as an application
        isStandalone = true;

        // Create a frame
        JFrame frame = new JFrame("Applet is in the frame");

        // Create an instance of the applet
        LoanApplet applet = new LoanApplet();

        // Add the applet to the frame
        frame.add(applet, BorderLayout.CENTER);

        // Invoke applet's init method
        applet.init();

        // Display the frame
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

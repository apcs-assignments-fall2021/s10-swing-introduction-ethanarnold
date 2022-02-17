// List any classmates you talked to about this
// assignment (if any):
//
//
// List any outside sources you looked at (if any):
//
//

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldUser {
    public HelloWorldUser() {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("Hello World");
        frame.setLayout(new FlowLayout());

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame
        JLabel label1 = new JLabel("Hello World!");
        frame.add(label1);

        JTextField field1 = new JTextField(10);
        frame.add(field1);

        JButton button1 = new JButton("Click Here!");
        frame.add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                field1.setText("Hi!");
            }
        });


        // 4. Size the frame
        frame.setSize(300, 300);

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        HelloWorldUser h = new HelloWorldUser();
    }
}

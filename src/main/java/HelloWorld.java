import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloWorld {

	public HelloWorld() {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("Hello World");
        frame.setLayout(new FlowLayout());

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame
        JLabel label1 = new JLabel("Hello World!");
        frame.add(label1);

        // 4. Size the frame
        frame.setSize(300, 300);

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
    }
}

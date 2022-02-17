import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalChooser {

    public AnimalChooser() {
        // 1. Create the frame.
        JFrame frame = new JFrame("Animal Chooser");

        // This Frame is using BorderLayout
        frame.setLayout(new BorderLayout());

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame.
        // This label will be replaced by an image later
        JLabel label1 = new JLabel("");
        frame.add(label1);

        JButton button1 = new JButton("Red Panda");
        frame.add(button1, BorderLayout.SOUTH);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ImageIcon icon = new ImageIcon("images/red_panda.jpg");
                label1.setIcon(icon);
            }
        });

        // 4. Size the frame.
        frame.setSize(900, 500);

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        AnimalChooser x = new AnimalChooser();
    }
}

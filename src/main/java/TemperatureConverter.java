import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Using FlowLayout and Label Output

public class TemperatureConverter {

    public TemperatureConverter() {
        JFrame frame = new JFrame("Temperature Converter");

        // This Frame is using BorderLayout
        frame.setLayout(new FlowLayout());

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame.
        // This label will be replaced by an image later
        JLabel f = new JLabel("F");
        frame.add(f);
        JTextField fText = new JTextField(10);
        frame.add(fText);
        JButton convertToC = new JButton("Convert to C");
        frame.add(convertToC);

        JLabel c = new JLabel("C");
        frame.add(c);
        JTextField cText = new JTextField(10);
        frame.add(cText);
        JButton convertToF = new JButton("Convert to F");
        frame.add(convertToF);

        convertToC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                double f = Double.parseDouble(fText.getText());
                double c = (f - 32) * (0.55555555555);
                c =  Math.floor(c * 100) / 100;
                cText.setText(c + "");
            }
        });

        convertToF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                double c = Double.parseDouble(cText.getText());
                double f = c * (0.55555555555) + 32;
                f = Math.floor(f * 100) / 100;
                fText.setText(f + "");
            }
        });

        // 4. Size the frame.
        frame.setSize(900, 500);

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String args[]){
        TemperatureConverter tc = new TemperatureConverter();
    }
}

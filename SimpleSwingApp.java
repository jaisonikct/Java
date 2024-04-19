import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleSwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Add JButton to JFrame
        frame.add(button);

        // Set JFrame size
        frame.setSize(300, 200);

        // Set JFrame visible
        frame.setVisible(true);
    }
}

import java.awt.*;

public class ContainerExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Container Example");
        
        // Create a Panel container
        Panel panel = new Panel();
        
        // Set the layout for the panel
        panel.setLayout(new FlowLayout());
        
        // Create buttons and add them to the panel
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        
        panel.add(button1);
        panel.add(button2);
        
        // Add the panel to the frame
        frame.add(panel);
        
        // Set frame size and make it visible
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

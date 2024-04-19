import java.awt.*;

public class ComponentExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Component Example");
        
        // Create a Button component
        Button button = new Button("Click Me");
        
        // Set the size and position of the button
        button.setBounds(100, 100, 100, 50);
        
        // Add the button to the frame
        frame.add(button);
        
        // Set frame size and make it visible
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

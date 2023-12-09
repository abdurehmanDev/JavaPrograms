import javax.swing.*;

public class AppletViewer extends JFrame {

    public AppletViewer() {
        super("Simple Message Display");

        // Create a label with the message
        JLabel label = new JLabel("Hello Programmers, Happy Coding.");

        // Add the label to the frame's content pane
        getContentPane().add(label);

        // Set frame properties
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppletViewer());
    }
}

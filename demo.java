import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing Application");
        frame.setSize(500, 200);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        JButton button = new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hello Swing");
            }
        });
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
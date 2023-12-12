import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
 class TRAIN {
	void run()
	{
		System.out.println("Hello");
	}

}
class chida
{
	public static void main(String args[]) {
	
        JFrame frame = new JFrame("Checkbox Demo");

      
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel labelPanel = new JPanel();

       
        JLabel knownLanguagesLabel = new JLabel("Known languages");

      
        labelPanel.add(knownLanguagesLabel);

        mainPanel.add(labelPanel, BorderLayout.NORTH);

       
        JPanel checkBoxPanel = new JPanel(new GridLayout(0, 1));

        JCheckBox javaCheckBox = new JCheckBox("Java");
        JCheckBox pythonCheckBox = new JCheckBox("Python");
        JCheckBox javascriptCheckBox = new JCheckBox("JavaScript");

        checkBoxPanel.add(javaCheckBox);
        checkBoxPanel.add(pythonCheckBox);
        checkBoxPanel.add(javascriptCheckBox);

        mainPanel.add(checkBoxPanel, BorderLayout.CENTER);

        frame.getContentPane().add(mainPanel);

       
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
}
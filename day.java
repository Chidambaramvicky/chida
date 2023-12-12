import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class TRAIN {
	void run()
	{
		System.out.println("Hello");
	}

}
class day
{
	public static void main(String args[]) {
		
        JFrame frame = new JFrame("Radio Button Demo");

        
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel labelPanel = new JPanel();

        JLabel genderLabel = new JLabel("Select gender:");

        labelPanel.add(genderLabel);

        mainPanel.add(labelPanel, BorderLayout.NORTH);

        JPanel radioButtonPanel = new JPanel();

        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");

        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);

        radioButtonPanel.add(maleRadioButton);
        radioButtonPanel.add(femaleRadioButton);

        mainPanel.add(radioButtonPanel, BorderLayout.CENTER);

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
   
            public void actionPerformed(ActionEvent e) {
                if (maleRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Selected gender: Male");
                } else if (femaleRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Selected gender: Female");
                } else {
                    JOptionPane.showMessageDialog(null, "No gender selected");
                }
            }
        });

      
        mainPanel.add(submitButton, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);	}
    }
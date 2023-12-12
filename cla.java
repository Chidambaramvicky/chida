import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
public class cla{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Q1");
		JFrame frame=new JFrame("APPLICATION");
		JLabel l1=new JLabel("Username");
		JLabel l2=new JLabel(" Password");
		JLabel l3=new JLabel("Accept T&C");
		JRadioButton r1=new JRadioButton("Yes");
		JRadioButton r2=new JRadioButton("No");
		JButton b=new JButton("Click me");
		JButton b1=new JButton("Login");
		
		JTextField t1=new JTextField(20);
		JTextField t2=new JTextField(20);
		JTextField t3=new JTextField(15);
		frame.setBounds(750,500,0,0);
		
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str=t3.getText();
				JOptionPane.showMessageDialog(b, str);
			}
		});
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		frame.add(l3);
		frame.add(r1);
		frame.add(r2);
		frame.add(b1);
		frame.add(b);
		frame.add(t3);
		frame.setSize(350,350);
		frame.setVisible(true);
	}
	
}
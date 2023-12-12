import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class pahh {
	public static void main(String args[]) {
		JFrame f1=new JFrame("7827822TUIT014");
		JLabel l1=new JLabel("Were the contents delivered clearly by the trainer:");
		JLabel l2=new JLabel("Do the trainers clear all your doubts:");
		JLabel l3=new JLabel("Do the trainer is Interactive:");
		JLabel l4=new JLabel("Rate the trainer on a scale of 1 to 10:");
		
		JTextField t1=new JTextField(3);
		
		JCheckBox yes=new JCheckBox("Yes");
		JCheckBox no=new JCheckBox("No");
		JCheckBox yes1=new JCheckBox("Yes");
		JCheckBox no1=new JCheckBox("No");
		JCheckBox yes2=new JCheckBox("Yes");
		JCheckBox no2=new JCheckBox("No");
		
		f1.add(l1);
		f1.add(yes);
		f1.add(no);
		f1.add(l2);
		f1.add(yes1);
		f1.add(no1);
		f1.add(l3);
		f1.add(yes2);
		f1.add(no2);
		f1.add(l4);
		f1.add(t1);
		
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
		f1.setSize(300,300);
	}
}
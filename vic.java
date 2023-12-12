import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
 class TRAIN {
	void run()
	{
		System.out.println("Hello");
	}

}
class vic
{
	public static void main(String args[]) {
		
		  JFrame frame = new JFrame("Table Demo");

	        Object[][] data = {
	                {1, "John Doe", 50000},
	                {2, "Jane Smith", 60000},
	                {3, "Bob Johnson", 75000}
	        };

	    
	        String[] columnNames = {"ID", "Name", "Salary"};

	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

	        JTable table = new JTable(tableModel);

	        JScrollPane scrollPane = new JScrollPane(table);

	        frame.getContentPane().add(scrollPane);

	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);	
        }
    }
package mazesolver;
// column class
import javax.swing.JOptionPane;

public class Column {
	 public int getwidth(){
     	// get number of columns
     	int m = Integer.parseInt(JOptionPane.showInputDialog("Enter number of columns"));
     	return m;
		// return column number
     }
}

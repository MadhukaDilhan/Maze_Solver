package mazesolver;

import javax.swing.JOptionPane;
// Start class
public class Start {
	 public int getstart(){
     	// get starting shell
     	int m = Integer.parseInt(JOptionPane.showInputDialog("Enter the start cell"));
     	// return start shell value
     	return m;
     }
}

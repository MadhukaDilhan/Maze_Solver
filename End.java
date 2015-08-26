package mazesolver;
// End class
import javax.swing.JOptionPane;

public class End {
//getend function
	public int getend(){
    	// end shell get m to shell number;
    	int m = Integer.parseInt(JOptionPane.showInputDialog("Enter the end cell"));
    	return m;
		//return shell number
    }
}

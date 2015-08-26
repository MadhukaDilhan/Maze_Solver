package mazesolver;
// importings
import java.awt.Color;

import javax.swing.JButton;

import acm.program.*;

//Pathfinding class using recursion 
public class  Pathfinding extends GraphicsProgram{
	
	private static final long serialVersionUID = 1L;

	public JButton[][] solve(JButton grid[][],int str,int stc){
 	   
 	   // get back ground
 	   JButton A=grid[str][stc];
        Color strtcolor = A.getBackground();
		//tern to right
        JButton rig=grid[str][stc+1];
        Color right = rig.getBackground();
		//turn to down
        JButton dow=grid[str+1][stc];
        Color down = dow.getBackground();
		//turn to left
        JButton lef=grid[str][stc-1];
        Color left = lef.getBackground();
		//turn to up
        JButton ups=grid[str-1][stc];
        Color up = ups.getBackground();
       // going paths conditions 
 	   if(strtcolor==Color.red||right==Color.red||down==Color.red||left==Color.red||up==Color.red){ 
 		   if(strtcolor!=Color.red)
 			   A.setBackground(Color.yellow);
 		   //System.out.println("path found");
 		   Dialog k=new Dialog();
 		   k.out();
 		   
 	   }//fist turn right
 	   else if((right==Color.green)){
 		   A.setBackground(Color.yellow);
 		  pause(500);
 		   solve(grid,str,stc+1);
 	   }
	   //second check left and turn
 	  else if((left==Color.green)){
		   A.setBackground(Color.yellow);
		   pause(500);
		   solve(grid,str,stc-1);
	   }
	   //third check down and turn
 	   else if((down==Color.green)){
 		   A.setBackground(Color.yellow);
 		   pause(500);
 		   solve(grid,str+1,stc);
 	   }
 	   //fourth check up and turn
 	   else if((up==Color.green)){
 		   A.setBackground(Color.yellow);
 		   pause(500);
 		   solve(grid,str-1,stc);
 	   }

 	   // come again turn right
 	  else if((right==Color.yellow)){
 		   A.setBackground(Color.pink);
 		   pause(500);
 		   solve(grid,str,stc+1);
 	   }
	   //come again turn left
 	  else if((left==Color.yellow)){
		   A.setBackground(Color.pink);
		   pause(500);
		   solve(grid,str,stc-1);
	   }
	   //come again turn down
 	   else if((down==Color.yellow)){
 		   A.setBackground(Color.pink);
 		   pause(500);
 		   solve(grid,str+1,stc);
 	   }
 	  //come again turn up
 	   else if((up==Color.yellow)){
 		   A.setBackground(Color.pink);
 		   pause(500);
 		   solve(grid,str-1,stc);
 	   }  
 	   
 	  return grid;// return grid value
    }
	
}

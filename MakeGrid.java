package mazesolver;
// imbortings
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Dimension;
// makeGride class
public class MakeGrid {
	JFrame frame=new JFrame(); //creates frame
    static JButton[][] grid; //names the grid of buttons
    static int p[][];
    static String num[];
    static int intn[];
    static int stc,str,endc,endr;
    // grid class
    public JButton[][] Grid(int width, int length){ //constructor
    	width=width+2;
    	length=length+2;
            frame.setLayout(new GridLayout(width,length)); //set layout
            grid=new JButton[width][length]; //allocate the size of grid
            for(int y=0; y<width; y++){
            	
                    for(int x=0; x<length; x++){
                    	
                    	if(x==0||y==0||x==length-1||y==width-1){
                            grid[y][x]=new JButton("  "); //creates new button 
                            JButton b = grid[y][x];
                            b.setPreferredSize(new Dimension(55,55));
                        
                    	}else{
                            grid[y][x]=new JButton(" "+(x+length*(y-1)-y*2+2)+" "); //creates new button  
                            JButton a = grid[y][x];
                            a.setPreferredSize(new Dimension(55,55));
                    	}
                            JButton A=grid[y][x];
                            
                            A.setBackground(Color.green);
                           
                            frame.add(grid[y][x]); //adds button to grid
                            
                    }
                    
                  
            }
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack(); //sets appropriate size for frame
            frame.setVisible(true); //makes frame visible
            return grid;//return
    }
}

package mazesolver;

import javax.swing.JFrame; //imports JFrame library
import javax.swing.JButton; //imports JButton library
import javax.swing.JOptionPane;

import java.awt.Color;

// runner class
public class Runner{
 
        JFrame frame=new JFrame(); //creates frame
        static JButton[][] grid,grid1; //names the grid of buttons
        static int stc,str,endc,endr;
        static String num[];
        static int intn[];
     
      // array function
        public String[] array()

        {
            String m;
            m = JOptionPane.showInputDialog("Enter comma seperated wall nombers");
           String[] num= m.split(",");   
     
            return num;
        }
        // intArray function
        public int[] intArray(String[] sarray) {
            	
            int intarray[] = new int[sarray.length];
            for (int i = 0; i < sarray.length; i++) {
            intarray[i] = Integer.parseInt(sarray[i]);
            }
            return intarray;
            	
        }
        // getwallback function
       public void getwallblack(JButton grid[][],int r1,int c1){
    	   
    	   
        	for(int k=0; k<r1+2; k++){
                for(int l=0; l<c1+2; l++){
             	   
             	   JButton z=grid[k][l];
                    if(k==0||l==0||k==r1+1||l==c1+1)
             	   z.setBackground(Color.black);
                	}
            
            }
        	
        	
        }
  
       public void startend(JButton grid[][],int startcell,int endcell,int col){
    		
  		 
     	   stc=startcell%col;
     	   
     	   str=startcell/col;
     	   if(stc==0)
     		  stc= stc+col;
     	   else
     		   str=str+1;
    		
    		JButton A=grid[str][stc];
            A.setBackground(Color.yellow);
            
            endc=endcell%col;
      	   
      	   endr=endcell/col;
      	   if(endc==0)
      		  endc= endc+col;
      	   else
      		   endr=endr+1;
     		
     		JButton B=grid[endr][endc];
             B.setBackground(Color.red);	
         
   
             
       }
       
     
    		
    	
    		 public static void main(String[] args) {
    			 
    			 
    	         
    	         Row L=new Row();
    	        
    	         int r1=L.getheight();
    	        Column M=new Column();
    	         int c1=M.getwidth();
    	         
    	         MakeGrid CC =new MakeGrid();
    	         JButton grid[][]=CC.Grid(r1,c1);
    	         
    	         Runner A=new Runner();
    	         A.getwallblack(grid,r1,c1);
    	         
    	     
    	         num=A.array();
    	     // for(int w=0;w<num.length;w++){
    	     //    System.out.println(num[w]);
    	     // }
    	      
    	      intn =A.intArray(num);     
    	      
    	        for(int i=0;i<intn.length;i++){
    	      	   
    	      	   int c=intn[i]%c1;
    	      	   
    	      	   int r=intn[i]/c1;
    	      	   if(c==0)
    	      		  c= c+c1;
    	      	   else
    	      		   r=r+1;
    	      		   
    	      	   
    	      	//   System.out.println("r value:"+r+"s value "+c);
    	      	   JButton D=grid[r][c];
    	             D.setBackground(Color.black);
    	        }
    	        	Start N=new Start();
    	             int start=N.getstart();
    	             End O=new End();
    	             int end=O.getend();
    	             		
    	             A.startend(grid,start,end,c1);

    	             Pathfinding ZZ=new Pathfinding();
    	          
    	             JButton grid1[][]=ZZ.solve(grid,str,stc);
    	             
    	           
    	             for(int i=0;i<intn.length;i++){
    	          	   
    	          	   int c=intn[i]%c1;
    	          	   
    	          	   int r=intn[i]/c1;
    	          	   if(c==0)
    	          		  c= c+c1;
    	          	   else
    	          		   r=r+1;
    	          	   
    	          	   //System.out.println("r value:"+r+"s value "+c);
    	          	   JButton D=grid1[r][c];
    	                 D.setBackground(Color.black);
    	            }
    	  }
    	}
    	 
    	/////////////////////////////////////////////// 

    	//example
    	//row =8	col=10	
    	//2,12,14,15,16,17,18,19,22,27,32,33,34,44,54,64,45,46,47,37,39,49,52,57,59,62,64,66,67,69,72,79
    	//start 1 end 56


    	/////////////////////////////////////////////



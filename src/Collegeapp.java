
import java.applet.*;
import java.awt.event.*;
import java.awt.*;


public class Collegeapp extends Applet implements ItemListener {
    CheckboxGroup cg1;
    Checkbox BTECH, BBA, LLB;
     Button n;
      
    public void init() {

    cg1=new CheckboxGroup();
    BTECH= new Checkbox("B.Tech                                                                    ",cg1,false);
     BBA= new Checkbox( "B.B.A                                                                      ",cg1,false);
     LLB= new Checkbox( "L.L.B                                                                      ",cg1,false);
     n= new Button(" Next");
     add(BTECH);
     
     add(BBA);
     add(LLB);
     add(n);
     
     BTECH.addItemListener(this);
     BBA.addItemListener(this);
     LLB.addItemListener(this);
     
    }
    /*public Collegeapp()
    {
         n.addActionListener(new ActionListener(){
    	  
           public void actionPerformed(ActionEvent ae)
           {
               collegeappnext sc = new collegeappnext();
               sc.show();
               
             
           }
       
           }
                );
    }
    public static void main (String g[])throws InstantiationException, IllegalAccessException
	{ 
           Collegeapp s=new Collegeapp();
           
	// stu.setSize(new Dimension(500,500));
	 //stu.setTitle("student registration");
	 //stu.setVisible(true);
        ;
	}
    */
    @Override
    public void itemStateChanged(ItemEvent e) {
      repaint(); 
    }

  /*  @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
       //To change body of generated methods, choose Tools | Templates.
    }
 */
}

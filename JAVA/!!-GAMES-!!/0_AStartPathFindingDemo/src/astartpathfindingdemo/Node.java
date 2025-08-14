
package astartpathfindingdemo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Node extends JButton implements ActionListener
{
    Node parent;
    
    int col;
    int row;
    
    int gCost; // Distance between currentNode - startNode 
    int hCost; // Distance between currentNode - goalNode (without obstacles) 
    int fCost; // Total Cost = gCost + host 
    
    boolean start;
    boolean goal;
    boolean solid;
    boolean open;
    boolean checked;
    
    public Node(int col, int row)
    {
        this.col = col;
        this.row = row;
        
        this.setFocusable(false);
        
        setBackground(Color.white);
        setForeground(Color.black);
        addActionListener(this);
    }
    
    public void SetAsStart()
    {
        setBackground(Color.red);
        setForeground(Color.white);
        setText("Start");
        start = true;
    }
    
    public void SetAsGoal()
    {
        setBackground(Color.green);
        setForeground(Color.black);
        setText("Goal");
        goal = true;
    }
    
    public void SetAsSolid(int origin_type)
    {
        if(origin_type == 0)
        {
            setBackground(Color.black);
            setForeground(Color.black);        
        }
        else
        {
            setBackground(Color.darkGray);
            setForeground(Color.darkGray);        
        }
        solid = true;
    }
    
    public void SetAsOpen()
    {     
        open = true;
    }
    
    public void SetAsChecked()
    {     
        if (!start && !goal)
        {
            setBackground(Color.gray);
            setForeground(Color.black);
        }
        checked = true;
    }
    
    public void SetAsPath()
    {     
        setBackground(Color.yellow);
        setForeground(Color.black);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        SetAsSolid(1);
    }
    
    
}

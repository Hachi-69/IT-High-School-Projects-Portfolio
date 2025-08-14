
package astartpathfindingdemo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DemoPanel extends JPanel
{
    final int maxCol = 10;
    final int maxRow = 10;
    final int nodeSizeX = 100;
    final int nodeSizeY = 70;
    final int screenHeight = nodeSizeY * maxCol;
    final int screenWidth = nodeSizeX * maxRow;
    
    //MAPPA
    Node[][] node = new Node[maxCol][maxRow];
    Node startNode, goalNode, currentNode;
    
    //Variabili di Lavoro
    ArrayList<Node> openList = new ArrayList<>();
    ArrayList<Node> checkedList = new ArrayList<>();
    
    boolean goalReached = false;
    int step = 0; //mi serve per bloccare l'alg. se non ci fosse una strada
    
    public DemoPanel()
    {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(maxRow, maxCol));
        
        this.addKeyListener(new KeyHandler(this));
        this.setFocusable(true);
        
        int col = 0;
        int row = 0;
        
        while(col < maxCol && row<maxRow)
        {
            node[col][row] = new Node(col,row);
            this.add(node[col][row]);
            
            col++;
            if (col == maxCol)
            {
                col = 0;
                row++;
            }
        }
        
        //Setting Start and Goal Nodes
        SetStartNode(1,2);
        SetGoalNode(8,7);
        
        
        //Setting Obstacoles
        SetSolidNode(6,0);
        SetSolidNode(6,1);
        
        SetSolidNode(6,2);
        SetSolidNode(6,3);
        SetSolidNode(6,4);
        SetSolidNode(6,5);
        SetSolidNode(7,5);
        SetSolidNode(7,6);
        SetSolidNode(7,7);
        SetSolidNode(7,8);
                
        SetSolidNode(4,6);
        SetSolidNode(4,7);
        SetSolidNode(4,8);
        SetSolidNode(4,9);
        SetSolidNode(4,5);
        
        //Costs Calculation
        SetCostsOnNodes();
    }
    
    private void SetStartNode(int c, int r)
    {
        node[c][r].SetAsStart();
        startNode = node[c][r];
        currentNode = startNode;
    }
    
    private void SetGoalNode(int c, int r)
    {
        node[c][r].SetAsGoal();
        goalNode = node[c][r];
    }
    
    private void SetSolidNode(int c, int r)
    {
        node[c][r].SetAsSolid(0);
    }
    
    private void SetCostsOnNodes()
    {
        int col = 0;
        int row = 0;
        
        while(col < maxCol && row<maxRow)
        {
            GetCost(node[col][row]);
            col++;
            if (col == maxCol)
            {
                col = 0;
                row++;
            }
        }
        
    }
    
    private void GetCost(Node n)
    {
        // G-Cost = Distance between currentNode - startNode 
        int xDistance = Math.abs(n.col - startNode.col);
        int yDistance = Math.abs(n.row - startNode.row);
        n.gCost = xDistance + yDistance;
        
        // H-Cost = Distance between currentNode - goalNode (without obstacles) 
        xDistance = Math.abs(n.col - goalNode.col);
        yDistance = Math.abs(n.row - goalNode.row);
        n.hCost = xDistance + yDistance;
        
        // F-Cost = G + H
        n.fCost = n.gCost + n.hCost;
        
        //Display node cost
        if (n != startNode && n != goalNode)
            n.setText("<html>F:"+n.fCost+"<br />G:"+n.gCost+",H:"+n.hCost+"</html>");
            //n.setText("F:"+n.fCost+" - G:"+n.gCost+",H:"+n.hCost);
    }
    
    public void Search()
    {
        if (goalReached == false)
        {
            int col = currentNode.col;
            int row = currentNode.row;
            
            currentNode.SetAsChecked();
            checkedList.add(currentNode);
            openList.remove(currentNode);
            
            // Apro i nodi nelle 4 direzioni
            if (row - 1 >= 0)
                OpenNode(node[col][row-1]); //UP
            if (row + 1 < maxRow)
                OpenNode(node[col][row+1]); //DOWN
            if (col - 1 >= 0)
                OpenNode(node[col-1][row]); //LEFT
            if (col + 1 < maxCol)
                OpenNode(node[col+1][row]); //RIGHT
            
            int bestNodeIndx = 0;
            int bestNodeFCost = 999;
            
            //searching for best fCost node
            for (int i = 0; i < openList.size(); i++) 
            {
                if (openList.get(i).fCost < bestNodeFCost)
                {
                    bestNodeFCost = openList.get(i).fCost;
                    bestNodeIndx = i;
                }
                else if (openList.get(i).fCost == bestNodeFCost)
                {
                    if (openList.get(i).gCost < openList.get(bestNodeIndx).gCost)
                    {
                        bestNodeIndx = i;
                    }
                }    
            }
            
            currentNode = openList.get(bestNodeIndx);
            
            if (currentNode == goalNode)
            {
                goalReached = true;
                TrackFinalPath();
            }
        }
        step++;
    }
    
    public void AutoSearch()
    {
        while (!goalReached && step<(maxCol*maxRow))
        {
            int col = currentNode.col;
            int row = currentNode.row;
            
            currentNode.SetAsChecked();
            checkedList.add(currentNode);
            openList.remove(currentNode);
            
            // Apro i nodi nelle 4 direzioni
            if (row - 1 >= 0)
                OpenNode(node[col][row-1]); //UP
            if (row + 1 < maxRow)
                OpenNode(node[col][row+1]); //DOWN
            if (col - 1 >= 0)
                OpenNode(node[col-1][row]); //LEFT
            if (col + 1 < maxCol)
                OpenNode(node[col+1][row]); //RIGHT
            
            int bestNodeIndx = 0;
            int bestNodeFCost = 999;
            
            //searching for best fCost node
            for (int i = 0; i < openList.size(); i++) 
            {
                if (openList.get(i).fCost < bestNodeFCost)
                {
                    bestNodeFCost = openList.get(i).fCost;
                    bestNodeIndx = i;
                }
                else if (openList.get(i).fCost == bestNodeFCost)
                {
                    if (openList.get(i).gCost < openList.get(bestNodeIndx).gCost)
                    {
                        bestNodeIndx = i;
                    }
                }    
            }
            
            currentNode = openList.get(bestNodeIndx);
            
            if (currentNode == goalNode)
            {
                goalReached = true;
                TrackFinalPath();
            }
        }
        step++;
    }
    
    private void OpenNode(Node n)
    {
        if (!n.open && !n.checked && !n.solid)
        {
            n.SetAsOpen();
            n.parent = currentNode;
            openList.add(n);
        }
    }
    
    private void TrackFinalPath()
    {
        //partendo dal goalNode torno indietro tramite i parent, fino allo startNode
        Node current = goalNode;
        
        while (current != startNode)
        {
            current = current.parent;
            if (current != startNode)
                current.SetAsPath();
        }
    }
}

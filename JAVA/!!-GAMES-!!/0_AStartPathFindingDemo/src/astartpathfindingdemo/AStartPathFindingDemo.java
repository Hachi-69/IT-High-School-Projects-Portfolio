/*
REF:
https://www.youtube.com/watch?v=2JNEme00ZFA
 */
package astartpathfindingdemo;

import javax.swing.JFrame;

public class AStartPathFindingDemo {

    public static void main(String[] args) {
        JFrame w = new JFrame();
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setResizable(false);
        
        w.add(new DemoPanel());
        w.pack();
        w.setLocationRelativeTo(null);
        w.setVisible(true);
    }
    
}

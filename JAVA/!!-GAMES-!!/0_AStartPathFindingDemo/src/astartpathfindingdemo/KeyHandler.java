
package astartpathfindingdemo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 Classe utile per far procedere l'algoritmo di ricerca
 un passo alla volta, premendo Enter
 */
public class KeyHandler implements KeyListener{

    DemoPanel dp;
    
    public KeyHandler(DemoPanel dp)
    {
        this.dp = dp;
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int code = ke.getKeyCode();
        
        //if (code == KeyEvent.VK_ENTER)
        if (code == KeyEvent.VK_SPACE)
            dp.Search();
            //dp.AutoSearch();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
}

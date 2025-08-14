package TDM;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author Turillo.Luca
 */
public final class Wall {

    private final Integer x, y;
    private final Rectangle side;
    private final Player r[];
    private final Graphics graphics;

    /**
     * Classe del muro
     *
     * @param x, posizione x muro
     * @param y, posizione y muro
     * @param r, array di player
     * @param supp, pannello
     */
    public Wall(Integer x, Integer y, Player[] r, JPanel supp) {
        this.x = x;
        this.y = y;
        this.side = new Rectangle(this.x, this.y, 50, 50);
        this.r = r;
        this.graphics = supp.getGraphics();
        this.draw();
    }

    /**
     * metodo per controllare se un player tocca un muro
     */
    public void touchWall() {
        for (Player r1 : r) {
            if (side != null && side.intersects(r1.getX() - 15, r1.getY() - 15, 60, 60)) {
                if (r1.getX() > x) {
                    r1.changeDirection(0);// spostamento player a destra
                } else if (r1.getX() < x) {
                    r1.changeDirection(1);// spostamento player a sinistra
                } else if (r1.getY() > y) {
                    r1.changeDirection(3);// spostamento player in basso
                } else if (r1.getY() < y) {
                    r1.changeDirection(2);// spostamento player in alto
                }
            }
        }
    }

    /**
     * disegno del muro
     */
    public void draw() {
        graphics.setColor(Color.black);
        graphics.fillRect(x, y, 50, 50);
    }
}

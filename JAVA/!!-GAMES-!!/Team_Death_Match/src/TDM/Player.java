package TDM;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Turillo.Luca
 */
public class Player extends Thread {

    private final Graphics graphics;
    private final JPanel surface;
    private int X, Y;
    private int cSteps, direction;
    private final int steps;
    private final Color teamColor;
    private static Player r[];
    private final Random rnd;
    private Rectangle hitbox;
    private Boolean isAlive, isAttacking;
    private final Boolean team;
    private static Boolean die;
    private final JLabel GUI, win;
    private final String stringTeam;
    private String stringDirections;
    private final Wall wall;
    private Image Img;

    /**
     * Classe player
     *
     * @param supp, JPanel
     * @param spawnX, posizione x di spawn player
     * @param spawnY, posizione y di spawn player
     * @param teamColor, colore del team
     * @param array, array contenente tutti i player
     * @param team, true = team blu, false = team rosso
     * @param GUI, JLabel
     * @param win, JLabel
     * @param wall, muro
     */
    public Player(JPanel supp, Integer spawnX, Integer spawnY, Color teamColor, Player array[], Boolean team, JLabel GUI, JLabel win, Wall wall) {
        this.rnd = new Random();
        this.surface = supp;
        this.teamColor = teamColor;
        this.X = spawnX;
        this.Y = spawnY;
        Player.r = array;
        this.team = team;
        Player.die = rnd.nextBoolean();
        this.graphics = supp.getGraphics();
        this.direction = rnd.nextInt(4);
        this.GUI = GUI;
        this.win = win;
        this.wall = wall;
        this.steps = 5;
        this.isAlive = true;
        this.isAttacking = false;
        if (team) {
            stringTeam = "blueT";
        } else {
            stringTeam = "redT";
        }
    }

    @Override
    public void run() {
        while (true) {
            if (isAlive) {
                simulation();// avvio della simulazione
                try {
                    Thread.sleep(rnd.nextInt(50) + 70);
                } catch (InterruptedException e) {
                }
                checkContact();// controllo di contatto tra player
            } else {
                drawX();// disegno della X se il player e' morto
            }
            wall.touchWall();// controllo se il player tocca il muro
            wall.draw();// disegno del muro
        }
    }

    /**
     * scelta della direzione del player
     */
    private synchronized void simulation() {
        if (cSteps == 15) {
            direction = rnd.nextInt(8);
            cSteps = 0;
        }
        cSteps++;
        switch (direction) {
            case 0:
                right();
                break;
            case 1:
                left();
                break;
            case 2:
                up();
                break;
            case 3:
                down();
                break;
            case 4:
                rightDown();
                break;
            case 5:
                leftUp();
                break;
            case 6:
                upRight();
                break;
            case 7:
                downLeft();
                break;
        }
    }

    /**
     * in alto a destra
     */
    private void upRight() {
        if (X + steps < 530 && Y - steps >= steps + 15) {
            clean();
            X += steps;
            Y -= steps;
            stringDirections = "right";
            draw();
        } else {
            direction = 1;
        }
    }

    /**
     * in basso a destra
     */
    private void rightDown() {
        if (X + steps < 530 && Y + steps < 430) {
            clean();
            X += steps;
            Y += steps;
            stringDirections = "down";
            draw();
        } else {
            direction = 1;
        }
    }

    /**
     * in alto a sinistra
     */
    private void leftUp() {
        if (X - steps >= steps + 10 && Y - steps >= steps + 15) {
            clean();
            X -= steps;
            Y -= steps;
            stringDirections = "up";
            draw();
        } else {
            direction = 0;
        }
    }

    /**
     * in basso a sinistra
     */
    private void downLeft() {
        if (Y + steps < 430 && X - steps >= steps + 10) {
            clean();
            Y += steps;
            X -= steps;
            stringDirections = "left";
            draw();
        } else {
            direction = 2;
        }
    }

    /**
     * a destra
     */
    private void right() {
        if (X + steps < 530) {
            clean();
            X += steps;
            stringDirections = "right";
            draw();
        } else {
            direction = 1;
        }
    }

    /**
     * a sinistra
     */
    private void left() {
        if (X - steps >= steps + 10) {
            clean();
            X -= steps;
            stringDirections = "left";
            draw();
        } else {
            direction = 0;
        }
    }

    /**
     * in alto
     */
    private void up() {
        if (Y - steps >= steps + 15) {
            clean();
            Y -= steps;
            stringDirections = "up";
            draw();
        } else {
            direction = 3;
        }
    }

    /**
     * in basso
     */
    private void down() {
        if (Y + steps < 430) {
            clean();
            Y += steps;
            stringDirections = "down";
            draw();
        } else {
            direction = 2;
        }
    }

    /**
     * metodo per pulire la vecchia posizione dell'immagine
     */
    private void clean() {
        if (!isAttacking) {
            try {
                Img = ImageIO.read(new File("./src/assets/" + stringTeam + "/clean_" + stringDirections + ".png"));
                graphics.drawImage(Img, X - 25, Y - 20, surface);
            } catch (IOException ex) {
            }
        }
    }

    /**
     * metodo per disegnare l'immagine nella nuova posizione
     */
    private void draw() {
        if (!isAttacking) {
            try {
                Img = ImageIO.read(new File("./src/assets/" + stringTeam + "/move_" + stringDirections + ".png"));
                graphics.drawImage(Img, X - 25, Y - 20, surface);
                hitbox = new Rectangle(X - 15, Y - 15, 45, 45);// hitbox del player
            } catch (IOException ex) {
            }
        }
    }

    /**
     * metodo per controllare se due player di due squadre diverse si toccano, e
     * nel caso "muore" uno dei due
     */
    private synchronized void checkContact() {
        for (Player r1 : r) {
            if (!r1.getName().equals(this.getName())) {// controllo per evitare che si controlli da solo
                if (hitbox != null && hitbox.intersects(r1.getX() - 15, r1.getY() - 15, 45, 45)) {// controllo dell'intersezione delle due hitbox
                    if (!this.team.equals(r1.team) && (this.isAlive && r1.isAlive)) {// controllo che siano di team diversi e che siano entrambi vivi
                        isAttacking = true;// avviso che si sta attaccando
                        r1.isAttacking = true;
                        for (int i = 0; i < 15; i++) {// animazione di attacco
                            try {
                                Img = ImageIO.read(new File("./src/assets/" + stringTeam + "/animation/attack_" + stringDirections + "_" + i + ".png"));
                                graphics.drawImage(Img, X - 25, Y - 20, surface);
                                Thread.sleep(50);
                                Img = ImageIO.read(new File("./src/assets/clean.png"));
                                graphics.drawImage(Img, X - 25, Y - 20, surface);
                            } catch (IOException | InterruptedException ex) {
                            }
                        }
                        // "morte" di uno dei due thread \\
                        if (die) {
                            die = false;
                            die();
                        } else {
                            die = true;
                            r1.die();
                        }
                        isAttacking = false;
                        r1.isAttacking = false;
                    }
                }
            }
        }
    }

    /**
     * metodo di morte
     */
    private void die() {
        isAlive = false;
        try {
            Img = ImageIO.read(new File("./src/assets/clean.png"));
            graphics.drawImage(Img, X - 25, Y - 20, surface);
        } catch (IOException ex) {
        }
        drawX();
        changeGUI();
        win();
    }

    /**
     * metodo per disegnare la X di morte
     */
    private void drawX() {
        graphics.setColor(teamColor);
        graphics.drawLine(getX(), getY(), getX() + 15, getY() + 15);
        graphics.drawLine(getX() + 15, getY(), getX(), getY() + 15);
    }

    /**
     * metodo per cambiare la JLabel del punteggio
     */
    private void changeGUI() {
        int redC = 0, blueC = 0;
        for (Player r1 : r) {
            if (r1.getIsAlive() && r1.getTeam()) {
                blueC++;
            } else if (r1.getIsAlive() && !r1.getTeam()) {
                redC++;
            }
        }
        GUI.setText("<html><font color='red'>Red: " + redC + "</font> - <font color='blue'>Blue: " + blueC + "</font></html>");// label con due colori diversi
    }

    /**
     * metodo per controllare chi ha vinto
     */
    private void win() {
        Boolean bWin = true, rWin = true;
        for (Player r1 : r) {
            if (r1.isAlive && r1.getTeam()) {
                bWin = false;
            } else if (r1.isAlive && !r1.getTeam()) {
                rWin = false;
            }
        }
        if (bWin) {
            win.setForeground(Color.red);
            win.setText("Red Team WIN!!!");
        } else if (rWin) {
            win.setForeground(Color.blue);
            win.setText("Blue Team WIN!!!");
        }
    }

    /**
     * metodo per cambiare la direzione del player
     *
     * @param d, nuova direzione
     */
    public void changeDirection(int d) {
        direction = d;
    }

    /**
     * metodo get
     *
     * @return posizione X del player
     */
    public int getX() {
        return X;
    }

    /**
     * metodo get
     *
     * @return posizione Y del player
     */
    public int getY() {
        return Y;
    }

    /**
     * metodo get
     *
     * @return true se il player e' vivo, altrimenti false
     */
    private Boolean getIsAlive() {
        return isAlive;
    }

    /**
     * metodo get
     *
     * @return true se il player e' del team blue, altrimenti false se e' del
     * team rosso
     */
    private Boolean getTeam() {
        return team;
    }

}

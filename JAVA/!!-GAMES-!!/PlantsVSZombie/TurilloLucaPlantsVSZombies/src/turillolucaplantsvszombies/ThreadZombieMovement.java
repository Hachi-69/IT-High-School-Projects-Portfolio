package turillolucaplantsvszombies;

import java.util.Random;
import javax.swing.JLabel;

/*
 *
 * @author Turillo.Luca
 */
public class ThreadZombieMovement implements Runnable {

    private final JLabel zombie, position1, position2, position3, position4, position5;
    private final Integer name;
    private Integer time;

    public ThreadZombieMovement(JLabel zombie, Integer name, JLabel position1, JLabel position2, JLabel position3, JLabel position4, JLabel position5) {
        this.zombie = zombie;
        this.name = name;
        this.time = 0;
        this.position1 = position1;
        this.position2 = position2;
        this.position3 = position3;
        this.position4 = position4;
        this.position5 = position5;
    }

    @Override
    public void run() {
        Random rnd = new Random();
        while (zombie.getLocation().x > -zombie.getWidth()) {
            time++;
            if (!Main.getMenuOpen()) {
                /* MOVIMENTO DELLO ZOMBIE */
                zombie.setLocation(zombie.getLocation().x - rnd.nextInt(5), zombie.getLocation().y);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
        /* CONTROLLO DI ARRIVO */
        switch (name) {
            case 1:
                System.out.println(Main.getPosition() + " " + "Coby");
                leaderboard(400, 25);
                break;
            case 2:
                System.out.println(Main.getPosition() + " " + "Dustin");
                leaderboard(400, 50);
                break;
            case 3:
                System.out.println(Main.getPosition() + " " + "Jax");
                leaderboard(400, 30);
                break;
            case 4:
                System.out.println(Main.getPosition() + " " + "Seth");
                leaderboard(400, 30);
                break;
            case 5:
                System.out.println(Main.getPosition() + " " + "Zenith");
                leaderboard(400, 30);
                break;
        }
        Main.setExit(Main.getExit() + 1);
        if (Main.getExit() == 5) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            System.exit(0);
        }
    }

    public void leaderboard(Integer x, Integer y) {
        switch (Main.getPosition()) {
            case 1:
                position1.setLocation(x, zombie.getLocation().y + y);
                position1.setVisible(true);
                break;
            case 2:
                position2.setLocation(x, zombie.getLocation().y + y);
                position2.setVisible(true);
                break;
            case 3:
                position3.setLocation(x, zombie.getLocation().y + y);
                position3.setVisible(true);
                break;
            case 4:
                position4.setLocation(x, zombie.getLocation().y + y);
                position4.setVisible(true);
                break;
            case 5:
                position5.setLocation(x, zombie.getLocation().y + y);
                position5.setVisible(true);
                break;
        }
        Main.setPosition(Main.getPosition() + 1);
    }
}

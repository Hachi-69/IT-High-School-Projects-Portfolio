package turillolucaplantsvszombies;

import java.io.*;
import java.util.Random;
import javax.sound.sampled.*;
import javax.swing.JLabel;

/*
 *
 * @author Turillo.Luca
 */
public class ThreadClass implements Runnable {

    private final JLabel zombie, projectile, plant;
    private final Boolean plantCanShoot;
    private Boolean move, plantShootSFX, zombieEatPlantSFX, plantDestroyed;

    public ThreadClass(JLabel zombie, JLabel plant, JLabel projectile, Boolean plantCanShoot) {
        this.zombie = zombie;
        this.plant = plant;
        this.projectile = projectile;
        this.plantCanShoot = plantCanShoot;
        this.plantDestroyed = false;
        this.move = false;
        this.plantShootSFX = true;
        this.zombieEatPlantSFX = true;
    }

    Random rnd = new Random();

    @Override
    public void run() {
        while (zombie.getLocation().x >= 0) {
            if (plantCanShoot && !Main.getMenuOpen()) {
                projectile.setVisible(true);
                /* POSSIBILITA' DI SPARO DEL PROIETTILE */
                if (rnd.nextInt(100) == 1) {
                    move = true;
                }
                if (!plantDestroyed && move) {
                    /* MOVIMENTO DEL PROIETTILE */
                    projectile.setLocation(projectile.getLocation().x + 25, projectile.getLocation().y);
                    if (plantShootSFX) {
                        /* SFX */
                        try {
                            AudioInputStream plantShootSFXaudio = AudioSystem.getAudioInputStream(new File("plantShootSFX.wav"));
                            Clip plantShootSFXclip = AudioSystem.getClip();
                            plantShootSFXclip.open(plantShootSFXaudio);
                            plantShootSFXclip.start();
                        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
                        }
                        plantShootSFX = false;
                    }
                }
                /* CONTROLLO DEL PROIETTILE CHE COLPISCE LO ZOMBIE */
                if ((projectile.getLocation().x + 10 >= zombie.getLocation().x) && !plantDestroyed) {
                    zombie.setLocation(zombie.getLocation().x + 30, zombie.getLocation().y);
                    projectile.setLocation(plant.getLocation().x + 30, plant.getLocation().y + 30);
                    move = false;
                    plantShootSFX = true;
                    /* SFX */
                    try {
                        AudioInputStream zombieHittedSFXaudio = AudioSystem.getAudioInputStream(new File("zombieHittedSFX.wav"));
                        Clip zombieHittedSFXclip = AudioSystem.getClip();
                        zombieHittedSFXclip.open(zombieHittedSFXaudio);
                        zombieHittedSFXclip.start();
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
                    }
                }
                /* CONTROLLO DELLO ZOMBIE CHE MANGIA LA PIANTA */
                if ((plant.getLocation().x + 90 >= zombie.getLocation().x)) {
                    if (zombieEatPlantSFX) {
                        zombieEatPlantSFX = false;
                        /* SFX */
                        try {
                            AudioInputStream zombieEatPlantSFXaudio = AudioSystem.getAudioInputStream(new File("zombieEatPlantSFX.wav"));
                            Clip zombieEatPlantSFXclip = AudioSystem.getClip();
                            zombieEatPlantSFXclip.open(zombieEatPlantSFXaudio);
                            zombieEatPlantSFXclip.start();
                        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
                        }
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                    }
                    plant.setLocation(999, 999);
                    projectile.setLocation(999, 999);
                    plantDestroyed = true;
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
}

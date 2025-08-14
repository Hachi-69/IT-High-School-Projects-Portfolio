package turillolucaplantsvszombies;

import javax.swing.JLabel;

/**
 *
 * @author Turillo.Luca
 */
public class Plant {

    private JLabel imgPlant, imgProjectile;
    private Boolean plantCanShoot;

    public Plant(JLabel imgPlant, JLabel imgProjectile) {
        this.imgPlant = imgPlant;
        this.imgProjectile = imgProjectile;
        this.plantCanShoot = false;
    }

    public JLabel getImgPlant() {
        return imgPlant;
    }

    public void setImgPlant(JLabel imgPlant) {
        this.imgPlant = imgPlant;
    }

    public JLabel getImgProjectile() {
        return imgProjectile;
    }

    public void setImgProjectile(JLabel imgProjectile) {
        this.imgProjectile = imgProjectile;
    }

    public Boolean getPlantCanShoot() {
        return plantCanShoot;
    }

    public void setPlantCanShoot(Boolean PlantCanShoot) {
        this.plantCanShoot = PlantCanShoot;
    }

    @Override
    public String toString() {
        return "Plant{" + "imgPlant=" + imgPlant + ", imgProjectile=" + imgProjectile + ", PlantCanShoot=" + plantCanShoot + '}';
    }

}

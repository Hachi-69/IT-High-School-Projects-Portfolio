package turillolucaplantsvszombies;

/**
 *
 * @author Turillo.Luca
 */
public class Main {

    public static Boolean menuOpen = false;
    public static Integer position = 1;
    public static Integer exit = 0;

    public static void main(String[] args) {
        PlantvsZombieFrame frm = new PlantvsZombieFrame();
        frm.setVisible(true);
    }

    public static Integer getExit() {
        return exit;
    }

    public static void setExit(Integer exit) {
        Main.exit = exit;
    }

    public static Boolean getMenuOpen() {
        return menuOpen;
    }

    public static void setMenuOpen(Boolean menuOpen) {
        Main.menuOpen = menuOpen;
    }

    public static Integer getPosition() {
        return position;
    }

    public static void setPosition(Integer position) {
        Main.position = position;
    }

}

package turillolucaprocedureefunzioni;

import java.util.Scanner;

/**
 *
 * @author Turillo.Luca
 */

public class TurilloLucaProcedureEFunzioni {

    public static void main(String[] args) {

        //PRIMO TENTATIVO\\
        Scanner input = new Scanner(System.in);
        System.out.println("prima stringa: ");
        String primaStringa = input.next();
        System.out.println("seconda stringa: ");
        String secondaStringa = input.next();
        System.out.println("primo intero: ");
        Integer primoIntero = input.nextInt();
        System.out.println("terza stringa: ");
        String terzaStringa = input.next();
        System.out.println("secondo intero: ");
        Integer secondoIntero = input.nextInt();

        System.out.println(primaStringa + " " + secondaStringa + " " + primoIntero + " " + terzaStringa + " " + secondoIntero);

        //SECONDO TENTATIVO\\
//        Scanner input = new Scanner(System.in);
//        System.out.println("prima stringa: ");
//        String primaStringa = input.nextLine();
//        System.out.println("seconda stringa: ");
//        String secondaStringa = input.nextLine();
//        System.out.println("primo intero: ");
//        Integer primoIntero = input.nextInt();
//        System.out.println("terza stringa: ");
//        String terzaStringa = input.nextLine();
//        System.out.println("secondo intero: ");
//        Integer secondoIntero = input.nextInt();
//        
//        System.out.println(primaStringa+" "+secondaStringa+" "+primoIntero+" "+terzaStringa+" "+secondoIntero);
    }

}

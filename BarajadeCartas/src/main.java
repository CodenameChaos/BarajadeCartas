
/**
 *
 * @author Falivene
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.crearBaraja();
        System.out.print("\u001B[31m");
        System.out.println("Baraja creada y en orden");
        baraja.verBaraja();
        System.out.print("\u001B[32m");
        System.out.println("Baraja mesclada");
        baraja.barajar();
        baraja.verBaraja();
    }

}

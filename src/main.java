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
        baraja.barajar();
        
        baraja.cartasDisponibles();
    }
    
}
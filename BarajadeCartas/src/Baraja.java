
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Falivene
 */
public class Baraja {
    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        crearBaraja();
    }

    public void crearBaraja() {
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
//                    System.out.println(cartas.toString());
                }
            }
        }
    }
 public void barajar(){
     Collections.shuffle(cartas);
 }
 
}

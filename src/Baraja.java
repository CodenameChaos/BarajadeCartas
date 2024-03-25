
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Falivene
 */
public class Baraja {
    private List<Carta> cartas;
    private List<Carta>monton;
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
                   System.out.println(cartas.toString());
                }
            }
        }
    }
    
    public void barajar(){
        Collections.shuffle(cartas);
    }
    
    public void siguienteCarta(){
        Carta cart=cartas.get(cartas.size());
        monton.add(cart);
        cartas.remove(cart);
    }
    
    public void cartasDisponibles(){
        int cont=0;
            for (Carta carta : cartas) {
                cont++;
            }
        System.out.println("cantidad de cartas disponibles: "+cont);
    }
    
    public List<Carta> darCartas(int cant){
        if(cant>=cartas.size()){
            System.out.println("cartas a dar: "+cant);
                for (int i = 0; i < cant; i++) {
                    Carta var=cartas.get(cartas.size());
                    monton.add(var);
                    cartas.remove(var);
                
                }
        }
        return monton;
    }
    
}

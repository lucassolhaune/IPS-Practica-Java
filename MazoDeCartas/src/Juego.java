import cartas.Carta;
import cartas.Mazo;

public class Juego {
    public static void main(String[] args) {
        Mazo m = new Mazo();
        for(int i = 0; i < 49; i++) {
            Carta c1 = m.getCartaRandom();
            if(c1 != null) {
                System.out.println(c1);
            }
        }
        Carta c1 = m.getCartaRandom();
        Carta c2 = m.getCartaRandom();
        System.out.println(c1.equals(c2));
    }
}

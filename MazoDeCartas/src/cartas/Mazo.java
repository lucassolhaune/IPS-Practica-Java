package cartas;
public class Mazo {
    private Carta[] cartas;
    private int cant;
    public Mazo() {
        cant = 48;
        Carta [] cartas = new Carta[cant];
        int index = 0;
        for (Palo palo : Palo.values()) {
            for (Numero numero : Numero.values()) {
                cartas[index++] = new Carta(numero, palo);
           }
        }
    }
    public Carta getCartaRandom() {
        if (cant == 0) {
            return null;
        }
        int azar = (int) (Math.random() * cant--);
        Carta tmp = cartas[azar];
        cartas[azar] = cartas [cant];
        cartas[cant] = tmp;
        return tmp;
    }
}

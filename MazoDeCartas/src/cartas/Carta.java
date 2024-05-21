package cartas;

public class Carta {
    private Numero numero;
    private Palo palo;
    public Carta(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }
    @Override
    public String toString() {
        return numero + " DE " + palo;
    }
    @Override
    public boolean equals(Object c) {
        if (c == null) {
            return false;
        }
        if (c == this) {
            return true;
        }
        if (c instanceof Carta) {
            Carta tmp = (Carta) c;
            return palo.equals(tmp.palo) && numero.equals(tmp.numero);
        }
        return false;
    }
}

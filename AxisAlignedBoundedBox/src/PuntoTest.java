public class PuntoTest {
    public static void main (String [] args){
        Punto p1 = new Punto(49.0, 1.0);
        Punto p2 = new Punto(25.0, -9.0);
        Punto p3 = new Punto(0.0, 5.0);
        Punto p4 = new Punto(0.0, 0.0);
        p1.showPunto();
        p2.showPunto();
        System.out.println("Cuadrante de p1: " + p1.cuadrante());
        System.out.println("Cuadrante de p2: " + p2.cuadrante());
        System.out.println("Cuadrante de p3: " + p3.cuadrante());
        System.out.println("Cuadrante de p4: " + p4.cuadrante());
        System.out.println("Distancia entre p1 y p2: " + p1.distanciaXY(p1,p2));
    }
}

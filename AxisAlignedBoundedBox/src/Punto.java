public class Punto {
    private double x;
    private double y;
    public Punto(){
        this((1 + Math.random() *100) , (1 + Math.random() *100));
    }
    public Punto (double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distanciaXY(Punto a, Punto b) {
        return Math.sqrt((Math.pow((a.x - b.x),2) + (Math.pow((a.y - b.y),2))));
    }
    public int cuadrante() {
        if(x > 0) {
            if(y > 0)
                return 1;
            else if(y < 0)
                return 2;
            else {
                System.out.println("Esta sobre el Eje X");
                return 0;
            }
        } else if(x < 0) {
            if(y < 0)
                return 3;
            else if(y > 0)
                return 4;
            else {
                System.out.println("Esta sobre el Eje X");
                return 0;
            }
        } else {
            System.out.println("Esta sobre el Eje y");
            return 0;
        }
    }
    public void showPunto() {
        System.out.println("x: " + x + " y: " + y);
    }
    public boolean isPuntoMayor(Punto p) {
        if (p.x >= x) && (p.y >= y) {
            return true;
        }
    }
}
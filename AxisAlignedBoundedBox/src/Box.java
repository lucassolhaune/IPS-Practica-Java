public class Box {
    private Punto x1;
    private Punto y1;
    private Punto x2;
    private Punto y2;

    public Box(Punto x1, Punto y1, Punto x2, Punto y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public boolean isAHit(Box bala) {
        if(bala.x1 >= x1 && bala.x2 <= x2) {
            return true;
        } else if()
    }
    public Punto getMax() {
        return max;
    }

    public void setMax(Punto max) {
        this.max = max;
    }

    public Punto getMin() {
        return min;
    }

    public void setMin(Punto min) {
        this.min = min;
    }
}

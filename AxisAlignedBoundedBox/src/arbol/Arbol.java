package arbol;

public class Arbol {
    private int altura;
    private String nombre;
    public Arbol(int altura, String nombre){
        this.altura = altura;
        this.nombre = nombre;
    }
    public Arbol(){
    this (1, "pepe");
    }
    public void muestraArbol(){
        System.out.println(altura + nombre);
    }
}

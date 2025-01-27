package Ejercicios.Entidades;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {}

    public Cadena(String frase) {
        this.frase = frase;
        longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }


    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

}

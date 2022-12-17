package Proyect3Christopher;

public class NodoArbol {
    
    //Creamos las variables
    public String dato;
    public String genero;
    public NodoArbol Nododer, Nodoizq;
    
    //Creamos todos los constructores y los GETTER Y SETTERS
    public NodoArbol(String dato, String genero) {
        this.dato = dato;
        this.genero = genero;
        this.Nodoizq = null;
        this.Nododer = null;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoArbol getNodoizq() {
        return Nodoizq;
    }

    public void setNodoizq(NodoArbol Nodoizq) {
        this.Nodoizq = Nodoizq;
    }

    public NodoArbol getNododer() {
        return Nododer;
    }

    public void setNododer(NodoArbol Nododer) {
        this.Nododer = Nododer;
    }
}

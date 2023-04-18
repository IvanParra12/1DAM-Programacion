package daw.zoo;

import java.util.Objects;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public abstract class Animal {
    //ATRIBUTOS
    private String nombre;
    private int peso;
    private boolean encerrado;
    
    //CONSTRUCTOR
    public Animal(String n, int p){
        this.nombre = n;
        this.peso = p;
    }
    
    //GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public int getPeso() {
        return this.peso;
    }
    
    public boolean isEncerrado(){
        return this.encerrado;
    }
    
    //SETTERS
    void setEncerrado(boolean b){
        this.encerrado = b;
    }
    
    //METÓDOS ABSTRACTOS
    public abstract void emitirSonido();
    
    //HASHCODE
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + this.peso;
        hash = 97 * hash + (this.encerrado ? 1 : 0);
        return hash;
    }
    
    //EQUALS
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.peso != other.peso) {
            return false;
        }
        if (this.encerrado != other.encerrado) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + 
                ", peso=" + peso + " kg" +'}';
    }
    
    
    
    
    
}

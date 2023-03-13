package daw.empresa;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Trabajador {
    //ATRIBUTOS
    private String dni;
    private String nombre;
    protected int sueldo;
    
    //CONSTRUCTOR

    /**
     *
     * @param nombre El nombre del trabajador
     * @param sueldo El sueldo del trabajador
     * @param numDNI El numero del DNI del trabajador
     * @param letraDNI La letra del DNI del trabajador
     */
    public Trabajador(String nombre, int sueldo, int numDNI, char letraDNI) {
        String DNI = Integer.toString(numDNI) 
                + Character.toString(letraDNI);
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.dni = DNI;
    }
    
    //GETTERS

    /**
     *
     * @return Devuelve el DNI del trabajador
     */
    public String getDNI() {
        return this.dni;
    }

    /**
     *
     * @return Devuelve el nombre del trabajador
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @return Devuelve el sueldo del trabajador
     */
    public int getSueldo() {
        return this.sueldo;
    }

    @Override
    public String toString() {
        return "\nTrabajador{" + "DNI=" + this.dni 
                + "\nCon nombre=" + this.nombre 
                + "\nY un sueldo=" + this.sueldo + "€"+'}';
    }
    
    
    
}

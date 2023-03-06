package daw.sorteo;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Sorteo {
    //ATRIBUTOS
    private double dineroCupon;
    private int pagosRealizados;
    private int pagosPendientes;
    public int totalParticipantes;
    private double dineroRecogido;
    
    //CONSTRUCTOR POR DEFECTO
    public Sorteo(double dineroCupon, int totalPersonas) {
        
        this.dineroCupon = dineroCupon;
        this.totalParticipantes = totalPersonas;
    }
    //GETTERS
    public double getDineroRecogido() {
        return this.dineroRecogido;
    }
    
    public int getPagosRealizados() {
        return this.pagosRealizados;
    }

    public double getDineroCupon() {
        return this.dineroCupon;
    }

    public int getPagosPendientes() {
        return this.pagosPendientes;
    }

    public int getTotalParticipantes() {
        return this.totalParticipantes;
    }
    
    //SETTERS
    public void registrarPago() {
        
        Sorteo s = new Sorteo(5, 1);
        this.dineroRecogido += s.dineroCupon;
        if(this.getPagosPendientes() <= 0) {
            this.pagosPendientes = 0;
        } else {
            this.pagosPendientes -= s.totalParticipantes;
        }
        this.pagosRealizados = s.totalParticipantes;
    }
    
    public void apuntarNuevoParticipante() {
        
        this.totalParticipantes++;
        this.pagosPendientes++;
    }

    @Override
    public String toString() {
        return "Sorteo{" + "dineroCupon=" + dineroCupon 
                + "\nPagosRealizados=" + pagosRealizados 
                + "\nPagosPendientes=" + pagosPendientes 
                + "\nTotalParticipantes=" + totalParticipantes 
                + "\nDineroRecogido=" + dineroRecogido + '}';
    }
    
}

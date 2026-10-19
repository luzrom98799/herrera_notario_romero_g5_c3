package ar.edu.ungs.prog2;
import java.time.LocalDateTime;
public class Monitoreo {
    protected LocalDateTime fechaHora;
    protected int totalEnergiaGenHora;
    protected int cantIncidentesPorPeriodo;
    

    public Monitoreo(LocalDateTime fechaHora, int totalEnergiaGenHora, int cantIncidentesPorPeriodo) {
        this.fechaHora = fechaHora;
        this.totalEnergiaGenHora = totalEnergiaGenHora;
        this.cantIncidentesPorPeriodo = cantIncidentesPorPeriodo;
    }
    
    public LocalDateTime consultarFechaHora() {
        return null; 
    }
    
    public double consultarEnergiaGenerada() {
        return 0.0; 
    }
    
    public int consultarIncidentes() {
        return 0;
    }
    
    public boolean sinDatos() {
        return false;
    }
    
    @Override
    public String toString() {
        return "";
    }
}


package ar.edu.ungs.prog2;

public class Monitoreo {
    protected Fecha fechaHora;
    protected int totalEnergiaGenHora;
    protected int cantIncidentesPorPeriodo;
    

    public Monitoreo(Fecha fechaHora, int totalEnergiaGenHora, int cantIncidentesPorPeriodo) {
        this.fechaHora = fechaHora;
        this.totalEnergiaGenHora = totalEnergiaGenHora;
        this.cantIncidentesPorPeriodo = cantIncidentesPorPeriodo;
    }
    
    public Fecha consultarFechaHora() {
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


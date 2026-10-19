package ar.edu.ungs.prog2;
import java.time.LocalDateTime;

public class Monitoreo {
	private Planta planta; 
    protected LocalDateTime fechaHora;
    protected int totalEnergiaGenHora;
    protected int cantIncidentesPorPeriodo;
    

    public Monitoreo(Planta planta, LocalDateTime fechaHora, int totalEnergiaGenHora, int cantIncidentesPorPeriodo) {
        this.planta = planta; 
    	this.fechaHora = fechaHora;
        this.totalEnergiaGenHora = totalEnergiaGenHora;
        this.cantIncidentesPorPeriodo = cantIncidentesPorPeriodo; 
        
        if(planta == null || fechaHora == null) {
        	throw new IllegalArgumentException("La planta y la fecha no pueden ser nulas"); 
        }
        
        if(totalEnergiaGenHora < 0 || cantIncidentesPorPeriodo < 0) {
        	throw new IllegalArgumentException("La energia y las incidencias no pueden ser negativas"); 
        }
    }
    
    public LocalDateTime consultarFechaHora() {
        return fechaHora;  
    }
    
    public double consultarEnergiaGenerada() {
        return totalEnergiaGenHora;  
    }
    
    public int consultarIncidentes() {
        return cantIncidentesPorPeriodo; 
    }
    
    public boolean sinDatos() {
        return totalEnergiaGenHora == 0 && cantIncidentesPorPeriodo == 0;
    }
    
    boolean correspondeA(Planta planta) {
    	return this.planta == planta; 
    }
    
    //Permite mostrar la informacion de la forma solicitada 
    @Override
    public String toString() {
    	StringBuilder texto = new StringBuilder(); 
    	
    	texto.append("Fecha y Hora: ").append(fechaHora); 
    	texto.append(" , energia generada: ").append(totalEnergiaGenHora); 
    	texto.append(", incidencias: ").append(cantIncidentesPorPeriodo); 
    	
        return texto.toString(); 
    }
}


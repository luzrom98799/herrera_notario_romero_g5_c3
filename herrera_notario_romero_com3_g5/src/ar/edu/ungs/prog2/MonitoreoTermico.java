package ar.edu.ungs.prog2;
import java.time.LocalDateTime;

public class MonitoreoTermico extends Monitoreo {
    private double cantidadDeCO2Generado;
    private double cantDeCombustible;

    public MonitoreoTermico(Planta planta, LocalDateTime fechaHora, int totalEnergiaGenHora, int cantIncidentesPorPeriodo, 
                            double cantidadDeCO2Generado, double cantDeCombustible) {
        super(planta, fechaHora, totalEnergiaGenHora, cantIncidentesPorPeriodo);
        
        if(cantidadDeCO2Generado < 0 || cantDeCombustible < 0) {
        	throw new IllegalArgumentException("El CO2 y el combustible no pueden ser negativos"); 
        }
        
        this.cantidadDeCO2Generado = cantidadDeCO2Generado;
        this.cantDeCombustible = cantDeCombustible;
    }
    
    public double consultarCO2Generado() {
        return cantidadDeCO2Generado;
    }

    public double consultarCombustibleUtilizado() {
        return cantDeCombustible;
    }

    //Imprime la informacion con un determinado formato
    @Override
    public String toString() {
    	StringBuilder texto = new StringBuilder(super.toString()); 
    	
    	texto.append(", CO2 generado: "); 
    	texto.append(cantidadDeCO2Generado); 
    	
    	texto.append(", combustible utilizado: "); 
    	texto.append(cantDeCombustible); 
    	
        return texto.toString(); 
    }
}

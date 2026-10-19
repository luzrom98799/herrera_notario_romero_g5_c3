package ar.edu.ungs.prog2;
import java.time.LocalDateTime;

public class MonitoreoEolico extends Monitoreo {
 
    private double velocidadDelVientoPromedio;


    public MonitoreoEolico(Planta planta, LocalDateTime fechaHora, int totalEnergiaGenHora, int cantIncidentesPorPeriodo, 
                           double velocidadDelVientoPromedio) {
        super(planta, fechaHora, totalEnergiaGenHora, cantIncidentesPorPeriodo);
        this.velocidadDelVientoPromedio = velocidadDelVientoPromedio;
        if(velocidadDelVientoPromedio < 0) {
        	throw new IllegalArgumentException("La velocidad del viento no puede ser negativa"); 
        }
    }

    public double consultarVelocidadDelVientoPromedio() {
        return velocidadDelVientoPromedio;
    }
    
    //Imprime la informacion como se la desea  
    @Override
    public String toString() {
    	StringBuilder texto = new StringBuilder(super.toString()); 
    	
    	texto.append(", velocidad promedio del viento: "); 
    	texto.append(velocidadDelVientoPromedio); 
    	texto.append(" m/s"); 
    	
        return texto.toString(); 
    }
}


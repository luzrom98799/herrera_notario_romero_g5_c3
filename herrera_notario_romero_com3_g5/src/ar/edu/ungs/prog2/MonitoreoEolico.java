package ar.edu.ungs.prog2;
import java.time.LocalDateTime;
public class MonitoreoEolico extends Monitoreo {
 
    private double velocidadDelVientoPromedio;


    public MonitoreoEolico(LocalDateTime fechaHora, int totalEnergiaGenHora, int cantIncidentesPorPeriodo, 
                           double velocidadDelVientoPromedio) {
        super(fechaHora, totalEnergiaGenHora, cantIncidentesPorPeriodo);
        this.velocidadDelVientoPromedio = velocidadDelVientoPromedio;
    }

    public double consultarVelocidadDelVientoPromedio() {
        return velocidadDelVientoPromedio;
    }

    @Override
    public String toString() {
        return super.toString() + "";
    }
}


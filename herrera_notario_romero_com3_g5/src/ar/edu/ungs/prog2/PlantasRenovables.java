package ar.edu.ungs.prog2;
import java.time.LocalDateTime;
public abstract class PlantasRenovables extends Planta {
	private String fuentePrimaria;
    private double eficienciaPromedio;

    public PlantasRenovables(double capacidadMax, String direccion, String nombre, boolean activaEstado, String fuentePrimaria, double eficienciaPromedio) {
        super(capacidadMax, direccion, nombre, activaEstado);
        this.eficienciaPromedio = eficienciaPromedio;
        this.fuentePrimaria = fuentePrimaria;
    }

    
    protected abstract void actualizarEstado();
    protected abstract boolean cumpleCuota();
    protected abstract double capacidadMinimaCuota();
    
    protected abstract int totalGenerado();
    protected abstract void registrarMonitoreo();
    protected abstract boolean estuvoInactivaEn(LocalDateTime fechaHoraPuestaEnFuncionamiento);
    protected abstract int limpiarRegistrosSinDatos();

    @Override
    public abstract String toString();
    
}
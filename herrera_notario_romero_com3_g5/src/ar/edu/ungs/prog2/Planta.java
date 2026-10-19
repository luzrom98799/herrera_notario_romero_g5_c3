package ar.edu.ungs.prog2;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public abstract class Planta {
    protected double capacidadMax;
    protected String direccion;
    protected String nombre;
    protected List<Monitoreo> registro;
    protected boolean activaEstado;
    protected LocalDateTime fechaHoraPuestaEnFuncionamiento; // Nota: Si es FechaHora, considera ajustar el tipo
    protected List<PeriodoInactividad> periodosInactivos;

    public Planta(double capacidadMax, String direccion, String nombre, boolean activaEstado) {
        this.capacidadMax = capacidadMax;
        this.direccion = direccion;
        this.nombre = nombre;
        this.activaEstado = activaEstado;
        this.registro = new ArrayList<>();
        this.periodosInactivos = new ArrayList<>();
    }
    
    String DataDePlantas() {
        String estadoDePlaantaString = this.activaEstado ? "ACTIVA" : "INACTIVA";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        String fechaExacta = this.fechaHoraPuestaEnFuncionamiento.format(formato);
        return this.nombre + " (" + estadoDePlaantaString + "): " + fechaExacta;
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

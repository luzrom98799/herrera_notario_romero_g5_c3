package ar.edu.ungs.prog2;
import java.time.LocalDateTime;
public class PeriodoInactividad {
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public PeriodoInactividad(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Comprueba si una fecha pertenece a este período
    public boolean contiene(LocalDateTime fechaHora) {

        if (fechaHora == null) {
            return false;
        }

        boolean despuesDelInicio = !fechaHora.isBefore(fechaInicio);

        boolean antesDelFin = fechaFin == null || fechaHora.isBefore(fechaFin);

        return despuesDelInicio && antesDelFin;
    }

    
    // Cierra el período cuando la planta vuelve a activarse
    public void cerrarPeriodo(LocalDateTime fechaFin) {

        if (fechaFin == null || !fechaFin.isAfter(fechaInicio)|| this.fechaFin != null) {
            throw new RuntimeException("Fecha de cierre inválida");
        }

        this.fechaFin = fechaFin;
    }
    
    public boolean permiteNuevoPeriodo(LocalDateTime fechaHora) {
        return fechaHora != null && fechaFin != null && !fechaHora.isBefore(fechaFin);
    }
    

    public LocalDateTime consultarFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime consultarFechaFin() {
        return fechaFin;
    }

    @Override
    public String toString() {
        return "Inactiva desde: " + fechaInicio + " hasta: " + fechaFin;
    }
}


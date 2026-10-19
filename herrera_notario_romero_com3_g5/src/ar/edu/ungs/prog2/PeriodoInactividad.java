package ar.edu.ungs.prog2;
import java.time.LocalDateTime;
public class PeriodoInactividad {
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public PeriodoInactividad(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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


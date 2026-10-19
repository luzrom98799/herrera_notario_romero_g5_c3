package ar.edu.ungs.prog2;

public class PeriodoInactividad {
    private Fecha fechaInicio;
    private Fecha fechaFin;

    public PeriodoInactividad(Fecha fechaInicio, Fecha fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }


    public Fecha consultarFechaInicio() {
        return fechaInicio;
    }

    public Fecha consultarFechaFin() {
        return fechaFin;
    }

    @Override
    public String toString() {
        return "Inactiva desde: " + fechaInicio + " hasta: " + fechaFin;
    }
}


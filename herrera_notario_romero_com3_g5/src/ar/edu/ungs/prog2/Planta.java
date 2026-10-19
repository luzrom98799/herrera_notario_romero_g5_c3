package ar.edu.ungs.prog2;

import java.util.ArrayList;
import java.util.List;

public abstract class Planta {
    protected double capacidadMax;
    protected String direccion;
    protected String nombre;
    protected List<Monitoreo> registro;
    protected boolean activaEstado;
    protected Fecha fechaHoraPuestEnFuncionamiento; // Nota: Si es FechaHora, considera ajustar el tipo
    protected List<PeriodoInactividad> periodosInactivos;

    public Planta(double capacidadMax, String direccion, String nombre, boolean activaEstado) {
        this.capacidadMax = capacidadMax;
        this.direccion = direccion;
        this.nombre = nombre;
        this.activaEstado = activaEstado;
        this.registro = new ArrayList<>();
        this.periodosInactivos = new ArrayList<>();
    }

    protected abstract void actualizarEstado();
    protected abstract boolean cumpleCuota();
    protected abstract double capacidadMinimaCuota();
    protected abstract int totalGenerado();
    protected abstract void registrarMonitoreo();
    protected abstract boolean estuvoInactivaEn(Fecha fechaHoaPuestaEnFuncionamiento);
    protected abstract int limpiarRegistrosSinDatos();

    @Override
    public abstract String toString();
}

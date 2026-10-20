package ar.edu.ungs.prog2;

import java.time.LocalDateTime;

public abstract class PlantasRenovables extends Planta {

    private String fuentePrimaria;
    private double eficienciaPromedio;

    public PlantasRenovables(double capacidadMax, String direccion, String nombre, boolean activaEstado, LocalDateTime fechaHoraPuestaEnFuncionamiento,
                            String fuentePrimaria,
                            double eficienciaPromedio) {

        super(capacidadMax, direccion, nombre,
              activaEstado, fechaHoraPuestaEnFuncionamiento);

        this.eficienciaPromedio = eficienciaPromedio;
        this.fuentePrimaria = fuentePrimaria;
    }
    //no volver a agregar actualizarEstado(), cumpleCuota() ni capacidadMinimaCuota() porque los hereda de Planta.

    // Cálculo compartido por las plantas renovables
    protected double calcularCuotaRenovable() {
        return capacidadMaximaParaCalculo() * eficienciaPromedio;
    }

    // Permite comprobar la fuente sin exponer el atributo
    public boolean usaFuentePrimaria(String fuente) {
        return fuente != null
                && fuentePrimaria.equalsIgnoreCase(fuente);
    }

	public String consultarFuentePrimaria() {
	    return fuentePrimaria;
	}

    @Override
    public abstract String toString();
}

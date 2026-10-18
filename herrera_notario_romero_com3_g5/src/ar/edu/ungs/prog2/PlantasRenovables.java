package ar.edu.ungs.prog2;

public abstract class PlantasRenovables extends Planta {
	private String fuentePrimaria;
    private double eficienciaPromedio;

    public PlantasRenovables(double capacidadMax, String direccion, String nombre, boolean activaEstado, String fuentePrimaria, double eficienciaPromedio) {
		super(capacidadMax, direccion, nombre, activaEstado);
		// TODO Auto-generated constructor stub
		this.eficienciaPromedio =eficienciaPromedio;
		this.fuentePrimaria= fuentePrimaria;
	}

    
    protected abstract void actualizarEstado();
    protected abstract boolean cumpleCuota();
    protected abstract double capacidadMinimaCuota();
    
    
    
}
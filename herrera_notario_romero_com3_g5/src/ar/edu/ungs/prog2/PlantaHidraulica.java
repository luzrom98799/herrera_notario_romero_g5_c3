package ar.edu.ungs.prog2;
import java.time.LocalDateTime;
public class PlantaHidraulica extends PlantasRenovables {
    private int cantidadTurbinas;
    private double capacidadEmbalse;

    
    public PlantaHidraulica(double capacidadMax, String direccion, String nombre, boolean activaEstado, 
                            String fuentePrimaria, double eficienciaPromedio, 
                            int cantidadTurbinas, double capacidadEmbalse) {
    	
        super(capacidadMax, direccion, nombre, activaEstado, fuentePrimaria, eficienciaPromedio);
        
 
        this.cantidadTurbinas = cantidadTurbinas;
        this.capacidadEmbalse = capacidadEmbalse;
    }

    public boolean cumpleCuota(int capacidadMaxima, int eficienciaPromedio) {

        return false;
    }
    
	@Override
	protected void actualizarEstado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean cumpleCuota() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected double capacidadMinimaCuota() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int totalGenerado() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void registrarMonitoreo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean estuvoInactivaEn(LocalDateTime fechaHoaPuestaEnFuncionamiento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected int limpiarRegistrosSinDatos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

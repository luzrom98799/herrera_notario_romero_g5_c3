package ar.edu.ungs.prog2;

public class PlantaTermica extends Planta {
	private String tipoCombustible;
	private int cantidadDeEmisionesDeCO2;
    public PlantaTermica(double capacidadMax, String direccion, String nombre, boolean activaEstado, 
            String tipoCombustible, int cantidadDeEmisionesDeCO2) {

    	super(capacidadMax, direccion, nombre, activaEstado);


         this.tipoCombustible = tipoCombustible;
         this.cantidadDeEmisionesDeCO2 = cantidadDeEmisionesDeCO2;
}
    public boolean cumpleCuota(int capacidadMaxima, int cantidadDeEmisionesDeCo2) {

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
	protected boolean estuvoInactivaEn(Fecha fechaHoaPuestaEnFuncionamiento) {
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
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCantidadDeEmisionesDeCO2() {
        return cantidadDeEmisionesDeCO2;
    }

    public void setCantidadDeEmisionesDeCO2(int cantidadDeEmisionesDeCO2) {
        this.cantidadDeEmisionesDeCO2 = cantidadDeEmisionesDeCO2;
    }


	
}

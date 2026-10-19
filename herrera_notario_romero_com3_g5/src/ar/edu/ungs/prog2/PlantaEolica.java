package ar.edu.ungs.prog2;

public class PlantaEolica extends PlantasRenovables {
    
    private int cantidadDeAerogeneradores;
    private int alturaDeLasTorres;
    private int velocidadMinDeVientoNecesaria;
    public PlantaEolica(double capacidadMax, String direccion, String nombre, boolean activaEstado, 
            String fuentePrimaria, double eficienciaPromedio, 
            int cantidadDeAerogeneradores, int alturaDeLasTorres, 
            int velocidadMinDeVientoNecesaria) {

          super(capacidadMax, direccion, nombre, activaEstado, fuentePrimaria, eficienciaPromedio);

            this.cantidadDeAerogeneradores = cantidadDeAerogeneradores;
            this.alturaDeLasTorres = alturaDeLasTorres;
            this.velocidadMinDeVientoNecesaria = velocidadMinDeVientoNecesaria;
            
            
}
    //aca utilizaremos sobrecarga. es un metodo especifico de plantaeolica
    public boolean cumpleCuota(int capacidadMaxima, int eficienciaPromedio) {
        //  lógica de cumplecuota
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
	@Override
	protected boolean estuvoInactivaEn(Fecha fechaHoaPuestaEnFuncionamiento) {
		// TODO Auto-generated method stub
		return false;
	}
    

}

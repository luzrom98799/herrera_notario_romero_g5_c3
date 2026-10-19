package ar.edu.ungs.prog2;
import java.time.LocalDateTime;
public class PlantaSolar extends PlantasRenovables {
    private double superficieCubierta;
    private int cantidadDePaneles;
    private double horasDeRadiacionDiaria;
    
    public PlantaSolar(double capacidadMax, String direccion, String nombre, boolean activaEstado, 
                       String fuentePrimaria, double eficienciaPromedio, double superficieCubierta, 
                       int cantidadDePaneles, double horasDeRadiacionDiaria) {
        

        super(capacidadMax, direccion, nombre, activaEstado, fuentePrimaria, eficienciaPromedio);
        

        this.superficieCubierta = superficieCubierta;
        this.cantidadDePaneles = cantidadDePaneles;
        this.horasDeRadiacionDiaria = horasDeRadiacionDiaria;
    }


    @Override
    protected boolean cumpleCuota() {
        return false;
    }

    @Override
    protected void actualizarEstado() {
        // TODO Auto-generated method stub
    }

    @Override
    protected double capacidadMinimaCuota() {
        // TODO Auto-generated method stub
        return 0.0;
    }

    @Override
    protected int totalGenerado() {
        return 0;
    }

    @Override
    protected void registrarMonitoreo() {
    }

    @Override
    protected boolean estuvoInactivaEn(LocalDateTime fechaHoraPuestaEnFuncionamiento) {
        return false;
    }

    @Override
    protected int limpiarRegistrosSinDatos() {
        return 0;
    }

    @Override
    public String toString() {
        return "PlantaSolar [Nombre=" + nombre + ", Paneles=" + cantidadDePaneles + ", Superficie=" + superficieCubierta + "m²]";
    }

}



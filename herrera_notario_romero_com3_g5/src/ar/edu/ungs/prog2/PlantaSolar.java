package ar.edu.ungs.prog2;

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
    protected boolean estuvoInactivaEn(Fecha fechaHora) {
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
// getter y stters
    public double getSuperficieCubierta() {
        return superficieCubierta;
    }

    public void setSuperficieCubierta(double superficieCubierta) {
        this.superficieCubierta = superficieCubierta;
    }

    public int getCantidadDePaneles() {
        return cantidadDePaneles;
    }

    public void setCantidadDePaneles(int cantidadDePaneles) {
        this.cantidadDePaneles = cantidadDePaneles;
    }

    public double getHorasDeRadiacionDiaria() {
        return horasDeRadiacionDiaria;
    }

    public void setHorasDeRadiacionDiaria(double horasDeRadiacionDiaria) {
        this.horasDeRadiacionDiaria = horasDeRadiacionDiaria;
    }
}



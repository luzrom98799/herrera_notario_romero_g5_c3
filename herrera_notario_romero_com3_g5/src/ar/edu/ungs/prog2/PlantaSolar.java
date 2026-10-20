package ar.edu.ungs.prog2;
import java.time.LocalDateTime;
public class PlantaSolar extends PlantasRenovables {
    private double superficieCubierta;
    private int cantidadDePaneles;
    private double horasDeRadiacionDiaria;
    
    public PlantaSolar(double capacidadMax, String direccion, String nombre, boolean activaEstado,
            LocalDateTime fechaHoraPuestaEnFuncionamiento, String fuentePrimaria, double eficienciaPromedio,
            double superficieCubierta, int cantidadDePaneles, double horasDeRadiacionDiaria) {

        super(capacidadMax, direccion, nombre, activaEstado, fechaHoraPuestaEnFuncionamiento, fuentePrimaria, eficienciaPromedio);
        

        this.superficieCubierta = superficieCubierta;
        this.cantidadDePaneles = cantidadDePaneles;
        this.horasDeRadiacionDiaria = horasDeRadiacionDiaria;
    }


    @Override
    public double capacidadMinimaCuota() {
        return calcularCuotaRenovable()
                * horasDeRadiacionDiaria / 24.0;
    }

    @Override
    public boolean cumpleCuota(Monitoreo monitoreo) {
        return monitoreo != null
                && monitoreo.correspondeA(this)
                && monitoreo.consultarEnergiaGenerada()
                        >= capacidadMinimaCuota();
    }


    @Override
    public String toString() {
        return "Planta solar: " + DataDePlantas() + ", paneles: " + cantidadDePaneles + ", superficie: " + superficieCubierta + " m²"
                + ", horas de radiación diaria: " + horasDeRadiacionDiaria;
    }
}



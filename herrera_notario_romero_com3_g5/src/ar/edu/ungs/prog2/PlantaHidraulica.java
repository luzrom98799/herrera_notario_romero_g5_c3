package ar.edu.ungs.prog2;
import java.time.LocalDateTime;
public class PlantaHidraulica extends PlantasRenovables {
    private int cantidadTurbinas;
    private double capacidadEmbalse;

    
    public PlantaHidraulica(double capacidadMax, String direccion,
            String nombre, boolean activaEstado,
            LocalDateTime fechaHoraPuestaEnFuncionamiento,
            String fuentePrimaria, double eficienciaPromedio,
            int cantidadTurbinas, double capacidadEmbalse) {

        super(capacidadMax, direccion, nombre, activaEstado,
                fechaHoraPuestaEnFuncionamiento,
                fuentePrimaria, eficienciaPromedio);

        this.cantidadTurbinas = cantidadTurbinas;
        this.capacidadEmbalse = capacidadEmbalse;
    }

    @Override
    public double capacidadMinimaCuota() {
        return calcularCuotaRenovable();
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
        return "Planta hidráulica: " + DataDePlantas()
                + ", turbinas: " + cantidadTurbinas
                + ", capacidad de embalse: " + capacidadEmbalse;
    }
}
    
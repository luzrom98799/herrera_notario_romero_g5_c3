package ar.edu.ungs.prog2;

import java.time.LocalDateTime;

public class PlantaTermica extends Planta {

    private String tipoCombustible;
    private double objetivoEmisionesCo2PorHora;
    private double capacidadAlmacenamientoCombustible;

    public PlantaTermica(double capacidadMax, String direccion, String nombre, boolean activaEstado, LocalDateTime fechaHoraPuestaEnFuncionamiento,
            String tipoCombustible, double objetivoEmisionesCo2PorHora, double capacidadAlmacenamientoCombustible) {

        super(capacidadMax, direccion, nombre, activaEstado, fechaHoraPuestaEnFuncionamiento);

        this.tipoCombustible = tipoCombustible;
        this.objetivoEmisionesCo2PorHora = objetivoEmisionesCo2PorHora;
        this.capacidadAlmacenamientoCombustible = capacidadAlmacenamientoCombustible;
    }

    @Override
    public double capacidadMinimaCuota() {
        return capacidadMaximaParaCalculo() / 2.0;
    }

    @Override
    public boolean cumpleCuota(Monitoreo monitoreo) {
        if (!(monitoreo instanceof MonitoreoTermico)
                || !monitoreo.correspondeA(this)) {
            return false;
        }

        MonitoreoTermico termico = (MonitoreoTermico) monitoreo;

        return termico.consultarEnergiaGenerada() >= capacidadMinimaCuota()
        		&& termico.consultarCO2Generado() < objetivoEmisionesCo2PorHora;
    }

    @Override
    public String toString() {
        return "Planta térmica: " + DataDePlantas()
                + ", combustible: " + tipoCombustible
                + ", objetivo de emisiones CO2: "
                + objetivoEmisionesCo2PorHora
                + ", capacidad de almacenamiento: "
                + capacidadAlmacenamientoCombustible;
    }
}

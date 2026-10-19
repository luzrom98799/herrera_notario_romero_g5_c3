package ar.edu.ungs.prog2;

public class MonitoreoTermico extends Monitoreo {
    private double cantidadDeCO2Generado;
    private double cantDeCombustible;

    public MonitoreoTermico(Fecha fechaHora, int totalEnergiaGenHora, int cantIncidentesPorPeriodo, 
                            double cantidadDeCO2Generado, double cantDeCombustible) {
        super(fechaHora, totalEnergiaGenHora, cantIncidentesPorPeriodo);
        this.cantidadDeCO2Generado = cantidadDeCO2Generado;
        this.cantDeCombustible = cantDeCombustible;
    }
    
    public double consultarCO2Generado() {
        return cantidadDeCO2Generado;
    }

    public double consultarCombustibleUtilizado() {
        return cantDeCombustible;
    }

    @Override
    public String toString() {
        return super.toString() + "";
    }
}

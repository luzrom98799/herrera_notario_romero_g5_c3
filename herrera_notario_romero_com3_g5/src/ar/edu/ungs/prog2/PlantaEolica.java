package ar.edu.ungs.prog2;

import java.time.LocalDateTime;

public class PlantaEolica extends PlantasRenovables {

    private int cantidadDeAerogeneradores;
    private double alturaDeLasTorres;
    private double velocidadMinDeVientoNecesaria;

    public PlantaEolica(double capacidadMax, String direccion,
            String nombre, boolean activaEstado,
            LocalDateTime fechaHoraPuestaEnFuncionamiento,
            String fuentePrimaria, double eficienciaPromedio,
            int cantidadDeAerogeneradores,
            double alturaDeLasTorres,
            double velocidadMinDeVientoNecesaria) {

        super(capacidadMax, direccion, nombre, activaEstado,
                fechaHoraPuestaEnFuncionamiento,
                fuentePrimaria, eficienciaPromedio);

        this.cantidadDeAerogeneradores = cantidadDeAerogeneradores;
        this.alturaDeLasTorres = alturaDeLasTorres;
        this.velocidadMinDeVientoNecesaria =
                velocidadMinDeVientoNecesaria;
    }

    @Override
    public double capacidadMinimaCuota() {
        return calcularCuotaRenovable();
    }

    @Override
    public boolean cumpleCuota(Monitoreo monitoreo) { //verifica que el monitoreo sea eólico, corresponda a esta planta y que la energía generada alcance la cuota.
        return monitoreo instanceof MonitoreoEolico
                && monitoreo.correspondeA(this)
                && monitoreo.consultarEnergiaGenerada()
                        >= capacidadMinimaCuota();
    }

	public String horasSinVelocidadMinima() {
	
	    boolean[] horasConVientoBajo = new boolean[24];
	    boolean[] horasConVientoSuficiente = new boolean[24];
	
	    recorrerMonitoreosEolicos(horasConVientoBajo, horasConVientoSuficiente, velocidadMinDeVientoNecesaria );
	
	    StringBuilder resultado = new StringBuilder();
	
	    for (int hora = 0; hora < 24; hora++) {
	
	        if (horasConVientoBajo[hora] && !horasConVientoSuficiente[hora]) {
	
	            if (resultado.length() > 0) {
	                resultado.append(", ");
	            }
	
	            if (hora < 10) {
	                resultado.append("0");
	            }
	
	            resultado.append(hora);
	        }
	    }
	
	    return resultado.toString();
	}


    @Override
    public String toString() {
        return "Planta eólica: "
                + DataDePlantas()
                + ", aerogeneradores: " + cantidadDeAerogeneradores
                + ", altura de torres: " + alturaDeLasTorres
                + ", velocidad mínima de viento: "
                + velocidadMinDeVientoNecesaria;
    }
}

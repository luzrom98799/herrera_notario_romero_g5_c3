package ar.edu.ungs.prog2;
import java.time.format.DateTimeFormatter;
import java.util.Iterator; 
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public abstract class Planta {
    protected double capacidadMax;
    protected String direccion;
    protected String nombre;
    protected List<Monitoreo> registro;
    protected boolean activaEstado;
    protected LocalDateTime fechaHoraPuestaEnFuncionamiento; // Nota: Si es FechaHora, considera ajustar el tipo
    protected List<PeriodoInactividad> periodosInactivos;

    public Planta(double capacidadMax, String direccion, String nombre, boolean activaEstado) {
        this.capacidadMax = capacidadMax;
        this.direccion = direccion;
        this.nombre = nombre;
        this.activaEstado = activaEstado;
        this.registro = new ArrayList<>();
        this.periodosInactivos = new ArrayList<>();
    }
    
    String DataDePlantas() {
    	//este es el metodo creado para llamar en consultar planta en smartgrids
        String estadoDePlaantaString = this.activaEstado ? "ACTIVA" : "INACTIVA";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        String fechaExacta = this.fechaHoraPuestaEnFuncionamiento.format(formato);
        return this.nombre + " (" + estadoDePlaantaString + "): " + fechaExacta;
    }
    
    protected abstract void actualizarEstado();
    protected abstract boolean cumpleCuota();
    protected abstract double capacidadMinimaCuota();
//    protected abstract int totalGenerado();
    protected abstract void registrarMonitoreo();
    protected abstract boolean estuvoInactivaEn(LocalDateTime fechaHoraPuestaEnFuncionamiento);
//    protected abstract int limpiarRegistrosSinDatos();
    
    //Permite registrar un monitoreo a cada planta 
    public boolean registrarMonitoreo(Monitoreo m) {
    	if(m == null || !m.correspondeA(this)) {
    		return false; 
    	}
    	if(!estaActiva() || estuvoInactivaEn(m.consultarFechaHora())) {
    		return false; 
    	}
    	registro.add(m); 
    	return true; 
    }
    
    //Requerimiento 11: Elimina los monitoreos cuya energia e incidencias sean 0 
    public int limpiarRegistrosSinDatos() {
    	int eliminados = 0; 
    	Iterator<Monitoreo> iterador = registro.iterator(); 
    	
    	while(iterador.hasNext()) {
    		Monitoreo m = iterador.next(); 
    		
    		if(m.sinDatos()) {
    			iterador.remove();
    			eliminados++; 
    		}
    	}
    	return eliminados; 
    }
    
    //Recorre todos los monitoreos registrados en esa planta y suma la energia generada de cada uno
    public double totalGenerado() {
    	double total = 0; 
    	for(Monitoreo m : registro) {
    		total += m.consultarEnergiaGenerada(); 
    	}
    	return total; 
    }
    
    public boolean estaActiva() {
    	return activaEstado; 
    }

    @Override
    public abstract String toString();
}

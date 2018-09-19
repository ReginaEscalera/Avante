
public class Proyecto {
	String nombre;
	String presupuesto;
	String fechaInicio;
	String fechaFin;
	public Proyecto() {
		super();
	}
	public Proyecto(String nombre, String presupuesto, String fechaInicio, String fechaFin) {
		super();
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(String presupuesto) {
		this.presupuesto = presupuesto;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	@Override
	public String toString() {
		return ""+getNombre();
	}
}

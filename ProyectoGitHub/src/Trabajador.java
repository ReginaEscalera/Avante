
public class Trabajador{
	private String DNI;
	private String nombre;
	private String apellido;
	private String genero;
	
	public Trabajador() {
		super();
	}

	public Trabajador(String dNI, String nombre, String apellido, String genero) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return ""+getNombre();
	}
	
	
}

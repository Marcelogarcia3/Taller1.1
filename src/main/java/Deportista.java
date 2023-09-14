public abstract class Deportista {
	private String nombre;
	private String apellido;
	private String direccionCorreo;
	private String numeroContacto;
	private String deporteAPracticar;
	private String posicion;
	public Club club;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccionCorreo() {
		return this.direccionCorreo;
	}

	public void setDireccionCorreo(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}

	public String getNumeroContacto() {
		return this.numeroContacto;
	}

	public void setNumeroContacto(String numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public String getDeporteAPracticar() {
		return this.deporteAPracticar;
	}

	public void setDeporteAPracticar(String deporteAPracticar) {
		this.deporteAPracticar = deporteAPracticar;
	}

	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Deportista(String nombre, String apellido, String direccionCorreo, String numeroContacto, String deporteAPracticar, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccionCorreo = direccionCorreo;
		this.numeroContacto = numeroContacto;
		this.deporteAPracticar = deporteAPracticar;
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Deportista{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				", direccionCorreo='" + direccionCorreo + '\'' +
				", numeroContacto='" + numeroContacto + '\'' +
				", deporteAPracticar='" + deporteAPracticar + '\'' +
				", posicion='" + posicion + '\'' +
				'}';
	}
}
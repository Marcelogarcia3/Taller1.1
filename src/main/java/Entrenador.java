public class Entrenador extends Deportista {
	private String experiencia;
	private String especialidad;
	public Equipo equipo;

	public String getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Entrenador(String nombre, String apellido, String direccionCorreo, String numeroContacto, String deporteAPracticar, String posicion, String experiencia, String especialidad) {
		super(nombre, apellido, direccionCorreo, numeroContacto, deporteAPracticar, posicion);
		this.experiencia = experiencia;
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Entrenador{" +
				"experiencia='" + experiencia + '\'' +
				", especialidad='" + especialidad + '\'' +
				'}';
	}
}
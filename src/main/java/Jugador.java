public class Jugador extends Deportista {
	public Jugador(String nombre, String apellido, String direccionCorreo, String numeroContacto, String deporteAPracticar, String posicion) {
		super(nombre, apellido, direccionCorreo, numeroContacto, deporteAPracticar, posicion);
	}

	@Override
	public String toString() {
		return "Jugador{}";
	}
}

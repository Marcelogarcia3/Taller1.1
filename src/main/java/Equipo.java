import java.util.ArrayList;

public class Equipo {
	private ArrayList<String> jugadores;
	private String entrenador;
	private ArrayList<String> historialPartidos;
	public Deporte deporte;

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

	public String getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}

	public ArrayList<String> getHistorialPartidos() {
		return historialPartidos;
	}

	public void setHistorialPartidos(ArrayList<String> historialPartidos) {
		this.historialPartidos = historialPartidos;
	}

	public Equipo(ArrayList<String> jugadores, String entrenador, ArrayList<String> historialPartidos) {
		this.jugadores = jugadores;
		this.entrenador = entrenador;
		this.historialPartidos = historialPartidos;
	}

	@Override
	public String toString() {
		return "Equipo{" +
				"jugadores=" + jugadores +
				", entrenador='" + entrenador + '\'' +
				", historialPartidos=" + historialPartidos +
				'}';
	}
}
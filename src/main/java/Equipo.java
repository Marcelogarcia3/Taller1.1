import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private List<Deportista> deportistas;
	private String entrenador;
	private ArrayList<String> historialPartidos;

	public Equipo() {
		deportistas = new ArrayList<>();
		entrenador = "";
		historialPartidos = new ArrayList<>();
	}

	public List<Deportista> getDeportistas() {
		return deportistas;
	}

	public void setDeportistas(List<Deportista> deportistas) {
		this.deportistas = deportistas;
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

	public boolean agregarDeportista(Deportista deportista) {
		if (buscarDeportista(deportista.getNombre(), deportista.getPosicion()) == null) {
			deportistas.add(deportista);
			return true;
		} else {
			return false;
		}
	}

	public List<Deportista> buscarDeportista(String nombre, String posicion) {
		List<Deportista> deportistasEncontrados = new ArrayList<>();
		for (Deportista deportista : deportistas) {
			if (deportista.getNombre().equals(nombre) && deportista.getPosicion().equals(posicion)) {
				deportistasEncontrados.add(deportista);
			}
		}
		return deportistasEncontrados;
	}

	public void agregarPartido(String resultado) {
		historialPartidos.add(resultado);
	}


	@Override
	public String toString() {
		return "Equipo{" +
				"deportistas=" + deportistas +
				", entrenador='" + entrenador + '\'' +
				", historialPartidos=" + historialPartidos +
				'}';
	}

	public void registrarPartido(PartidosJugados partido1) {
	}
}
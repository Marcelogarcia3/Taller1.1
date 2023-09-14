import java.util.ArrayList;
import java.util.List;

public class Club {
	private List<Equipo> equipos;

	public void clubEquipos() {
		equipos = new ArrayList<>();
	}
	private List<Deportista> deportistas;

	public void clubDeportistas() {
		deportistas = new ArrayList<>();
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
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Club\n");
		sb.append("Equipos:\n");
		for (Equipo equipo : equipos) {
			sb.append(equipo.toString()).append("\n");
		}
		return sb.toString();
	}


	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}
}
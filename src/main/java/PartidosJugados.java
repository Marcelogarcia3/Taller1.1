import java.util.Date;

public class PartidosJugados {
	private String equipoOponente;
	private String resultado;
	private Date fecha;
	private String ubicacionEncuentro;
	public Equipo equipo;

	public PartidosJugados(String local, String visitante, String s, String estadio1, String s1) {
	}



	public String getEquipoOponente() {
		return this.equipoOponente;
	}

	public void setEquipoOponente(String equipoOponente) {
		this.equipoOponente = equipoOponente;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUbicacionEncuentro() {
		return this.ubicacionEncuentro;
	}

	public void setUbicacionEncuentro(String ubicacionEncuentro) {
		this.ubicacionEncuentro = ubicacionEncuentro;
	}

	public void registrarEnEquipo(Equipo equipo) {
		equipo.registrarPartido(this);
	}

	public PartidosJugados(String equipoOponente, String resultado, Date fecha, String ubicacionEncuentro) {
		this.equipoOponente = equipoOponente;
		this.resultado = resultado;
		this.fecha = fecha;
		this.ubicacionEncuentro = ubicacionEncuentro;
	}

	@Override
	public String toString() {
		return "PartidosJugados{" +
				"equipoOponente='" + equipoOponente + '\'' +
				", resultado='" + resultado + '\'' +
				", fecha=" + fecha +
				", ubicacionEncuentro='" + ubicacionEncuentro + '\'' +
				'}';
	}
}
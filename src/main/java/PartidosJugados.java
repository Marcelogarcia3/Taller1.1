import java.util.Date;

public class PartidosJugados {
	private String equipoOponente;
	private String resultado;
	private Date fecha;
	private String ubicacionEncuentro;
	public Equipo equipo;

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
}
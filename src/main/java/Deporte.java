public abstract class Deporte {
	private String tipoDeporte;
	private String tipoCancha;
	public Club club;

	public String getTipoCancha() {
		return this.tipoCancha;
	}

	public void setTipoCancha(String tipoCancha) {
		this.tipoCancha = tipoCancha;
	}

	public String getTipoDeporte() {
		return this.tipoDeporte;
	}

	public void setTipoDeporte(String tipoDeporte) {
		this.tipoDeporte = tipoDeporte;
	}

	public abstract String getTipo();
}
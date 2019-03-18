package ejercicios;

public class Ciudad {

	private String nombreCiudad;
	private String nombrePais;
	private float logitud;
	private float latitud;
	
	public Ciudad(String nombreCiudad, String nombrePais, float logitud, float latitud) {
		this.nombreCiudad = nombreCiudad;
		this.nombrePais = nombrePais;
		this.logitud = logitud;
		this.latitud = latitud;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public float getLogitud() {
		return logitud;
	}

	public void setLogitud(float logitud) {
		this.logitud = logitud;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	@Override
	public String toString() {
		return "Ciudad [nombreCiudad=" + nombreCiudad + ", nombrePais=" + nombrePais + ", logitud=" + logitud
				+ ", latitud=" + latitud + "]";
	}
	
	
}

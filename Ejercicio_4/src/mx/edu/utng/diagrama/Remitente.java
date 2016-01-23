package mx.edu.utng.diagrama;

import java.util.List;

public class Remitente extends Persona{
	private String apodoRemitente;
	
	private List<Tarjeta> tarjetas;

	public Remitente(List<Tarjeta>tarjetas){
		this.tarjetas= tarjetas;
	}

	public String getApodoRemitente() {
		return apodoRemitente;
	}

	public void setApodoRemitente(String apodoRemitente) {
		this.apodoRemitente = apodoRemitente;
	}
	
	

}

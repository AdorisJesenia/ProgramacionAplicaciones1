package mx.edu.utng.diagrama;

import java.util.List;

public class Destinatario extends Persona{
	private String correo;
	private String apodoDestinatario;
	
	
	private List<Tarjeta> tarjetas;

	public Destinatario(List<Persona>personas){
		
		this.tarjetas= tarjetas;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getApodoDestinatario() {
		return apodoDestinatario;
	}
	public void setApodoDestinatario(String apodoDestinatario) {
		this.apodoDestinatario = apodoDestinatario;
	}
	
	

}

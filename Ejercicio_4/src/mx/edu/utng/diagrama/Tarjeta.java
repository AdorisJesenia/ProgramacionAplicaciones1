package mx.edu.utng.diagrama;

public class Tarjeta {
	private String tipo;
	private String dedicatoria;
	private String remitente;
	private int numDestinatarios;
	private String destinatarios;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDedicatoria() {
		return dedicatoria;
	}
	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public int getNumDestinatarios() {
		return numDestinatarios;
	}
	public void setNumDestinatarios(int numDestinatarios) {
		this.numDestinatarios = numDestinatarios;
	}
	public String getDestinatarios() {
		return destinatarios;
	}
	public void setDestinatarios(String destinatarios) {
		this.destinatarios = destinatarios;
	}
	
	

}

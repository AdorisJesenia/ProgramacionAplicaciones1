package mx.edu.utng.diagrama;

import java.util.List;



public class TarjetaAnimada extends Tarjeta {

	private String codigo;
	private String fondo;
	private String dedicatoria;
	private String imagen;

	private List<ArchivoDeTarjetas>archivosDeTarjetas;

	public TarjetaAnimada(List<Tarjeta>tarjetas){
		
		this.archivosDeTarjetas= archivosDeTarjetas;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFondo() {
		return fondo;
	}
	public void setFondo(String fondo) {
		this.fondo = fondo;
	}
	public String getDedicatoria() {
		return dedicatoria;
	}
	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
}

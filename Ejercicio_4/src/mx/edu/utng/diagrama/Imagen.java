package mx.edu.utng.diagrama;

import java.util.List;

public class Imagen {
	private String nombre;
	
	private List<TarjetaAnimada>tarjetasAnimadas;

	public Imagen(List<TarjetaAnimada>tarjetasAnimadas){
		this.tarjetasAnimadas= tarjetasAnimadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}

package mx.edu.utng.diagrama;

import java.util.List;

public class Fondo {
	private String color;
	
	private List<TarjetaAnimada>tarjetasAnimadas;

	public Fondo(List<TarjetaAnimada>tarjetasAnimadas){
		this.tarjetasAnimadas= tarjetasAnimadas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}

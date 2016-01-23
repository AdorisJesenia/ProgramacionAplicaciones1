package mx.edu.utng.diagrama;

import java.util.ArrayList;
import java.util.List;


public class Dedicatoria {
	private String texto;
	
	private List<TarjetaAnimada> tarjetasAnimadas;
	public Dedicatoria(){
		this.tarjetasAnimadas = new ArrayList<TarjetaAnimada>();
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}

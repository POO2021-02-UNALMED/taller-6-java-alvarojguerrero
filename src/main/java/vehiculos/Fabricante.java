package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	String nombre;
	Pais pais;
	public static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	public int ventas;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		fabricantes.add(this);
	}
	
	public Fabricante() {
	
	}

	public static Fabricante fabricaMayorVentas() {
		int aux = 0;
		for (Fabricante f: fabricantes) {
			if (f.ventas > aux) {
				aux = f.ventas;
			}
		}
		Fabricante m = new Fabricante();
		for (Fabricante fabri: fabricantes) {
			if (fabri.ventas == aux) {
				m = fabri;
			}
		}
		return m;	
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

}
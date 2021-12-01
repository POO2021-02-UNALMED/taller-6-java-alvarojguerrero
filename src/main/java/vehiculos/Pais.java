package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	String nombre;
	public static ArrayList<Pais> paises = new ArrayList<>();
	public int ventas;
	
	public Pais(String nombre) {
		this.nombre=nombre;
		paises.add(this);}
	
	public Pais() {
		
	}

	public static Pais paisMasVendedor() {
		int aux = 0;
		for (Pais pais: paises) {
			if (pais.ventas > aux) {
				aux = pais.ventas;
			}
		}
		Pais m = new Pais();
		for (Pais pais: paises) {
			if (pais.ventas == aux) {
				m = pais;
			}
		}
		return m;}
	
	public String getNombre() {
		return nombre;}

	public void setNombre(String nombre) {
		this.nombre = nombre;}	

}
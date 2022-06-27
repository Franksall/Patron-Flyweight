package Empresa.Empleados.UnsharedConcreteFlyweights;

import Empresa.Empleados.*;

public class Director implements Empleado {
	public String nombre;

	private final String trabajo;
	private String habilidad;

	public Director(String nombre) {
		this.nombre = nombre;
		trabajo = "Dirigir la empresa";
	}

	@Override
	public void asignarHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	@Override
	public void informacion(){
		System.out.println("CEO " + this.nombre + " [Habilidad: " + this.habilidad + "\tTrabajo: " + this.trabajo + "]");
	}
}
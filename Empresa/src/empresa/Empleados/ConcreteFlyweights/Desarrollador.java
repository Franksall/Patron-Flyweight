package Empresa.Empleados.ConcreteFlyweights;

import Empresa.Empleados.*;

public class Desarrollador implements Empleado {
	private final String trabajo;//estadi intrinseco
	private String habilidad;

	public Desarrollador() {
		trabajo = "Programar aplicaciones";
	}

	@Override
	public void asignarHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	@Override
	public void informacion() {
		System.out.println("Desarrollador [Habilidad: " + this.habilidad + "\tTrabajo: " + this.trabajo + "]");
	}
}
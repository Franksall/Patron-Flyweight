package Empresa.Empleados.ConcreteFlyweights;

import Empresa.Empleados.*;

public class Tester implements Empleado {

	private final String trabajo;
	private String habilidad;

	public Tester() {
		trabajo = "Probar aplicaciones";
	}

	@Override
	public void asignarHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	@Override
	public void informacion(){
		System.out.println("Tester [Habilidad: " + this.habilidad + "\tTrabajo: " + this.trabajo + "]");
	}
}
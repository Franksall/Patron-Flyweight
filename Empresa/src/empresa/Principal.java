package Empresa;

import java.util.Random;
import Empresa.Empleados.*;
import Empresa.Empleados.UnsharedConcreteFlyweights.*;

public class Principal {
	private static final String tiposEmpleados[] = {"Desarrollador", "Tester"};
	private static final String habilidades[] = {"Java", "C++", ".Net", "Python"};

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			Empleado empl = FactoryEmpleados.getEmpleado(getEmpleadoRandom());

			empl.asignarHabilidad(getHabilidadRandom());
			empl.informacion();
		}

		Empleado direcone = new Director("Jeff Cuadritos");
		System.out.println("\n->Director Creado<-\n");
		direcone.asignarHabilidad("Ventas");
		direcone.informacion();

		Empleado directwor = new Director("Rick Miles");
		System.out.println("\n->Director Creado<-\n");
		directwor.asignarHabilidad("Logistica");
		directwor.informacion();
	}

	public static String getEmpleadoRandom() {
		Random rnd = new Random();
		int enteroRandom = rnd.nextInt(tiposEmpleados.length);

		return tiposEmpleados[enteroRandom];
	}

	public static String getHabilidadRandom() {
		Random rnd = new Random();
		int enteroRandom = rnd.nextInt(habilidades.length);

		return habilidades[enteroRandom];
	}
}
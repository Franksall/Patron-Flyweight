package Empresa.Empleados;

import java.util.HashMap;
import Empresa.Empleados.ConcreteFlyweights.*;

public class FactoryEmpleados {
	private static HashMap <String, Empleado> almacen = new HashMap<String, Empleado>();

	public static Empleado getEmpleado(String tipo) {
		Empleado empl = null;

		if(almacen.get(tipo) != null){
			empl = almacen.get(tipo);
		}
		else{
			switch(tipo){
				case "Desarrollador":
					System.out.println("\n->Desarrollador Creado<-\n");
					empl = new Desarrollador();
					break;

				case "Tester":
					System.out.println("\n->Tester Creado<-\n");
					empl = new Tester();
					break;

				default:
					System.out.println("No existe el empleado");
			}

			almacen.put(tipo, empl);
		}

		return empl;
	}
}
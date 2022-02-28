package interfaz;

import mundo.*;

public class InterfazEmpleado {

	public static void main(String[] args) {
		Empleado empleado1;
		
		empleado1 = new Empleado("Richard Salas", 1111262465, "cra 5 # 10-20", 3000000.0, 8.0);
		
		System.out.println( empleado1.getNombre( ) );
	}

}

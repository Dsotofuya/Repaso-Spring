package inversionOfControl;

public class Jefe implements Empleado {
	
	private CrearInforme informe;
	
	public Jefe(CrearInforme informe) {
		this.informe = informe;
	}
	
	public void init() {
		System.out.println("Ejecución antes de que el bean esté listo");
	}
	
	public void destroy() {
		System.out.println("Ejecución despues de que el bean esté listo");
	}

	@Override
	public String getTareas() {
		return "nada xd";
	}
	
	@Override
	public String getInforme() {
		return "Soy el jefe " + informe.crearInforme() ;
	}
}

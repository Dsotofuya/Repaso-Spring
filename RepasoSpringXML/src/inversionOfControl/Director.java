package inversionOfControl;

public class Director implements Empleado {

	private CrearInforme informe;
	private String email;
	private String empresa;
	
	@Override
	public String getTareas() {
		return "yo dirijo xd";
	}

	@Override
	public String getInforme() {
		return "Soy el Director " + informe.crearInforme() ;
	}

	public void setInforme(CrearInforme informe) {
		this.informe = informe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}

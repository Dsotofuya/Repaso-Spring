package pruebasAnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DirectorVentas implements Empleado{
	
	//@Autowired @Qualifier("infFinalVentas")
	private ObtenerInforme informe;
	@Value("${email}")
	private String email;
	@Value("${nEmpresa}")
	private String nEmpresa;

	public DirectorVentas(ObtenerInforme informe) {
		this.informe = informe;
	}
	
	@Override
	public String getTareas() {
		return "Coordino vendedores";
	}

	@Override
	public String getInformes() {
		return informe.generarInforme();
	}

	public String getEmail() {
		return email;
	}

	public String getnEmpresa() {
		return nEmpresa;
	}
}

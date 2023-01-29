package pruebasAnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * @author dsoto
 *Inyeccion de dependencias en metodo setter
 */

@Component("BVendedor")
@Scope("prototype")
public class Vendedor implements Empleado {

	private ObtenerInforme informe;
	
	@Override
	public String getTareas() {
		return "Vender";
	}

	@Override
	public String getInformes() {
		return informe.generarInforme();
	}

	@Autowired
	@Qualifier("informeFinanciero")
	public void setInforme(ObtenerInforme informe) {
		this.informe = informe;
	}
	
}

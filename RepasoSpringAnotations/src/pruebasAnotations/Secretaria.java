package pruebasAnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 
 * @author dsoto
 *Inyeccion de dependencias mediante atributos
 */

@Component
public class Secretaria implements Empleado{

	@Autowired @Qualifier("informeFinanciero")
	ObtenerInforme informe;
	
	@Override
	public String getTareas() {
		return "Vueltas";
	}

	@Override
	public String getInformes() {
		return informe.generarInforme() + " de secretaria";
	}

	
	
}

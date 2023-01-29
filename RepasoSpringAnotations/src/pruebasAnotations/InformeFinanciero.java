package pruebasAnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero implements ObtenerInforme{

	@Override
	public String generarInforme() {
		return "Informe financiero generado";
	}

}

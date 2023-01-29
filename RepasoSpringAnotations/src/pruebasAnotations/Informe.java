package pruebasAnotations;

import org.springframework.stereotype.Component;

@Component
public class Informe implements ObtenerInforme{

	@Override
	public String generarInforme() {
		return "Informe generado";
	}

}

package pruebasAnotations;

import org.springframework.stereotype.Component;

@Component
public class InfFinalVentas implements ObtenerInforme {

	@Override
	public String generarInforme() {
		return "Se ha generado el informe final de ventas";
	}

}

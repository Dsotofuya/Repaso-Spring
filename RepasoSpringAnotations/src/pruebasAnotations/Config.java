package pruebasAnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration //Se marca como una clase de configuración
@ComponentScan("pruebasAnotations") //Se define desde que paquete se escanearan los componentes (beans)
@PropertySource("classpath:data.properties")
public class Config {
	
	//Definiendo beans, el nmbre del metodo es el id del bean a solicitar 
	@Bean
	public InfFinalVentas infFinalVentas() {
		return new InfFinalVentas();
	}
	
	@Bean
	public Empleado directorVentas() {
		return new DirectorVentas(infFinalVentas());
	}
	
	
}

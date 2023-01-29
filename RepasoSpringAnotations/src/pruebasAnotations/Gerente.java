package pruebasAnotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author dsoto
 * Inyección de dependencias en metodo constructor
 */

@Component
public class Gerente implements Empleado, InitializingBean, DisposableBean {

	private ObtenerInforme informe;
	
	@Autowired
	public Gerente(ObtenerInforme informe) {
		this.informe = informe;
	}
	
	@Override
	public String getTareas() {
		return "Administrar y tomar decisiones";
	}

	@Override
	public String getInformes() {
		return informe.generarInforme() + " xD";
	}
	/* antes de java 9
	@PostConstruct
	public void init() {
		System.out.println("post creacion de bean");
	}
	@PreDestroy 
	public void destroy() {
		System.out.println("antes de destrucción del bean");
	}
	*/
	
	//Despues de java 9
	// Reemplaza al metodo init
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("-----------post creacion de bean-----------");
		
	}

	//Metodo destroy
	@Override
	public void destroy() throws Exception {
		System.out.println("-----------antes de destrucción del bean-----------");
	}
}

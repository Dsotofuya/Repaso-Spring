package pruebasAnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class run {
 
	public static void main(String[] args) {
		/*
		 * leyendo el archivo xml de configuración
	 	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 	*/
		
		/*
		 * Leyendo la clase de configuración 
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
 		
		Empleado jose = context.getBean("gerente", Empleado.class);
		System.out.println(jose.getTareas());
		System.out.println(jose.getInformes());
		
		
		Empleado josefa = context.getBean("secretaria", Empleado.class);
		Empleado josefina = context.getBean("secretaria", Empleado.class);
		System.out.println("Default (Singleton) en bean secretaria: \n" + josefa + "\n" + josefina);
		System.out.println(josefa.getTareas());
		System.out.println(josefa.getInformes());
		
		Empleado josefo = context.getBean("BVendedor", Empleado.class);
		Empleado josefino = context.getBean("BVendedor", Empleado.class);
		System.out.println(josefo.getTareas());
		System.out.println(josefo.getInformes());
		System.out.println("Prototype en bean vendedores: \n" + josefo + "\n" + josefino);
		
		
		DirectorVentas juan = context.getBean("directorVentas", DirectorVentas.class);
		System.out.println(juan.getTareas());
		System.out.println(juan.getInformes());
		System.out.println(juan.getEmail());
		System.out.println(juan.getnEmpresa());
		
		context.close();
	}
}

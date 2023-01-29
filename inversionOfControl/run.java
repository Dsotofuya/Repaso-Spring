package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class run {
	public static void main(String[] args) {
//		Empleado jefe = new Jefe();
//		Empleado director = new Director();
//		System.out.println(jefe.getTareas());
//		System.out.println(director.getTareas());
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleado JefePepe = context.getBean("creEmp", Empleado.class);
		Empleado JefeJuan = context.getBean("creEmp", Empleado.class);
		System.out.println(JefeJuan.getTareas());
		System.out.println(JefeJuan.getInforme());
		
		Director DirectorPepe = context.getBean("creDir", Director.class);
		Director DirectorJuan = context.getBean("creDir", Director.class);
		System.out.println(DirectorPepe.getTareas());
		System.out.println(DirectorPepe.getInforme());
		System.out.println(DirectorPepe.getEmail());
		System.out.println(DirectorPepe.getEmpresa());
		
		System.out.println("\nSingleton: \n" + JefeJuan);
		System.out.println(JefePepe);
		System.out.println("Prototype: \n" + DirectorPepe);
		System.out.println(DirectorJuan);
		
		
		context.close();
	}
}

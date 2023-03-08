package beanCreationTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext appCont = new AnnotationConfigApplicationContext(CompanyConfig.class);
		Company comp = appCont.getBean("bean1", Company.class);
		comp.sayHi();
	}

}

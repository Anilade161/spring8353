package springProject18353.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		/*ScienceTeacher scienece = new ScienceTeacher();
		scienece.toteach();*/
	ApplicationContext appCont = new ClassPathXmlApplicationContext("NewFile2.xml");
	/*ScienceTeacher sciObj = appCont.getBean("science", ScienceTeacher.class);
	sciObj.toteach();
	
	MathTeacher mathObj = appCont.getBean("math", MathTeacher.class);
	mathObj.toteach();*/
	
	Teaching teacher = appCont.getBean("mathObj", Teaching.class);
	teacher.toteach();
	}

}

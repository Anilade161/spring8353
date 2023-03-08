package springProject18353.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MathTeacher implements Teaching{
	private String name;
	
	@Value("abc")
	private String schoolName;
	
	
	@Qualifier("adrsObj1")
	@Autowired  //u dont need to have setter method, //it will 1st check byType and then byname  //autowire = "byType"
	private Address adrs;

	
	//@Autowired//it will 1st check byType and then byname  //autowire = "byType"
	/*public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}*/

	MathTeacher(){
		
	}
	
	MathTeacher(int age){
		this.age = age;
	}
	
	//@Autowired //autowire = "constructor"
/*	MathTeacher(Address adrs){
		this.adrs = adrs;
	}*/
	
	MathTeacher(String name,int age){
		this(age);
		this.name = name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	
	public void toteach() {
		adrs.display();
		System.out.println("i am going to teach maths"+ name + age + " "+schoolName);
	}
	
}

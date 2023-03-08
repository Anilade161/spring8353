package beanCreationTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("otherName")  //class name ll b the bean name with 1st ltr ll be small , company
public class Company {

	@Value("zoho")
	private String companyName;
	
	@Autowired
	private Manager manager;

	@Autowired
	private developers dev; //new Javadev(), new pythonDev()

	/*Company(Manager manager){
		this.manager = manager;
	}*/

	public void setDev(developers dev) {
		this.dev = dev;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public void sayHi() {
		System.out.println("company bean craeted");
		manager.display();
		dev.development();
	}
}

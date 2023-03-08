package beanCreationTypes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //replacemnet of ur xml
//@ComponentScan(basePackages = "beanCreationTypes")
public class CompanyConfig {

	
	@Bean
	public Manager createManagerBean() {
		return new Manager();
	}

	@Bean
	public developers createBean() {
		return new pythonDeveloper();
	}
	
	
	//@Bean //Company createCompanyBean = new Company()
	//@Bean(name = "bean1")
	@Bean(name = {"bean1","bean2"})
	public Company createCompanyBean() {  //method ll b the bean name
			Company comp =  new Company();
			comp.setManager(createManagerBean());
			comp.setDev(createBean());
			return comp;
	}
}

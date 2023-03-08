package beanCreationTypes;

import org.springframework.context.annotation.Primary;

@Primary
public class javaDevelopers implements developers{

	@Override
	public void development() {
		
		System.out.println(" i am java developed");
	}

	
}

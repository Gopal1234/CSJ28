package annotation.demo;

import org.springframework.stereotype.Component;
//nonTechnical
@Component
public class NonTechnical implements Course {

	public String showCourse() {
		// TODO Auto-generated method stub
		return "History Hindi";
	}

}

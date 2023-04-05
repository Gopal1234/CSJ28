package annotation.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//technicalCourse
@Component

public class TechnicalCourse implements Course {

	public String showCourse() {
		// TODO Auto-generated method stub
		return "Java C C++ DS";
	}

}

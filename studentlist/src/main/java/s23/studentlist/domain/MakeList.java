package s23.studentlist.domain;

import java.util.ArrayList;
import java.util.List;

public class MakeList {
	
	static public List<Student> makeStudentList() {
		List<Student> studentList = new ArrayList<>();
		Student kate = new Student("Kate", "Cole");
		Student dan = new Student("Dan", "Brown");
		Student mike = new Student("Mike", "Mars");
		studentList.add(kate);
		studentList.add(dan);
		studentList.add(mike);
		return studentList;
	}

}

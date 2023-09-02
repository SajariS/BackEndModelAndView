package s23.studentlist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import s23.studentlist.domain.*;

@Controller
public class StudentController {

	@GetMapping("/hello")
	public String showList(Model model) {
		// Listan tekeminen löytyy .domain -> MakeList
		model.addAttribute("studentList", MakeList.makeStudentList());
		return "studentList";
	}
}

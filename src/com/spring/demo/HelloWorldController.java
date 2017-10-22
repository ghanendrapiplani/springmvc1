package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/studentForm")
	public String showStudent(Model model) {
		Student st = new Student();
		st.setFirstName("ram");
		st.setLastName("lakhan");
		model.addAttribute("student", st);
		return "studentform";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student, Model model) {
		String[] arr = student.getFavHobbies();
		System.out.println("fav hobbs " + arr[0] + " " + arr[1]);
		model.addAttribute("message", student);
		return "student-confirmation";
	}

	@RequestMapping("/letShoutDude")
	public String letsShoutData(@RequestParam("studentName") String name, Model model) {
		model.addAttribute("message", "shouting " + name.toUpperCase());
		return "helloworld";
	}

}

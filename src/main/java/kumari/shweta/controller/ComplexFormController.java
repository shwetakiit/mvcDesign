package kumari.shweta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kumari.shweta.model.Student;

@Controller
public class ComplexFormController {
	
	@RequestMapping("/complexform")
	public String showForm() {
		return "complexform";
	}
	
	//@RequestMapping(path="/complexform/complexProcessForm", method=RequestMethod.POST)
//	public String handlerForm(@RequestParam("username") String name, @RequestParam("userid") Long id) {
// We can use ModelAttribute here 
	
	@RequestMapping(path="/complexform/complexProcessForm", method=RequestMethod.POST)
	public String handlerForm(@ModelAttribute("student") Student student,BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {
		student.setValidationError(true);
		model.addAttribute("validationerror", "true");
			return "complexform";
		}else {
			model.addAttribute("validationerror", "false");
		}
	System.out.println("Name is "+student.getUsername());
	System.out.println("Id is "+student.getUserid());
		return "complexformsuccess";
	}

}

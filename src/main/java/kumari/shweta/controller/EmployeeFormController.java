/**
 * 
 */
package kumari.shweta.controller;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kumari.shweta.model.EmployeeDTO;
import kumari.shweta.service.EmployeeService;

/**
 * @author Shweta kumari
 *
 */
@Controller //No need to configure in bean configuration file it's annotation based spring bean
public class EmployeeFormController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/registration")
	public String registrationForm() {
		return "registration";
	}
	
	@RequestMapping(path="registration/registrationProcess", method = RequestMethod.POST)
	public String SubmitRegistrationForm(@ModelAttribute EmployeeDTO employeeDTO,Model model) {
	Integer id = this.employeeService.addNewEmployee(employeeDTO);
	model.addAttribute("msg", "User created successfully with id "+id);
		
		System.out.println(employeeDTO);
      return "employeeportal";		
		
	}

}

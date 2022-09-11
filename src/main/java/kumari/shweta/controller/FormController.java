/**
 * 
 */
package kumari.shweta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.MvcNamespaceHandler;

import kumari.shweta.model.User;

/**
 * @author Shweta Kumari
 *
 */
@Controller
public class FormController {
	
	@RequestMapping("/contact")
	public String showForm( Model model) {
		model.addAttribute("header", "Happy Learning");
		return "contact";
	}

	/* Handling Submitted form from backend uisng traditional approach servlet */

	/*
	 * @RequestMapping(path ="contact/processForm",method=RequestMethod.POST) public
	 * String HandleSubmittedForm(HttpServletRequest request) { String emailId =
	 * request.getParameter("emailId"); System.out.println("Email id is "+emailId);
	 * return "";
	 * 
	 */

	/* Using Spring MVC */

	// @RequestMapping(path = "contact/processForm", method = RequestMethod.POST)
	public String HandleSubmittedForm(@RequestParam(name = "emailId", required = true) String userEmail,
			@RequestParam("user") String name, Model model) {

		System.out.println("Name :" + name);
		System.out.println("Email id :" + userEmail);
		model.addAttribute("name", name);
		model.addAttribute("email", userEmail);
		return "profile";
	}

	/* Get form field value in controller method and pass it using Model class */

	// @RequestMapping(path = "contact/processForm", method = RequestMethod.POST)
	public String HandleSubmittedFormWithModelClass(@RequestParam(name = "emailId", required = true) String userEmail,
			@RequestParam("user") String name, Model model) {

		User user = new User();
		user.setEmailId(userEmail);
		user.setUser(name);
		System.out.println(user.toString());

		model.addAttribute("user", user);
		return "userdetail";
	}

	
	/*
	 * Get form field value in controller method and pass it using Model attribute
	 * with modelattribute annotation
	 */

	@RequestMapping(path = "/contact/processForm", method = RequestMethod.POST)
	public String HandleFormWithModelAttribute(@ModelAttribute User user, Model model) {
		// model.addAttribute(attributeName, attributeValue) --> Not required here 
		System.out.println(user);
		return "userdetail";

	}

}

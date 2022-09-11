/**
 * 
 */
package kumari.shweta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Shweta Kumari
 *
 */
@Controller
public class FormController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	/* Handling Submitted form from backend  uisng traditional approach servlet */
	
	@RequestMapping(path ="contact/processForm",method=RequestMethod.POST)
	public String HandleSubmittedForm(HttpServletRequest request) {
		String emailId = request.getParameter("emailId");
		System.out.println("Email id is "+emailId);
		return "";
	}

}

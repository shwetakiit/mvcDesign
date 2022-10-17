/**
 * 
 */
package kumari.shweta.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Shweta kumari
 *
 */
@ControllerAdvice // used for global error handling in the Spring MVC applicatio
public class CentralizedExceptionHandler {

	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String ExceptionHandler(Model model) {
		model.addAttribute("msg", "ArrayIndexOutOfBoundException handled by centralized excpetion handler");
		return "null_page";
	}

	@ExceptionHandler(Exception.class)
	public String genericExceptionHandler(Model model) {
		model.addAttribute("msg", "GenericException handled by centralized genericexception handler");
		return "null_page";
	}

}

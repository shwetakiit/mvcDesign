package kumari.shweta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import oracle.net.aso.m;
/**
 * @author Shweta kumari
 *
 */
@Controller
public class RestAPIController {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId,@PathVariable("userName") String userName) {
		System.out.println(userId);
		System.out.println(userName);

		// This code for raising exception and It will handle by Spring exception handler

		/*
		 * String str = null; System.out.println("Length of String"+str.length());
		 */

		// This code will raise NumberFormatException
		// Integer userInteger = Integer.parseInt(userName);

		// ArrayIndexOutOfBoundException handled by exception handler method of
		// centralizedexceptionhandler
		int arr[] = { 1, 2, 3 };
		System.out.println(arr[4]);
        return "home";
	}

	/*
	 * Excpetion handling with Spring --> Excpetion handling for particular type
	 * exceptiom Handling Generic exception --> All types of exception
	 */
	
	@ExceptionHandler(NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		
		m.addAttribute("msg","Null pointer exception has occured");
		return "null_page";
		
	}
	
	//To handle NumberFormatException
	@ExceptionHandler(NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m) {
	m.addAttribute("msg","Number format exception has occured");
	return "null_page";
	}
	
	
}

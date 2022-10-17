package kumari.shweta.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @author Shweta kumari
 *
 */
@Controller
public class SearchController {

	@RequestMapping("/searchcontroller")
	public String searchHome() {
		System.out.println("Going to home page");

		/*
		 * Here Arithmetic Exception handled by generic exception handler method We are
		 * sending status code as well for internal server error to indicate that there
		 * is something error in server side
		 * 
		 * @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)-->We can see status
		 * 500 in chrome network
		 */
		int number = 10 / 0;
		return "home";
	}

	@RequestMapping("searchcontroller/search")
	public RedirectView search(@RequestParam("querybox") String querybox) {
		String url = "https://www.google.com/search?q=" + querybox;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}

	// To handle Generic exception
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public String handleGenericException(Model m) {
		m.addAttribute("msg", "Handled by Generic exception (Exception.class)");
		return "null_page";
	}
	}

package kumari.shweta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shweta Kumari
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("name","Shweta Kumari");
		return "about";
	}

}

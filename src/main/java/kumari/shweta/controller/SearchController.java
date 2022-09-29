package kumari.shweta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		return "home";
	}

	@RequestMapping("searchcontroller/search")
	public RedirectView search(@RequestParam("querybox") String querybox) {
		String url = "https://www.google.com/search?q=" + querybox;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
}

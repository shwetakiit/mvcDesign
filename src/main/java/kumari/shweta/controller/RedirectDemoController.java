/**
 * 
 */
package kumari.shweta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @author Shweta kumari
 *
 */

@Controller
public class RedirectDemoController {

	/*Redirect with String */
	@RequestMapping("/requestPage")
	public String requestPage() {
		System.out.println("This is /requesPage handler");
		return "redirect:/welcomePage";
	}

	@RequestMapping("/welcomePage")
	public String welcomePage() {
		System.out.println("This redirect page i.e. /Welcomepage handler");
		return "contact";
	}
	/*Redirect using view */
	
	@RequestMapping("/redirectDemo")
	public RedirectView redirectDemo() {
		RedirectView redirectView = new RedirectView();
	//	redirectView.setUrl("/welcomeWithRedirect"); -->here / is not required it will remove project name and it will call url http://localhost:8080/welcomeWithRedirect
		redirectView.setUrl("welcomeWithRedirect");
		return redirectView;
	}
	
	@RequestMapping("redirectDemo/welcomeWithRedirect")
	public String WelcomePageWithRedirect() {
		System.out.println("This redirect page by redirectDemo");
		return "contact";
	}
}

package kumari.shweta.controller;

import java.awt.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
		ArrayList<String> list = new ArrayList<String>();
		list.add("Christy");
		list.add("Florik");
		list.add("Kalinda");
		model.addAttribute("flist", list);
		return "about";
	}
	
	@RequestMapping(path="/help", method=RequestMethod.GET)
	public ModelAndView help() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("aname","Bonny Plunkit");
		modelAndView.setViewName("help");
		LocalDateTime now =  LocalDateTime.now();
		modelAndView.addObject("Time", now);
		return modelAndView;
		
	}
	

}

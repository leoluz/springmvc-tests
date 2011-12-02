package springapp.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnnotatedControler {

	@RequestMapping("/spring")
	public ModelAndView helloWorld() {
		ModelAndView mav = new ModelAndView();
		String now = (new Date()).toString();
		mav.setViewName("hello");
		mav.addObject("now", now);
		return mav;
	}
}
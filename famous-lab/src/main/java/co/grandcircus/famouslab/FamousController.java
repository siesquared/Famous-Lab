package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.entity.Innovator;
import co.grandcircus.famouslab.entity.Inventor;
import co.grandcircus.famouslab.service.ApiService;

@Controller
public class FamousController {
	@Autowired
	ApiService apiServ;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");

		List<Inventor> inventors = apiServ.getNerds();
		mv.addObject("list", inventors);

		return mv;
	}

	@RequestMapping("/complete")
	public ModelAndView dorks() {
		ModelAndView mv = new ModelAndView("complete");

		List<Innovator> inn = apiServ.getSuperNerds();
		mv.addObject("box", inn);

		return mv;
	}

	@RequestMapping("/tester")
	public ModelAndView test(

	) {
		List<Inventor> inventors = apiServ.getNerds();
		ModelAndView mv = new ModelAndView("tester");
		 mv.addObject("list", inventors);
		 
		 
		return mv;
	}
}

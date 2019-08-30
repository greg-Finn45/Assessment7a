package co.grandcircus.assessment7a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.assessment7a.entity.AnimalsResponse;


@Controller
public class AnimalsController {

	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");

		AnimalsResponse animals = apiService.getAnimals();
				
		mv.addObject("animals", animals.getResults());
		
		return mv;
	}
	
	
	@RequestMapping("/species")
	public ModelAndView details(@RequestParam("name") name) {
		ModelAndView mv = new ModelAndView("details");
		
		mv.addObject("animal", apiService.getByName(name));
		
		return mv;
	}
	
	
}


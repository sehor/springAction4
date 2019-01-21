package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spittr.Spittle;
import spittr.data.SpittleRepository;

@Controller
@RequestMapping(value = { "/spittles" })
public class SpittleController {

	private static final String LONG_MAX_AS_STRING = "9223372036854775807";
	private SpittleRepository spittleRepository;

	@Autowired
	public SpittleController(SpittleRepository repository) {

		this.spittleRepository = repository;
	}

	@RequestMapping(method = GET)
	public String spittles(@RequestParam(value = "max", defaultValue = LONG_MAX_AS_STRING) long max,
			@RequestParam(value = "count", defaultValue = "20") int count, 
			Model model)

	{
		List<Spittle> spittles = this.spittleRepository.findSpittles(Long.MAX_VALUE, count);
		model.addAttribute("spittleList", spittles);
		return "spittles";
	}
	
	
	@RequestMapping(value="/show/{spittleId}",method=GET)
	public String showSpittle(@PathVariable long spittleId,Model model){
		
		model.addAttribute(this.spittleRepository.findOne(spittleId));
		
		return "spittle";
		
	}
	

}

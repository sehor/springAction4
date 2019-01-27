package spittr.web;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import spittr.Spitter;
import spittr.data.SpitterRepositroy;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/spitter")
public class SpitterController {

	// methods ------------------------------------:
	// register Page
	@RequestMapping(value = "/register", method = GET)
	String registionForm(Model model) {

		model.addAttribute(new Spitter());
		return "registerForm";
	}

	// process registration
	@RequestMapping(value = "/register", method = POST)
	String processRegistration(@Valid Spitter spitter, Errors errors) {

		if (errors.hasErrors())
			return "registerForm";

		repository.save(spitter);
		return "redirect:/spitter/" + spitter.getUsername();
	}

	// show spitter profile
	@RequestMapping(value = "/{username}", method = GET)
	String showProfile(@PathVariable String username, Model model) {

		model.addAttribute(repository.findByUsername(username));
		return "profile";
	}

	// methods ------------------------------------<

	// fields -------------------------------------->
	// inject repository
	private SpitterRepositroy repository;

	@Autowired
	public SpitterController(SpitterRepositroy repositroy) {
		this.repository = repositroy;
	}

	// fields --------------------------------------<
}

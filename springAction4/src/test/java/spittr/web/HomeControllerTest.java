package spittr.web;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.util.Locale;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import spittr.Spittle;
import spittr.config.RootConfig;
import spittr.config.WebConfig;
import util.Tools;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes={WebConfig.class,RootConfig.class})
public class HomeControllerTest {

@Autowired
private MessageSource messageSource;


@Test
public void testMessageSource(){
	
	Locale locale=LocaleContextHolder.getLocale();
	
	Tools.print(messageSource.getMessage("spittr.welcome", null, locale));
}
/*	@Test
	public void testHomePage() throws Exception{
		
		HomeController controller=new HomeController();
		MockMvc mockMvc=standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(view().name("home"));
	}
	*/

	/*@Test
	public void testSpittlePage()throws Exception{
		JdbcSpittleRepository spittleRepository=new JdbcSpittleRepository();
		List<Spittle> spittles=spittleRepository.findSpittles(Long.MAX_VALUE, 1);
		
		SpittleController controller=new SpittleController(spittleRepository);
		MockMvc mockMvc=standaloneSetup(controller)
				.setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
				.build();
		
		mockMvc.perform(get("/spittles")).andExpect(view().name("spittles"))
		 .andExpect(model().attributeExists("spittleList"))
		 .andExpect(model().attribute("spittleList", hasItems(spittles.toArray()))) ;
		
		
		               
		
	}*/
}

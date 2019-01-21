package spittr.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import spittr.Spittle;
import spittr.data.JdbcSpittleRepository;


public class HomeControllerTest {


/*	@Test
	public void testHomePage() throws Exception{
		
		HomeController controller=new HomeController();
		MockMvc mockMvc=standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(view().name("home"));
	}
	*/
	@Test
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
		
		
		               
		
	}
}

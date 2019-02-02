package spittr.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("spittr")
public class WebConfig extends WebMvcConfigurerAdapter{

/*	// normal resolver
	@Bean
	public ViewResolver resolver(){
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setSuffix(".jsp");
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setExposeContextBeansAsAttributes(true);
		
		return resolver;
	}
	*/
	
	
	//tiles configuration
	
	@Bean
	public TilesViewResolver TilesViewResolver(){
		
		TilesViewResolver resolver=new TilesViewResolver();
		return resolver;
	}
	
	
	@Bean
	public TilesConfigurer tilesConfigurer (){
		
		TilesConfigurer tilesConfigurer=new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[]{"/WEB-INF/layout/tiles.xml"});
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
	}
	

	
	
	
	
	//message source
	
	@Bean
	public MessageSource MessageSource(){
		
	ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
		//ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages_zh_CN");
		return messageSource;
	}
	
	
	
	// request static resource configuration
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		
		configurer.enable();
	}
}

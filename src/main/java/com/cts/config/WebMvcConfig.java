package com.cts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.cts")
public class WebMvcConfig implements WebMvcConfigurer {
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	  @Override
	  public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/login").setViewName("login");
	  }	
	  
	  
	  @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry){
		  registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/img/");
		  registry.addResourceHandler("/doctor/img/**").addResourceLocations("/WEB-INF/img/");
		  registry.addResourceHandler("/customer/css/**").addResourceLocations("/WEB-INF/css/"); 
		  registry.addResourceHandler("/customer/js/**").addResourceLocations("/WEB-INF/js/");
		  registry.addResourceHandler("/customer/fonts/**").addResourceLocations("/WEB-INF/fonts/");
		  registry.addResourceHandler("/doctor/css/**").addResourceLocations("/WEB-INF/css/"); 
		  registry.addResourceHandler("/doctor/js/**").addResourceLocations("/WEB-INF/js/");
		  registry.addResourceHandler("/doctor/fonts/**").addResourceLocations("/WEB-INF/fonts/");
		  registry.addResourceHandler("/service/css/**").addResourceLocations("/WEB-INF/css/");  
		  registry.addResourceHandler("/service/js/**").addResourceLocations("/WEB-INF/js/");
		  registry.addResourceHandler("/service/fonts/**").addResourceLocations("/WEB-INF/fonts/");
		  registry.addResourceHandler("/request/css/**").addResourceLocations("/WEB-INF/css/");  
		  registry.addResourceHandler("/request/js/**").addResourceLocations("/WEB-INF/js/");
		  registry.addResourceHandler("/request/fonts/**").addResourceLocations("/WEB-INF/fonts/");
		  registry.addResourceHandler("/admin/css/**").addResourceLocations("/WEB-INF/css/");  
		  registry.addResourceHandler("/admin/js/**").addResourceLocations("/WEB-INF/js/");
		  registry.addResourceHandler("/admin/fonts/**").addResourceLocations("/WEB-INF/fonts/");
		 
		 // registry.addResourceHandler("img/**").addResourceLocations("/WEB-INF/img");
	  }
	
//	@Override
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		configurer.enable();
//	}

}
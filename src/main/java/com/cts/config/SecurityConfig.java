package com.cts.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	PasswordEncoder passwordEncoder;

	
	  @Autowired
	  private UserDetailsService userDetailsService;
	
	@Autowired
	private LoginAuthenticationSuccessHandler authenticationSuccessHandler ;
	
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		auth.inMemoryAuthentication()
//		.passwordEncoder(passwordEncoder)
//		.withUser("user").password(passwordEncoder.encode("123456")).roles("USER")
//		.and()
//		.withUser("admin").password(passwordEncoder.encode("123456")).roles("USER","ADMIN");
		
		
//		auth.jdbcAuthentication().dataSource(dataSource)
//        .usersByUsernameQuery("select username, password, enabled"
//            + " from users where username=?")
//        .authoritiesByUsernameQuery("select username, authority "
//            + "from authorities where username=?")
//        .passwordEncoder(new BCryptPasswordEncoder());
		
		
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
		
	}
	
//	
//	@Bean    
//	public UserDetailsService userDetailsService() {    
//	    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();    
//	    manager.createUser(User.withDefaultPasswordEncoder()  
//	    .username("irfan").password("khan123").roles("ADMIN").build());    
//	    return manager;    
//	}   
	
	@Bean
	public PasswordEncoder passwordEncoder(){
	return new BCryptPasswordEncoder();	
	}
	
	@Override
	protected void configure(HttpSecurity httpSecurity)throws Exception{
		
		
		httpSecurity.authorizeRequests().anyRequest().hasAnyRole("USER","ADMIN","DOCTOR")
		.and()
		.authorizeRequests().antMatchers("/login**","/register").permitAll()
		.and()
		.formLogin().loginPage("/login").loginProcessingUrl("/loginAction").permitAll().successHandler(authenticationSuccessHandler)
		.and()
		.logout().logoutUrl("/j_spring_security_logout").logoutSuccessUrl("/login").permitAll()
		.and()
		.csrf().disable();
		
	}
		
		/*httpSecurity.authorizeRequests()
		.antMatchers("/**")
		.hasRole("USER")
		.and()
		.formLogin().loginPage("/login").loginProcessingUrl("/loginaction").permitAll();*/

		

		
		
		
		//super.configure(httpSecurity);
		
		
//		httpSecurity.authorizeRequests()
//		.antMatchers("/**").hasAnyRole("ADMIN","USER")
//		//.and()
//		//.formLogin().loginPage("/login").loginProcessingUrl("/loginaction").permitAll().successHandler(authenticationSuccessHandler)
//		.and()
//		.logout().logoutSuccessUrl("/login").permitAll()
//		.and()
//		.csrf().disable();
//	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/registerCustomer");
		web.ignoring().antMatchers("/registerAdmin");
		web.ignoring().antMatchers("/registerDoctor");
		web.ignoring().antMatchers("/saveCustomer");
		web.ignoring().antMatchers("/saveAdmin");
		web.ignoring().antMatchers("/saveDoctor");
//		web.ignoring().antMatchers("/resources/**");
		super.configure(web);
	}
//	
	
	
	
}

package com.cts.config;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class LoginAuthenticationSuccessHandler implements AuthenticationSuccessHandler{

	private RedirectStrategy redirectStrategy=  new DefaultRedirectStrategy();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		Collection<? extends GrantedAuthority>authorities= authentication.getAuthorities();
		authorities.forEach((authority -> {
			if(authority.getAuthority().equals("ROLE_USER")){
				try{
					redirectStrategy.sendRedirect(request, response, "/customer/servicelist");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}else if(authority.getAuthority().equals("ROLE_ADMIN")){
				try{
					redirectStrategy.sendRedirect(request, response, "/admin/adminhome");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}else if(authority.getAuthority().equals("ROLE_DOCTOR")){
				try{
					redirectStrategy.sendRedirect(request, response, "/doctor/doctorhome");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			
			else{
				throw new IllegalStateException();			
				}
		}));
	}
											
}

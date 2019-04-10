package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cts.dao.LoginDAO;
import com.cts.entity.UserLogin;

@Service("userDetailsService")
public class UserDetailsServiceImp implements UserDetailsService {

  @Autowired
  private LoginDAO loginDAO;

  @Transactional(readOnly = true)
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    UserLogin user = loginDAO.findUserByUsername(username);
    System.out.println(user);
    UserBuilder builder = null;
    if (user != null) {    
      builder = org.springframework.security.core.userdetails.User.withUsername(username);
      builder.password(user.getPassword());
      builder.authorities(user.getAuthority());
      
    } else {
      throw new UsernameNotFoundException("User not found.");
    }
    return builder.build();
  }
}

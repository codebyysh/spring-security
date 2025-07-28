package com.yash.Spring.Security.project.service;

import com.yash.Spring.Security.project.model.Users;
import com.yash.Spring.Security.project.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo repo ;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByUsername(username) ;
        if ( user == null ){
            System.out.println("User Not in the databse or not found ");
            throw new UsernameNotFoundException("user not found") ;
        }
        return null;
    }
}

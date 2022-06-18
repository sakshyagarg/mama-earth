package com.project.mama.earth.service;

import com.project.mama.earth.exception.UserNotFoundException;
import com.project.mama.earth.model.User;
import com.project.mama.earth.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private AuthRepository authRepository;

    public UserDetails loadUserByUsername(String username) throws UserNotFoundException {
        User user = authRepository.findByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("No User Found " + username));
        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), true, true, true,
                true, getAuthorites("ROLE_USER"));
    }

    private Collection<? extends GrantedAuthority> getAuthorites(String role_user) {
        return Collections.singleton(new SimpleGrantedAuthority(role_user));
    }

}


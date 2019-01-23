package com.greenfox.project_phase_practice.servicies;

import com.greenfox.project_phase_practice.models.CustomUserDetails;
import com.greenfox.project_phase_practice.models.Users;
import com.greenfox.project_phase_practice.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {

  private UsersRepository usersRepository;

  @Autowired
  public CustomUserDetailService(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<Users> optionalUsers = usersRepository.findByName(username);

    optionalUsers
        .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
    return optionalUsers
        .map(CustomUserDetails::new).get();
  }
}

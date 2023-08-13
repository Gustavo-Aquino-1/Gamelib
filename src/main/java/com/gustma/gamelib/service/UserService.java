package com.gustma.gamelib.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gustma.gamelib.dto.UserDto;
import com.gustma.gamelib.model.User;
import com.gustma.gamelib.repository.UserRepository;

@Service
public class UserService {
  @Autowired
  private UserRepository repo;
  
  public List<User> get() {
    return repo.findAll();
  }
  
  public User create(UserDto userDto) {
    User newUser = new User(userDto.getUsername(), userDto.getPassword());
    return repo.save(newUser);
  }
}

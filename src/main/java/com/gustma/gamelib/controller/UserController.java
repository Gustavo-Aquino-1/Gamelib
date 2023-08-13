package com.gustma.gamelib.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gustma.gamelib.dto.UserDto;
import com.gustma.gamelib.model.User;
import com.gustma.gamelib.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService service;
  
  @GetMapping(produces="application/json")
  public ResponseEntity<List<User>> get() {
    return ResponseEntity.status(200).body(service.get());
  }
  
  @PostMapping(consumes="application/json", produces="application/json")
  public ResponseEntity<User> create(@Valid @RequestBody UserDto userDto) {
    return ResponseEntity.status(201).body(service.create(userDto));
  }
  
}

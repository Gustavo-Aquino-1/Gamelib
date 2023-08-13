package com.gustma.gamelib.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gustma.gamelib.dto.AvaliationDto;
import com.gustma.gamelib.dto.AvaliationUpdateDto;
import com.gustma.gamelib.dto.GameDto;
import com.gustma.gamelib.model.Game;
import com.gustma.gamelib.service.GameService;

@RestController
@RequestMapping("/game")
public class GameController {
  private final String JSON = "application/json";
  
  @Autowired
  private GameService service;
  
  @GetMapping(produces=JSON)
  public List<Game> get() {
    return service.get();
  }
  
  @PostMapping(consumes=JSON, produces=JSON)
  public ResponseEntity<Game> create(@Valid @RequestBody GameDto gameDto) {
    return ResponseEntity.status(201).body(service.create(gameDto));
  }
  
  @PostMapping(value ="/rate",consumes=JSON, produces=JSON)
  public ResponseEntity<Game> createAvaliation(@Valid @RequestBody AvaliationDto avaliationDto) {
    service.createAvaliation(avaliationDto);
    return ResponseEntity.status(200).build();
  }
  
  @PutMapping(value ="/rate/{id}",consumes=JSON, produces=JSON)
  public ResponseEntity<?> updateAvaliation(@Valid @RequestBody AvaliationUpdateDto avaliationUpdateDto, @PathVariable("id") Integer id) {
    service.updateAvaliation(id, avaliationUpdateDto);
    return ResponseEntity.status(200).build();
  }
}

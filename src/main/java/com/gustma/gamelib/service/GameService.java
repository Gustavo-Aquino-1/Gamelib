package com.gustma.gamelib.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gustma.gamelib.dto.AvaliationDto;
import com.gustma.gamelib.dto.AvaliationUpdateDto;
import com.gustma.gamelib.dto.GameDto;
import com.gustma.gamelib.model.Avaliation;
import com.gustma.gamelib.model.Game;
import com.gustma.gamelib.model.User;
import com.gustma.gamelib.repository.AvaliationRepository;
import com.gustma.gamelib.repository.GameRepository;
import com.gustma.gamelib.repository.UserRepository;

@Service
public class GameService {
  @Autowired
  private GameRepository repo;
  
  @Autowired
  private UserRepository repoUser;
  
  @Autowired
  private AvaliationRepository repoAvaliation;
  
  public List<Game> get() {
    return repo.findAll();
  }
  
  public Game create(GameDto gameDto) {
    Game newGame = new Game(gameDto);
    return repo.save(newGame);
  }
  
  public void createAvaliation(AvaliationDto avaliationDto) {
    List<Avaliation> avaliations = repoAvaliation.findAll();
    User user = repoUser.findById(avaliationDto.getUserId()).get();
    Game game = repo.findById(avaliationDto.getGameId()).get();
    Avaliation findAv = null;
    for(Avaliation av: avaliations) {
      // ja existe avaliação no nome desse usuario
      if(av.getUser().getId() == user.getId() && av.getGame().getId() == game.getId()) {
        findAv = av;
      }
    }
    
    if(findAv == null) {
      Avaliation newAvaliation = new Avaliation(game, user, avaliationDto.getRate(), avaliationDto.getDescription());
      repoAvaliation.save(newAvaliation);
    }
  }
  
  public void updateAvaliation(Integer id, AvaliationUpdateDto avaliationUpdateDto) {
    if(repoAvaliation.existsById(id)) {
      Avaliation avaliation = repoAvaliation.findById(id).get();
      avaliation.setRate(avaliationUpdateDto.getRate());
      avaliation.setDescription(avaliationUpdateDto.getDescription());
      repoAvaliation.save(avaliation);
    }
  }
}

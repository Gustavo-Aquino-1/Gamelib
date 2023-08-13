package com.gustma.gamelib.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Avaliation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @ManyToOne
  @JoinColumn(name="game_id")
  @JsonIgnoreProperties({ "avaliations", "name", "image", "creator", "releaseYear", "description"})
  private Game game;
  
  @ManyToOne
  @JoinColumn(name="user_id")
  @JsonIgnoreProperties({"avaliations", "password"})
  private User user;
  
  private Integer rate;
  
  private String description;
  

  public Avaliation(Game game, User user, Integer rate, String description) {
    this.game = game;
    this.user = user;
    this.rate = rate;
    this.description = description;
  }

  public Avaliation() {}

  public Game getGame() {
    return game;
  }

  public void setGame(Game game) {
    this.game = game;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}

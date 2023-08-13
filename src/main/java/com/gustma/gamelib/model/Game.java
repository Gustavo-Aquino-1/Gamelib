package com.gustma.gamelib.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.gustma.gamelib.dto.GameDto;

@Entity
public class Game {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(unique=true)
  private String name;
  
  private String creator;
  
  private String image;
  
  private Integer releaseYear;
  
  private String description;
  
  private Integer quantityPlayers;
  
  private boolean isMultiplayer;
  
  @OneToMany(mappedBy="game", cascade= CascadeType.ALL, orphanRemoval = true)
  private List<Avaliation> avaliations = new ArrayList<Avaliation>();
  
  public Game() {}

  public Game(String name, String creator, String image, Integer releaseYear, String description,
      Integer quantityPlayers, boolean isMultiplayer) {
    this.name = name;
    this.creator = creator;
    this.image = image;
    this.releaseYear = releaseYear;
    this.description = description;
    this.quantityPlayers = quantityPlayers;
    this.isMultiplayer = isMultiplayer;
  }
  
  public Game(GameDto gameDto) {
    this.name = gameDto.getName();
    this.creator = gameDto.getCreator();
    this.image = gameDto.getImage();
    this.description = gameDto.getDescription();
    this.releaseYear = gameDto.getReleaseYear();
    this.quantityPlayers = gameDto.getQuantityPlayers();
    this.isMultiplayer = gameDto.isMultiplayer();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Integer getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(Integer releaseYear) {
    this.releaseYear = releaseYear;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getQuantityPlayers() {
    return quantityPlayers;
  }

  public void setQuantityPlayers(Integer quantityPlayers) {
    this.quantityPlayers = quantityPlayers;
  }

  public boolean isMultiplayer() {
    return isMultiplayer;
  }

  public void setMultiplayer(boolean isMultiplayer) {
    this.isMultiplayer = isMultiplayer;
  }

  public List<Avaliation> getAvaliations() {
    return avaliations;
  }

  public void setAvaliations(List<Avaliation> avaliations) {
    this.avaliations = avaliations;
  }
    
//  public void addAvaliation(Avaliation av) {
//    this.avaliations.add(av);
//  }
}

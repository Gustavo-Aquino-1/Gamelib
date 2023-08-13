package com.gustma.gamelib.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class GameDto {  
  @NotBlank
  @NotNull
  @Size(min=2)
  private String name;
  
  @NotBlank
  @NotNull
  @Size(min=2)
  private String creator;
  
  @NotBlank
  @NotNull
  @Size(min=2)
  private String image;
  
  @NotNull
  private Integer releaseYear;
  
  @NotBlank
  @NotNull
  @Size(min=2)
  private String description;
  
  @NotNull
  private Integer quantityPlayers;
  
  @NotNull
  private boolean isMultiplayer;

  public GameDto(@NotBlank @NotNull @Size(min = 2) String name,
      @NotBlank @NotNull @Size(min = 2) String creator,
      @NotBlank @NotNull @Size(min = 2) String image, @NotNull Integer releaseYear,
      @NotBlank @NotNull @Size(min = 2) String description,
      @NotNull Integer quantityPlayers,@NotNull boolean isMultiplayer) {
    this.name = name;
    this.creator = creator;
    this.image = image;
    this.releaseYear = releaseYear;
    this.description = description;
    this.quantityPlayers = quantityPlayers;
    this.isMultiplayer = isMultiplayer;
  }
  
  public GameDto() {}

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
}

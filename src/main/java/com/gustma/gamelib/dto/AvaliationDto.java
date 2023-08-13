package com.gustma.gamelib.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AvaliationDto { 
  @NotNull
  private Integer gameId;
  
  @NotNull
  private Integer userId;
  
  @NotNull
  private Integer rate;
  
  @NotNull
  @NotBlank
  @Size(min=2)
  private String description;
  
  public AvaliationDto() {}

  public AvaliationDto(@NotNull Integer gameId, @NotNull Integer userId, @NotNull Integer rate,
      @NotNull @NotBlank @Size(min = 2) String description) {
    this.gameId = gameId;
    this.userId = userId;
    this.rate = rate;
    this.description = description;
  }

  public Integer getGameId() {
    return gameId;
  }

  public void setGameId(Integer gameId) {
    this.gameId = gameId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
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

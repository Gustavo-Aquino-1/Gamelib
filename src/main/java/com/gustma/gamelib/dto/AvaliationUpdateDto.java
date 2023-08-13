package com.gustma.gamelib.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AvaliationUpdateDto { 
  @NotNull
  private Integer rate;
  
  @NotNull
  @NotBlank
  @Size(min=2)
  private String description;
  
  public AvaliationUpdateDto() {}

  public AvaliationUpdateDto(@NotNull Integer rate,
      @NotNull @NotBlank @Size(min = 2) String description) {
    this.rate = rate;
    this.description = description;
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

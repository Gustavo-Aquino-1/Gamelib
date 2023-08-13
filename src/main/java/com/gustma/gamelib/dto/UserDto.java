package com.gustma.gamelib.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {
  @NotBlank
  @NotNull
  @Size(min=3)
  private String username;
  
  @NotBlank
  @NotNull
  @Size(min=8)
  private String password;
  
  public UserDto(@NotBlank @NotNull @Size(min=3) String username,
      @NotBlank @NotNull @Size(min=8) String password) {
    this.username = username;
    this.password = password;
  }

  public UserDto() {}

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

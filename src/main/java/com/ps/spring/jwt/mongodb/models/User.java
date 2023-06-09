package com.ps.spring.jwt.mongodb.models;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "users")
@Data
public class User {
  @Id
  private String id;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 120)
  private String password;
  
  @NotBlank
  @Size(max = 50)
  @Email
  private String email;
  
  @Size(min = 10, max = 10)
  private String mobileNum;

  @DBRef
  private Set<Role> roles = new HashSet<>();

  public User() {
  }

  public User(String username,  String password,String email,String mobileNum) {
    this.username = username;
    this.password = password;
    this.email= email;
    this.mobileNum= mobileNum;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobileNum() {
	return mobileNum;
}

public void setMobileNum(String mobileNum) {
	this.mobileNum = mobileNum;
}
  
}

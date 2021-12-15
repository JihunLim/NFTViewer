package com.nouvelle.nftviewer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.h2.engine.UserBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

//@Table(name = "USER")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
 
  // @Column(name = "FIRST_NAME")
   @Column(length = 20, nullable = false)
   private String firstName;
 
   @Column(length = 20, nullable = false)
   private String lastName;
 
   @Column(length = 30, nullable = false, unique = true)
   private String email;

   @Column(length = 20, nullable = false)
   private String phone;
   
   @Builder
   public User(String firstName, String lastName, String email, String phone) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.phone = phone;
   }
   
}

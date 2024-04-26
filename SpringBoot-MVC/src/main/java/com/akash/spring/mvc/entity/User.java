package com.akash.spring.mvc.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "user_dtls")
public class User implements Serializable{
	
	@Id
	private String email;
	private String name;
	private String password;
	private long contact;
	
	
	
	
}

package com.brubatera.concessionaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(max = 50)
	private String name;

	@NotNull
	@Size(max = 11)
	private String cpf;

	@NotNull
	@Size(max = 3)
	private String age;

	@NotNull
	@Size(max = 80)
	private String address;

	@NotNull
	@Size(max = 10)
	private String phone;

	@NotNull
	@Size(max = 30)
	private String mail;
}

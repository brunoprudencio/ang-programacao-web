package com.brubatera.concessionaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AutomobileServicing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type;
	private String service;
	private String customerCPF;
	private String automobileModel;
	private String automobileBrand;
	private String automobileReleaseYear;

}

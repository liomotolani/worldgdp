package com.myspringproject.worldgdp.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class City {
	
	@NotNull
	private Long id;
	
	@NotNull
	@Size(max=35)
	private String name;
	
	@NotNull
	@Size(min = 3, max = 3)
	private String countrycode;
	
	private Country country;
	
	@NotNull
	@Size(max=20)
	private String district;
	
	@NotNull
	private Long population;

}

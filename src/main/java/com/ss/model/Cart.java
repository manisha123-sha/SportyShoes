package com.ss.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cart {
	
	@Id
	private Integer id;
	private Integer productId;
	private Integer quantity;
	private Float size;
	private Float price;
	
}

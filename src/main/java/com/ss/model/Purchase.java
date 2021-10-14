package com.ss.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.ss.model.Customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Purchase {
	@Id
	private Integer id;
	private Float size;
	private Date dop;
	private Integer quantity;
	private Float totalcost;
	private Integer productid;
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;
	
}

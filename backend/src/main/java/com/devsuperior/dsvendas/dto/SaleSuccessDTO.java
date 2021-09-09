package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String SellerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO() {
	}



	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		SellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}



	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}



	public Long getVisited() {
		return visited;
	}



	public void setVisited(Long visited) {
		this.visited = visited;
	}



	public Long getDeals() {
		return deals;
	}



	public void setDeals(Long deals) {
		this.deals = deals;
	}



	
}

package com.app.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.app.dto.AddressDto;
import com.app.dto.ProductDto;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	
	private LocalDate orderDate;
	
	private String orderStatus;
	
	private Double total;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_order",joinColumns = @JoinColumn(name="order_id", referencedColumnName = "orderId"))
	private Customer customer;
	
	@ElementCollection
	@CollectionTable(name="product_order", joinColumns = @JoinColumn(name="order_id", referencedColumnName = "orderId"))
	private List<ProductDto> pList = new ArrayList<>();
	
	@Embedded
	private AddressDto orderAddress;
	 	
	public Orders(LocalDate orderDate, String orderStatus, Customer customer, List<ProductDto> pList,
			AddressDto orderAddress) {
		super();
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.customer = customer;
		this.pList = pList;
		this.orderAddress = orderAddress;
	}
	
	
	
	
}



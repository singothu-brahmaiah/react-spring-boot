package com.reactive.webclient.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private String id;
    private String name;
    private int qty;
    private double price;

}

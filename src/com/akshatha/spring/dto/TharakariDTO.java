package com.akshatha.spring.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TharakariDTO {
private String name;
private Double quantity;
private String price;
private String type;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date deliveryDate;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getQuantity() {
	return quantity;
}
public void setQuantity(Double quantity) {
	this.quantity = quantity;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Date getDeliveryDate() {
	return deliveryDate;
}
public void setDeliveryDate(Date deliveryDate) {
	this.deliveryDate = deliveryDate;
}
@Override
public String toString() {
	return "TharakariDTO [name=" + name + ", quantity=" + quantity + ", price=" + price + ", type=" + type
			+ ", deliveryDate=" + deliveryDate + "]";
}
}

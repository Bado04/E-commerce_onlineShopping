package com.order.orderService.Common;

import com.order.orderService.Entity.Order;

public class TransactionRequest {

	private Order order;
    private Payment payment;
	public TransactionRequest(Order order, Payment payment) {
		super();
		this.order = order;
		this.payment = payment;
	}
	public TransactionRequest() {
		super();
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
    
}
